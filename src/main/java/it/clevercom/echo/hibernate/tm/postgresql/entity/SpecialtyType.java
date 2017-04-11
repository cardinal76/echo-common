package it.clevercom.echo.hibernate.tm.postgresql.entity;
// Generated 11-apr-2017 13.43.21 by Hibernate Tools 5.2.2.Final


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SpecialtyType generated by hbm2java
 */
@Entity
@Table(name="tm_specialty_type"
)
public class SpecialtyType  implements java.io.Serializable {


     private Long idspecialtytype;
     private SpecialtyType specialtyType;
     private String description;
     private String diagnosticortherapeutic;
     private String surgicalorinternal;
     private String patientagerange;
     private String organortechnique;
     private Date created;
     private Date updated;
     private boolean active;
     private String updateuser;
     private Set<Physician> physicians = new HashSet<Physician>(0);
     private Set<SpecialtyType> specialtyTypes = new HashSet<SpecialtyType>(0);

    public SpecialtyType() {
    }

	
    public SpecialtyType(Long idspecialtytype, SpecialtyType specialtyType, Date created, Date updated, boolean active, String updateuser) {
        this.idspecialtytype = idspecialtytype;
        this.specialtyType = specialtyType;
        this.created = created;
        this.updated = updated;
        this.active = active;
        this.updateuser = updateuser;
    }
    public SpecialtyType(Long idspecialtytype, SpecialtyType specialtyType, String description, String diagnosticortherapeutic, String surgicalorinternal, String patientagerange, String organortechnique, Date created, Date updated, boolean active, String updateuser, Set<Physician> physicians, Set<SpecialtyType> specialtyTypes) {
       this.idspecialtytype = idspecialtytype;
       this.specialtyType = specialtyType;
       this.description = description;
       this.diagnosticortherapeutic = diagnosticortherapeutic;
       this.surgicalorinternal = surgicalorinternal;
       this.patientagerange = patientagerange;
       this.organortechnique = organortechnique;
       this.created = created;
       this.updated = updated;
       this.active = active;
       this.updateuser = updateuser;
       this.physicians = physicians;
       this.specialtyTypes = specialtyTypes;
    }
   
     @Id 

    
    @Column(name="idspecialtytype", unique=true, nullable=false)
    public Long getIdspecialtytype() {
        return this.idspecialtytype;
    }
    
    public void setIdspecialtytype(Long idspecialtytype) {
        this.idspecialtytype = idspecialtytype;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="parentid", nullable=false)
    public SpecialtyType getSpecialtyType() {
        return this.specialtyType;
    }
    
    public void setSpecialtyType(SpecialtyType specialtyType) {
        this.specialtyType = specialtyType;
    }

    
    @Column(name="description", length=100)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="diagnosticortherapeutic")
    public String getDiagnosticortherapeutic() {
        return this.diagnosticortherapeutic;
    }
    
    public void setDiagnosticortherapeutic(String diagnosticortherapeutic) {
        this.diagnosticortherapeutic = diagnosticortherapeutic;
    }

    
    @Column(name="surgicalorinternal")
    public String getSurgicalorinternal() {
        return this.surgicalorinternal;
    }
    
    public void setSurgicalorinternal(String surgicalorinternal) {
        this.surgicalorinternal = surgicalorinternal;
    }

    
    @Column(name="patientagerange")
    public String getPatientagerange() {
        return this.patientagerange;
    }
    
    public void setPatientagerange(String patientagerange) {
        this.patientagerange = patientagerange;
    }

    
    @Column(name="organortechnique")
    public String getOrganortechnique() {
        return this.organortechnique;
    }
    
    public void setOrganortechnique(String organortechnique) {
        this.organortechnique = organortechnique;
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

    
    @Column(name="active", nullable=false)
    public boolean isActive() {
        return this.active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }

    
    @Column(name="updateuser", nullable=false, length=100)
    public String getUpdateuser() {
        return this.updateuser;
    }
    
    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser;
    }

@ManyToMany(fetch=FetchType.LAZY, mappedBy="specialtyTypes")
    public Set<Physician> getPhysicians() {
        return this.physicians;
    }
    
    public void setPhysicians(Set<Physician> physicians) {
        this.physicians = physicians;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="specialtyType")
    public Set<SpecialtyType> getSpecialtyTypes() {
        return this.specialtyTypes;
    }
    
    public void setSpecialtyTypes(Set<SpecialtyType> specialtyTypes) {
        this.specialtyTypes = specialtyTypes;
    }




}


