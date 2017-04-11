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
 * SystemeventType generated by hbm2java
 */
@Entity
@Table(name="tm_systemevent_type"
)
public class SystemeventType  implements java.io.Serializable {


     private Long idsystemeventtype;
     private String description;
     private String action;
     private Date created;
     private Date updated;
     private boolean active;
     private String updateduser;
     private Set<SystemEvent> systemEvents = new HashSet<SystemEvent>(0);

    public SystemeventType() {
    }

	
    public SystemeventType(Long idsystemeventtype, Date created, Date updated, boolean active, String updateduser) {
        this.idsystemeventtype = idsystemeventtype;
        this.created = created;
        this.updated = updated;
        this.active = active;
        this.updateduser = updateduser;
    }
    public SystemeventType(Long idsystemeventtype, String description, String action, Date created, Date updated, boolean active, String updateduser, Set<SystemEvent> systemEvents) {
       this.idsystemeventtype = idsystemeventtype;
       this.description = description;
       this.action = action;
       this.created = created;
       this.updated = updated;
       this.active = active;
       this.updateduser = updateduser;
       this.systemEvents = systemEvents;
    }
   
     @Id 

    
    @Column(name="idsystemeventtype", unique=true, nullable=false)
    public Long getIdsystemeventtype() {
        return this.idsystemeventtype;
    }
    
    public void setIdsystemeventtype(Long idsystemeventtype) {
        this.idsystemeventtype = idsystemeventtype;
    }

    
    @Column(name="description", length=100)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="action")
    public String getAction() {
        return this.action;
    }
    
    public void setAction(String action) {
        this.action = action;
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

    
    @Column(name="updateduser", nullable=false, length=100)
    public String getUpdateduser() {
        return this.updateduser;
    }
    
    public void setUpdateduser(String updateduser) {
        this.updateduser = updateduser;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="systemeventType")
    public Set<SystemEvent> getSystemEvents() {
        return this.systemEvents;
    }
    
    public void setSystemEvents(Set<SystemEvent> systemEvents) {
        this.systemEvents = systemEvents;
    }




}

