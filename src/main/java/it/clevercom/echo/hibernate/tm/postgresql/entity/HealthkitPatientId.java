package it.clevercom.echo.hibernate.tm.postgresql.entity;
// Generated 20-apr-2017 6.54.04 by Hibernate Tools 5.2.2.Final


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * HealthkitPatientId generated by hbm2java
 */
@Embeddable
public class HealthkitPatientId  implements java.io.Serializable {


     private Long idhealthkit;
     private Long idpatient;
     private Date assignmentdate;
     private Date restitutiondate;
     private Date created;
     private Date updated;
     private boolean active;
     private String updateuser;

    public HealthkitPatientId() {
    }

	
    public HealthkitPatientId(Long idhealthkit, Long idpatient, Date created, Date updated, boolean active, String updateuser) {
        this.idhealthkit = idhealthkit;
        this.idpatient = idpatient;
        this.created = created;
        this.updated = updated;
        this.active = active;
        this.updateuser = updateuser;
    }
    public HealthkitPatientId(Long idhealthkit, Long idpatient, Date assignmentdate, Date restitutiondate, Date created, Date updated, boolean active, String updateuser) {
       this.idhealthkit = idhealthkit;
       this.idpatient = idpatient;
       this.assignmentdate = assignmentdate;
       this.restitutiondate = restitutiondate;
       this.created = created;
       this.updated = updated;
       this.active = active;
       this.updateuser = updateuser;
    }
   


    @Column(name="idhealthkit", nullable=false)
    public Long getIdhealthkit() {
        return this.idhealthkit;
    }
    
    public void setIdhealthkit(Long idhealthkit) {
        this.idhealthkit = idhealthkit;
    }


    @Column(name="idpatient", nullable=false)
    public Long getIdpatient() {
        return this.idpatient;
    }
    
    public void setIdpatient(Long idpatient) {
        this.idpatient = idpatient;
    }


    @Column(name="assignmentdate", length=29)
    public Date getAssignmentdate() {
        return this.assignmentdate;
    }
    
    public void setAssignmentdate(Date assignmentdate) {
        this.assignmentdate = assignmentdate;
    }


    @Column(name="restitutiondate", length=29)
    public Date getRestitutiondate() {
        return this.restitutiondate;
    }
    
    public void setRestitutiondate(Date restitutiondate) {
        this.restitutiondate = restitutiondate;
    }


    @Column(name="created", nullable=false, length=29)
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }


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


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof HealthkitPatientId) ) return false;
		 HealthkitPatientId castOther = ( HealthkitPatientId ) other; 
         
		 return ( (this.getIdhealthkit()==castOther.getIdhealthkit()) || ( this.getIdhealthkit()!=null && castOther.getIdhealthkit()!=null && this.getIdhealthkit().equals(castOther.getIdhealthkit()) ) )
 && ( (this.getIdpatient()==castOther.getIdpatient()) || ( this.getIdpatient()!=null && castOther.getIdpatient()!=null && this.getIdpatient().equals(castOther.getIdpatient()) ) )
 && ( (this.getAssignmentdate()==castOther.getAssignmentdate()) || ( this.getAssignmentdate()!=null && castOther.getAssignmentdate()!=null && this.getAssignmentdate().equals(castOther.getAssignmentdate()) ) )
 && ( (this.getRestitutiondate()==castOther.getRestitutiondate()) || ( this.getRestitutiondate()!=null && castOther.getRestitutiondate()!=null && this.getRestitutiondate().equals(castOther.getRestitutiondate()) ) )
 && ( (this.getCreated()==castOther.getCreated()) || ( this.getCreated()!=null && castOther.getCreated()!=null && this.getCreated().equals(castOther.getCreated()) ) )
 && ( (this.getUpdated()==castOther.getUpdated()) || ( this.getUpdated()!=null && castOther.getUpdated()!=null && this.getUpdated().equals(castOther.getUpdated()) ) )
 && (this.isActive()==castOther.isActive())
 && ( (this.getUpdateuser()==castOther.getUpdateuser()) || ( this.getUpdateuser()!=null && castOther.getUpdateuser()!=null && this.getUpdateuser().equals(castOther.getUpdateuser()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdhealthkit() == null ? 0 : this.getIdhealthkit().hashCode() );
         result = 37 * result + ( getIdpatient() == null ? 0 : this.getIdpatient().hashCode() );
         result = 37 * result + ( getAssignmentdate() == null ? 0 : this.getAssignmentdate().hashCode() );
         result = 37 * result + ( getRestitutiondate() == null ? 0 : this.getRestitutiondate().hashCode() );
         result = 37 * result + ( getCreated() == null ? 0 : this.getCreated().hashCode() );
         result = 37 * result + ( getUpdated() == null ? 0 : this.getUpdated().hashCode() );
         result = 37 * result + (this.isActive()?1:0);
         result = 37 * result + ( getUpdateuser() == null ? 0 : this.getUpdateuser().hashCode() );
         return result;
   }   


}


