package it.clevercom.echo.hibernate.tm.postgresql.entity;
// Generated 20-apr-2017 6.54.04 by Hibernate Tools 5.2.2.Final


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
 * NotificationType generated by hbm2java
 */
@Entity
@Table(name="tm_notification_type"
)
public class NotificationType  implements java.io.Serializable {


     private Long idnotificationtype;
     private String description;
     private Date created;
     private Date updated;
     private boolean active;
     private String updateduser;
     private Set<Notification> notifications = new HashSet<Notification>(0);

    public NotificationType() {
    }

	
    public NotificationType(Long idnotificationtype, Date created, Date updated, boolean active, String updateduser) {
        this.idnotificationtype = idnotificationtype;
        this.created = created;
        this.updated = updated;
        this.active = active;
        this.updateduser = updateduser;
    }
    public NotificationType(Long idnotificationtype, String description, Date created, Date updated, boolean active, String updateduser, Set<Notification> notifications) {
       this.idnotificationtype = idnotificationtype;
       this.description = description;
       this.created = created;
       this.updated = updated;
       this.active = active;
       this.updateduser = updateduser;
       this.notifications = notifications;
    }
   
     @Id 

    
    @Column(name="idnotificationtype", unique=true, nullable=false)
    public Long getIdnotificationtype() {
        return this.idnotificationtype;
    }
    
    public void setIdnotificationtype(Long idnotificationtype) {
        this.idnotificationtype = idnotificationtype;
    }

    
    @Column(name="description", length=100)
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

    
    @Column(name="updateduser", nullable=false, length=100)
    public String getUpdateduser() {
        return this.updateduser;
    }
    
    public void setUpdateduser(String updateduser) {
        this.updateduser = updateduser;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="notificationType")
    public Set<Notification> getNotifications() {
        return this.notifications;
    }
    
    public void setNotifications(Set<Notification> notifications) {
        this.notifications = notifications;
    }




}


