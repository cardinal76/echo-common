package it.clevercom.echo.hibernate.tm.postgresql.entity;
// Generated 11-apr-2017 13.43.21 by Hibernate Tools 5.2.2.Final


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DetectionType generated by hbm2java
 */
@Entity
@Table(name="tm_detection_type"
)
public class DetectionType  implements java.io.Serializable {


     private Long iddetectiontype;
     private String name;
     private String description;
     private Date created;
     private Date updated;
     private boolean active;
     private String updateuser;
     private Set<DetectiontypeMeasurementtype> detectiontypeMeasurementtypes = new HashSet<DetectiontypeMeasurementtype>(0);
     private Set<DetectionTask> detectionTasks = new HashSet<DetectionTask>(0);

    public DetectionType() {
    }

	
    public DetectionType(Long iddetectiontype, String name, Date created, Date updated, boolean active, String updateuser) {
        this.iddetectiontype = iddetectiontype;
        this.name = name;
        this.created = created;
        this.updated = updated;
        this.active = active;
        this.updateuser = updateuser;
    }
    public DetectionType(Long iddetectiontype, String name, String description, Date created, Date updated, boolean active, String updateuser, Set<DetectiontypeMeasurementtype> detectiontypeMeasurementtypes, Set<DetectionTask> detectionTasks) {
       this.iddetectiontype = iddetectiontype;
       this.name = name;
       this.description = description;
       this.created = created;
       this.updated = updated;
       this.active = active;
       this.updateuser = updateuser;
       this.detectiontypeMeasurementtypes = detectiontypeMeasurementtypes;
       this.detectionTasks = detectionTasks;
    }
   
     @Id 

    
    @Column(name="iddetectiontype", unique=true, nullable=false)
    public Long getIddetectiontype() {
        return this.iddetectiontype;
    }
    
    public void setIddetectiontype(Long iddetectiontype) {
        this.iddetectiontype = iddetectiontype;
    }

    
    @Column(name="name", nullable=false, length=100)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="description")
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="detectionType")
    public Set<DetectiontypeMeasurementtype> getDetectiontypeMeasurementtypes() {
        return this.detectiontypeMeasurementtypes;
    }
    
    public void setDetectiontypeMeasurementtypes(Set<DetectiontypeMeasurementtype> detectiontypeMeasurementtypes) {
        this.detectiontypeMeasurementtypes = detectiontypeMeasurementtypes;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="detectionType")
    public Set<DetectionTask> getDetectionTasks() {
        return this.detectionTasks;
    }
    
    public void setDetectionTasks(Set<DetectionTask> detectionTasks) {
        this.detectionTasks = detectionTasks;
    }




}

