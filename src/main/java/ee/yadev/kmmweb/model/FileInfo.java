package ee.yadev.kmmweb.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;


/**
 * kmmFileInfo database
 *
 * @since 1.0
 */
@Entity
@Data
@Table(name = "kmmFileInfo")
public class FileInfo {

    @Id
    @Column(name = "ROWID")
    private String rowId;

    private String version;

    private Date created;
    private Date lastModified;

    private String baseCurrency;

    private Long institutions;
    private Long accounts;
    private Long payees;
    private Long tags;
    private Long transactions;
    private Long splits;
    private Long securities;
    private Long prices;
    private Long currencies;
    private Long schedules;
    private Long reports;
    private Long kvps;

    private Date dateRangeStart;
    private Date dateRangeEnd;

    private Long hiInstitutionId;
    private Long hiPayeeId;
    private Long hiTagId;
    private Long hiAccountId;
    private Long hiTransactionId;
    private Long hiScheduleId;
    private Long hiSecurityId;
    private Long hiReportId;

    private String encryptData;
    private boolean updateInProgress;

    private Long budgets;
    private Long hiBudgetId;

    private String logonUser;
    private Timestamp logonAt;
    private Integer fixLevel;
}
