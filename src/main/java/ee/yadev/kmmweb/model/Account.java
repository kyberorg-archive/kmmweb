package ee.yadev.kmmweb.model;

import javax.persistence.*;

@Entity
@Table(name = "kmmAccounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "accountTypeString")
    private String accountTypeString;

    public String getAccountName() {
        return accountTypeString;
    }
}
