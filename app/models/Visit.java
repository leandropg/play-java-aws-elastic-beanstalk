package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

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
     * Visit Date
     */
    private Date visitDate;

    /**
     * Find All Descending
     */
    public static List<Visit> findAllDescending() {

        Finder finder;

        // Obtain Finder
        finder = new Finder<Integer, Visit>(Visit.class);

        // Obtain Visit Order Descending
        return finder.query().orderBy("id DESC").findList();
    }

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

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }
}