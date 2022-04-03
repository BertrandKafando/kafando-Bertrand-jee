package ma.enset.web.sec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        PasswordEncoder passwordEncoder=passwordEncoder();
       /* auth.inMemoryAuthentication()
                .withUser("user").password(passwordEncoder.encode("1234")).roles("USER","ADMIN");
        auth.inMemoryAuthentication()
                .withUser("user1").password(passwordEncoder.encode("1234")).roles("USER");
        //non encoder
        System.out.println(passwordEncoder.encode("1234"));
        auth.inMemoryAuthentication()
                .withUser("user2").password("{noop}1234").roles("USER");

        */

        auth.jdbcAuthentication()
                .dataSource(dataSource)
                //recup user
                .usersByUsernameQuery("select username as principal , password as credentials,active from users where username=?")
                //recup role
                .authoritiesByUsernameQuery("select username as principal ,roles as role from users_roles where username=?")
                .rolePrefix("ROLE_")
                //algorithime
                .passwordEncoder(passwordEncoder);


    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http.formLogin();
        http.authorizeRequests().antMatchers("/").permitAll();
       http.authorizeRequests().antMatchers("/delete/**","/edit/**",
               "/save/**","/formPatients/**").hasRole("ADMIN");
       http.authorizeRequests().antMatchers("/index/**").hasRole("USER");

       http.exceptionHandling().accessDeniedPage("/403");

    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
