package it.clevercom.echo.hibernate.rd.postgresql.entity;
// Generated 27-apr-2017 10.34.01 by Hibernate Tools 5.2.2.Final


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * PatientCodingActor generated by hbm2java
 */
@Entity
@Table(name="rd_patient_coding_actor"
    , uniqueConstraints = @UniqueConstraint(columnNames={"idpatient", "idcodingactor"}) 
)
public class PatientCodingActor  implements java.io.Serializable {


     private Long idpatientcodingactor;
     private CodingActor codingActor;
     private Patient patient;
     private String externalcode;

    public PatientCodingActor() {
    }

	
    public PatientCodingActor(CodingActor codingActor, Patient patient) {
        this.codingActor = codingActor;
        this.patient = patient;
    }
    public PatientCodingActor(CodingActor codingActor, Patient patient, String externalcode) {
       this.codingActor = codingActor;
       this.patient = patient;
       this.externalcode = externalcode;
    }
   
     @GenericGenerator(name="generator", strategy="org.hibernate.id.enhanced.SequenceStyleGenerator", parameters={@Parameter(name="optimizer", value="none"), @Parameter(name="sequence_name", value="patient_coding_actor_idpatientcodingactor_seq"), @Parameter(name="increment_size", value="1")})@Id @GeneratedValue(generator="generator")

    
    @Column(name="idpatientcodingactor", unique=true, nullable=false)
    public Long getIdpatientcodingactor() {
        return this.idpatientcodingactor;
    }
    
    public void setIdpatientcodingactor(Long idpatientcodingactor) {
        this.idpatientcodingactor = idpatientcodingactor;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idcodingactor", nullable=false)
    public CodingActor getCodingActor() {
        return this.codingActor;
    }
    
    public void setCodingActor(CodingActor codingActor) {
        this.codingActor = codingActor;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idpatient", nullable=false)
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




}


