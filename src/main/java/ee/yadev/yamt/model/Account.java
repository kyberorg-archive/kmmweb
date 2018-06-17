package ee.yadev.yamt.model;

import javax.persistence.*;

@Entity
@Table(name = "kmmAccounts")
public class Account {

    @Id
    private String id;

    @Column(name = "accountTypeString")
    private String accountTypeString;

    private String institutionId;
    private String parentId;

    private String lastReconciled;
    private String lastModified;

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
