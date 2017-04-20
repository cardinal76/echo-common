package it.clevercom.echo.hibernate.rd.postgresql.entity;
// Generated 19-apr-2017 22.11.14 by Hibernate Tools 5.2.2.Final


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Maritalstatus generated by hbm2java
 */
@Entity
@Table(name="rd_maritalstatus"
)
public class Maritalstatus  implements java.io.Serializable {


     private Long idmaritalstatus;
     private String hl7code;
     private String description;
     private Set<Patient> patients = new HashSet<Patient>(0);

    public Maritalstatus() {
    }

	
    public Maritalstatus(String hl7code, String description) {
        this.hl7code = hl7code;
        this.description = description;
    }
    public Maritalstatus(String hl7code, String description, Set<Patient> patients) {
       this.hl7code = hl7code;
       this.description = description;
       this.patients = patients;
    }
   
     @GenericGenerator(name="generator", strategy="org.hibernate.id.enhanced.SequenceStyleGenerator", parameters={@Parameter(name="optimizer", value="none"), @Parameter(name="sequence_name", value="maritalstatus_idmaritalstatus_seq"), @Parameter(name="increment_size", value="1")})@Id @GeneratedValue(generator="generator")

    
    @Column(name="idmaritalstatus", unique=true, nullable=false)
    public Long getIdmaritalstatus() {
        return this.idmaritalstatus;
    }
    
    public void setIdmaritalstatus(Long idmaritalstatus) {
        this.idmaritalstatus = idmaritalstatus;
    }

    
    @Column(name="hl7code", nullable=false, length=5)
    public String getHl7code() {
        return this.hl7code;
    }
    
    public void setHl7code(String hl7code) {
        this.hl7code = hl7code;
    }

    
    @Column(name="description", nullable=false, length=100)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="maritalstatus")
    public Set<Patient> getPatients() {
        return this.patients;
    }
    
    public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }




}


