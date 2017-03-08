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
 * CodingActor generated by hbm2java
 */
@Entity
@Table(name="rd_coding_actor"
)
public class CodingActor  implements java.io.Serializable {


     private Long idcodingactor;
     private String name;
     private Date created;
     private String updated;
     private String userupdate;
     private boolean active;
     private Set<ServiceCodingActor> serviceCodingActors = new HashSet<ServiceCodingActor>(0);
     private Set<PatientCodingActor> patientCodingActors = new HashSet<PatientCodingActor>(0);

    public CodingActor() {
    }

	
    public CodingActor(String name, Date created, String updated, String userupdate, boolean active) {
        this.name = name;
        this.created = created;
        this.updated = updated;
        this.userupdate = userupdate;
        this.active = active;
    }
    public CodingActor(String name, Date created, String updated, String userupdate, boolean active, Set<ServiceCodingActor> serviceCodingActors, Set<PatientCodingActor> patientCodingActors) {
       this.name = name;
       this.created = created;
       this.updated = updated;
       this.userupdate = userupdate;
       this.active = active;
       this.serviceCodingActors = serviceCodingActors;
       this.patientCodingActors = patientCodingActors;
    }
   
     @GenericGenerator(name="generator", strategy="org.hibernate.id.enhanced.SequenceStyleGenerator", parameters={@Parameter(name="optimizer", value="none"), @Parameter(name="sequence_name", value="coding_actor_idcodingactor_seq"), @Parameter(name="increment_size", value="1")})@Id @GeneratedValue(generator="generator")

    
    @Column(name="idcodingactor", unique=true, nullable=false)
    public Long getIdcodingactor() {
        return this.idcodingactor;
    }
    
    public void setIdcodingactor(Long idcodingactor) {
        this.idcodingactor = idcodingactor;
    }

    
    @Column(name="name", nullable=false, length=100)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created", nullable=false, length=29)
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }

    
    @Column(name="updated", nullable=false, length=100)
    public String getUpdated() {
        return this.updated;
    }
    
    public void setUpdated(String updated) {
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="codingActor")
    public Set<ServiceCodingActor> getServiceCodingActors() {
        return this.serviceCodingActors;
    }
    
    public void setServiceCodingActors(Set<ServiceCodingActor> serviceCodingActors) {
        this.serviceCodingActors = serviceCodingActors;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="codingActor")
    public Set<PatientCodingActor> getPatientCodingActors() {
        return this.patientCodingActors;
    }
    
    public void setPatientCodingActors(Set<PatientCodingActor> patientCodingActors) {
        this.patientCodingActors = patientCodingActors;
    }




}

