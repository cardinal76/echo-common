package it.clevercom.echo.hibernate.tm.postgresql.entity;
// Generated 11-apr-2017 13.43.21 by Hibernate Tools 5.2.2.Final


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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NurseOrganizationunit generated by hbm2java
 */
@Entity
@Table(name="tm_nurse_organizationunit"
)
public class NurseOrganizationunit  implements java.io.Serializable {


     private NurseOrganizationunitId id;
     private Nurse nurse;
     private OrganizationUnit organizationUnit;
     private Date created;
     private Date updated;
     private Boolean active;
     private String updateuser;

    public NurseOrganizationunit() {
    }

	
    public NurseOrganizationunit(NurseOrganizationunitId id, Nurse nurse, OrganizationUnit organizationUnit) {
        this.id = id;
        this.nurse = nurse;
        this.organizationUnit = organizationUnit;
    }
    public NurseOrganizationunit(NurseOrganizationunitId id, Nurse nurse, OrganizationUnit organizationUnit, Date created, Date updated, Boolean active, String updateuser) {
       this.id = id;
       this.nurse = nurse;
       this.organizationUnit = organizationUnit;
       this.created = created;
       this.updated = updated;
       this.active = active;
       this.updateuser = updateuser;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idnurse", column=@Column(name="idnurse", nullable=false) ), 
        @AttributeOverride(name="idorganizationunit", column=@Column(name="idorganizationunit", nullable=false) ) } )
    public NurseOrganizationunitId getId() {
        return this.id;
    }
    
    public void setId(NurseOrganizationunitId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idnurse", nullable=false, insertable=false, updatable=false)
    public Nurse getNurse() {
        return this.nurse;
    }
    
    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idorganizationunit", nullable=false, insertable=false, updatable=false)
    public OrganizationUnit getOrganizationUnit() {
        return this.organizationUnit;
    }
    
    public void setOrganizationUnit(OrganizationUnit organizationUnit) {
        this.organizationUnit = organizationUnit;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created", length=29)
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="updated", length=29)
    public Date getUpdated() {
        return this.updated;
    }
    
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    
    @Column(name="active")
    public Boolean getActive() {
        return this.active;
    }
    
    public void setActive(Boolean active) {
        this.active = active;
    }

    
    @Column(name="updateuser", length=100)
    public String getUpdateuser() {
        return this.updateuser;
    }
    
    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser;
    }




}

