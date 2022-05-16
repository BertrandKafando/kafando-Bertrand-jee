package ma.enset.bank_api.dtos;

import lombok.Data;
import ma.enset.bank_api.entities.BankAccount;
import ma.enset.bank_api.enums.AccountStatus;

import java.util.Date;

@Data
public class SavingAccountDto extends BankAccountDto {
    private String id;
    private double balance;
    private Date createAt;
    private AccountStatus status;
    private CustomerDto customer;
    private double interestRate;
}
