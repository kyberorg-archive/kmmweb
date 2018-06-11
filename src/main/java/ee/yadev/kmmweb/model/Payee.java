package ee.yadev.kmmweb.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Database table kmmPayees
 *
 * @since 1.0
 */
@Entity
@Data
@Table(name = "kmmPayees")
public class Payee {
    @Id
    private String id;

    private String name;
    private String reference;
    private String email;

    private String addressStreet;
    private String addressCity;
    private String addressZipcode;
    private String addressState;

    private String telephone;
    private String notes;

    private String defaultAccountId;

    private int matchData;
    private char matchIgnoreCase;

    private String matchKeys;

}
