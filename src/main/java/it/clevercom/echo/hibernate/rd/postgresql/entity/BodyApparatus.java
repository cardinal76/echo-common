package it.clevercom.echo.hibernate.rd.postgresql.entity;
// Generated 11-apr-2017 13.42.44 by Hibernate Tools 5.2.2.Final


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * BodyApparatus generated by hbm2java
 */
@Entity
@Table(name="rd_body_apparatus"
)
public class BodyApparatus  implements java.io.Serializable {


     private Long idbodyapparatus;
     private char code;
     private String description;
     private Date created;
     private Date updated;
     private String userupdate;
     private Boolean active;
     private Set<Service> services = new HashSet<Service>(0);

    public BodyApparatus() {
    }

	
    public BodyApparatus(char code, String description, Date created, Date updated, String userupdate, Boolean active) {
        this.code = code;
        this.description = description;
        this.created = created;
        this.updated = updated;
        this.userupdate = userupdate;
        this.active = active;
    }
    public BodyApparatus(char code, String description, Date created, Date updated, String userupdate, Boolean active, Set<Service> services) {
       this.code = code;
       this.description = description;
       this.created = created;
       this.updated = updated;
       this.userupdate = userupdate;
       this.active = active;
       this.services = services;
    }
   
     @GenericGenerator(name="generator", strategy="org.hibernate.id.enhanced.SequenceStyleGenerator", parameters={@Parameter(name="optimizer", value="none"), @Parameter(name="sequence_name", value="body_apparatus_idbodyapparatus_seq"), @Parameter(name="increment_size", value="1")})@Id @GeneratedValue(generator="generator")

    
    @Column(name="idbodyapparatus", unique=true, nullable=false)
    public Long getIdbodyapparatus() {
        return this.idbodyapparatus;
    }
    
    public void setIdbodyapparatus(Long idbodyapparatus) {
        this.idbodyapparatus = idbodyapparatus;
    }

    
    @Column(name="code", nullable=false, length=1)
    public char getCode() {
        return this.code;
    }
    
    public void setCode(char code) {
        this.code = code;
    }

    
    @Column(name="description", nullable=false)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="bodyApparatus")
    public Set<Service> getServices() {
        return this.services;
    }
    
    public void setServices(Set<Service> services) {
        this.services = services;
    }




}


