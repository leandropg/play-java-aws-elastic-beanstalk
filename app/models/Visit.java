package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Visit
 */
@Entity
public class Visit extends Model {

    /**
     * Id
     */
    @Id
    private Integer id;

    /**
     * IP Address
     */
    private String ipAddress;

    /**
     * Timestamp
     */
    private Long timestamp;

    /**
     * Find Object
     */
    public static Finder<Integer, Visit> find = new Finder<>(Visit.class);

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}