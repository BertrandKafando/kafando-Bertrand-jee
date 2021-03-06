package ma.enset.apspringetudiant.security.repositories;

import ma.enset.apspringetudiant.security.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,String> {
    AppUser findByUsername(String username);

}
