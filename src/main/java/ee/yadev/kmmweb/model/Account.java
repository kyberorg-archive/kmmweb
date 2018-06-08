package ee.yadev.kmmweb.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "kmmAccounts")
public class Account {

    @Id
    private String id;

    @Column(name = "accountTypeString")
    private String accountTypeString;

    private String institutionId;
    private String parentId;

    //FIXME Timestamp
    private String lastReconciled;
    private String lastModified;

    //FIXME unparseable Data
    private String openingDate;

    private String accountNumber;
    private String accountType;

    private boolean isStockAccount;
    private String accountName;

    private String description;

    private String currencyId;

    private String balance;
    private String balanceFormatted;

    private Long transactionCount;

    public String getAccountName() {
        return accountName;
    }
}
