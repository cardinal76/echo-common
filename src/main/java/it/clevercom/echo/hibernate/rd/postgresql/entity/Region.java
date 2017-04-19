package it.clevercom.echo.hibernate.rd.postgresql.entity;
// Generated 18-apr-2017 16.29.28 by Hibernate Tools 5.2.2.Final


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Region generated by hbm2java
 */
@Entity
@Table(name="rd_region"
)
public class Region  implements java.io.Serializable {


     private Long idregion;
     private Country country;
     private String regionname;
     private String regionstdcode;
     private Date created;
     private Date updated;
     private String userupdate;
     private Boolean active;
     private Set<Province> provinces = new HashSet<Province>(0);

    public Region() {
    }

	
    public Region(Date created, Date updated, String userupdate, Boolean active) {
        this.created = created;
        this.updated = updated;
        this.userupdate = userupdate;
        this.active = active;
    }
    public Region(Country country, String regionname, String regionstdcode, Date created, Date updated, String userupdate, Boolean active, Set<Province> provinces) {
       this.country = country;
       this.regionname = regionname;
       this.regionstdcode = regionstdcode;
       this.created = created;
       this.updated = updated;
       this.userupdate = userupdate;
       this.active = active;
       this.provinces = provinces;
    }
   
     @GenericGenerator(name="generator", strategy="org.hibernate.id.enhanced.SequenceStyleGenerator", parameters={@Parameter(name="optimizer", value="none"), @Parameter(name="sequence_name", value="region_idregion_seq"), @Parameter(name="increment_size", value="1")})@Id @GeneratedValue(generator="generator")

    
    @Column(name="idregion", unique=true, nullable=false)
    public Long getIdregion() {
        return this.idregion;
    }
    
    public void setIdregion(Long idregion) {
        this.idregion = idregion;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idcountry")
    public Country getCountry() {
        return this.country;
    }
    
    public void setCountry(Country country) {
        this.country = country;
    }

    
    @Column(name="regionname", length=100)
    public String getRegionname() {
        return this.regionname;
    }
    
    public void setRegionname(String regionname) {
        this.regionname = regionname;
    }

    
    @Column(name="regionstdcode", length=10)
    public String getRegionstdcode() {
        return this.regionstdcode;
    }
    
    public void setRegionstdcode(String regionstdcode) {
        this.regionstdcode = regionstdcode;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created", nullable=false, length=29)
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="updated", nullable=false, length=29)
    public Date getUpdated() {
        return this.updated;
    }
    
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    
    @Column(name="userupdate", nullable=false, length=100)
    public String getUserupdate() {
        return this.userupdate;
    }
    
    public void setUserupdate(String userupdate) {
        this.userupdate = userupdate;
    }

    
    @Column(name="active", nullable=false)
    public Boolean getActive() {
        return this.active;
    }
    
    public void setActive(Boolean active) {
        this.active = active;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="region")
    public Set<Province> getProvinces() {
        return this.provinces;
    }
    
    public void setProvinces(Set<Province> provinces) {
        this.provinces = provinces;
    }




}


