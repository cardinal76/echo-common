package it.clevercom.echo.hibernate.tm.postgresql.entity;
// Generated 20-apr-2017 6.54.04 by Hibernate Tools 5.2.2.Final


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * HealthDevice generated by hbm2java
 */
@Entity
@Table(name="tm_health_device"
)
public class HealthDevice  implements java.io.Serializable {


     private Long idhealthdevice;
     private HealthDevicetype healthDevicetype;
     private HealthKit healthKit;
     private String serialnumber;
     private Date created;
     private Date updated;
     private boolean active;
     private String updateuser;

    public HealthDevice() {
    }

	
    public HealthDevice(Long idhealthdevice, HealthDevicetype healthDevicetype, HealthKit healthKit, Date created, Date updated, boolean active, String updateuser) {
        this.idhealthdevice = idhealthdevice;
        this.healthDevicetype = healthDevicetype;
        this.healthKit = healthKit;
        this.created = created;
        this.updated = updated;
        this.active = active;
        this.updateuser = updateuser;
    }
    public HealthDevice(Long idhealthdevice, HealthDevicetype healthDevicetype, HealthKit healthKit, String serialnumber, Date created, Date updated, boolean active, String updateuser) {
       this.idhealthdevice = idhealthdevice;
       this.healthDevicetype = healthDevicetype;
       this.healthKit = healthKit;
       this.serialnumber = serialnumber;
       this.created = created;
       this.updated = updated;
       this.active = active;
       this.updateuser = updateuser;
    }
   
     @Id 

    
    @Column(name="idhealthdevice", unique=true, nullable=false)
    public Long getIdhealthdevice() {
        return this.idhealthdevice;
    }
    
    public void setIdhealthdevice(Long idhealthdevice) {
        this.idhealthdevice = idhealthdevice;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idhealthdevicetype", nullable=false)
    public HealthDevicetype getHealthDevicetype() {
        return this.healthDevicetype;
    }
    
    public void setHealthDevicetype(HealthDevicetype healthDevicetype) {
        this.healthDevicetype = healthDevicetype;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idhealthkit", nullable=false)
    public HealthKit getHealthKit() {
        return this.healthKit;
    }
    
    public void setHealthKit(HealthKit healthKit) {
        this.healthKit = healthKit;
    }

    
    @Column(name="serialnumber", length=100)
    public String getSerialnumber() {
        return this.serialnumber;
    }
    
    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
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




}

