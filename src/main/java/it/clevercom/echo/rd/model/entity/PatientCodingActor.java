package it.clevercom.echo.rd.model.entity;
// Generated 7-mar-2017 22.12.30 by Hibernate Tools 5.2.2.Final


import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PatientCodingActor generated by hbm2java
 */
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name="rd_patient_coding_actor"
)
public class PatientCodingActor  implements java.io.Serializable {


     private PatientCodingActorId id;
     private CodingActor codingActor;
     private Patient patient;
     private String externalcode;
     private Date created;
     private Date updated;
     private String userupdate;
     private boolean active;

    public PatientCodingActor() {
    }

	
    public PatientCodingActor(PatientCodingActorId id, CodingActor codingActor, Patient patient, Date created, Date updated, String userupdate, boolean active) {
        this.id = id;
        this.codingActor = codingActor;
        this.patient = patient;
        this.created = created;
        this.updated = updated;
        this.userupdate = userupdate;
        this.active = active;
    }
    public PatientCodingActor(PatientCodingActorId id, CodingActor codingActor, Patient patient, String externalcode, Date created, Date updated, String userupdate, boolean active) {
       this.id = id;
       this.codingActor = codingActor;
       this.patient = patient;
       this.externalcode = externalcode;
       this.created = created;
       this.updated = updated;
       this.userupdate = userupdate;
       this.active = active;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idpatient", column=@Column(name="idpatient", nullable=false) ), 
        @AttributeOverride(name="idcodingactor", column=@Column(name="idcodingactor", nullable=false) ) } )
    public PatientCodingActorId getId() {
        return this.id;
    }
    
    public void setId(PatientCodingActorId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idcodingactor", nullable=false, insertable=false, updatable=false)
    public CodingActor getCodingActor() {
        return this.codingActor;
    }
    
    public void setCodingActor(CodingActor codingActor) {
        this.codingActor = codingActor;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idpatient", nullable=false, insertable=false, updatable=false)
    public Patient getPatient() {
        return this.patient;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    
    @Column(name="externalcode", length=100)
    public String getExternalcode() {
        return this.externalcode;
    }
    
    public void setExternalcode(String externalcode) {
        this.externalcode = externalcode;
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




}


