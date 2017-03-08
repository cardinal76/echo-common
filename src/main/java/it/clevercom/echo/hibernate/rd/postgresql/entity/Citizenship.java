package it.clevercom.echo.hibernate.rd.postgresql.entity;
// Generated 8-mar-2017 10.59.59 by Hibernate Tools 5.2.2.Final


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
 * Citizenship generated by hbm2java
 */
@Entity
@Table(name="rd_citizenship"
)
public class Citizenship  implements java.io.Serializable {


     private Long idcitizenship;
     private String description;
     private Date created;
     private Date updated;
     private String userupdate;
     private boolean active;
     private Set<Patient> patients = new HashSet<Patient>(0);

    public Citizenship() {
    }

	
    public Citizenship(String description, Date created, Date updated, String userupdate, boolean active) {
        this.description = description;
        this.created = created;
        this.updated = updated;
        this.userupdate = userupdate;
        this.active = active;
    }
    public Citizenship(String description, Date created, Date updated, String userupdate, boolean active, Set<Patient> patients) {
       this.description = description;
       this.created = created;
       this.updated = updated;
       this.userupdate = userupdate;
       this.active = active;
       this.patients = patients;
    }
   
     @GenericGenerator(name="generator", strategy="org.hibernate.id.enhanced.SequenceStyleGenerator", parameters={@Parameter(name="optimizer", value="none"), @Parameter(name="sequence_name", value="citizenship_idcitizenship_seq"), @Parameter(name="increment_size", value="1")})@Id @GeneratedValue(generator="generator")

    
    @Column(name="idcitizenship", unique=true, nullable=false)
    public Long getIdcitizenship() {
        return this.idcitizenship;
    }
    
    public void setIdcitizenship(Long idcitizenship) {
        this.idcitizenship = idcitizenship;
    }

    
    @Column(name="description", nullable=false, length=100)
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
    public boolean isActive() {
        return this.active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="citizenship")
    public Set<Patient> getPatients() {
        return this.patients;
    }
    
    public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }




}

