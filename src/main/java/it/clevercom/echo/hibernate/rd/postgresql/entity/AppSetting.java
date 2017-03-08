package it.clevercom.echo.hibernate.rd.postgresql.entity;
// Generated 8-mar-2017 10.59.59 by Hibernate Tools 5.2.2.Final


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * AppSetting generated by hbm2java
 */
@Entity
@Table(name="rd_app_setting"
)
public class AppSetting  implements java.io.Serializable {


     private Long idsetting;
     private User user;
     private String key;
     private String value;
     private Date created;
     private Date updated;
     private String userupdate;
     private boolean active;
     private String group;

    public AppSetting() {
    }

	
    public AppSetting(String key, String value, Date created, Date updated, boolean active) {
        this.key = key;
        this.value = value;
        this.created = created;
        this.updated = updated;
        this.active = active;
    }
    public AppSetting(User user, String key, String value, Date created, Date updated, String userupdate, boolean active, String group) {
       this.user = user;
       this.key = key;
       this.value = value;
       this.created = created;
       this.updated = updated;
       this.userupdate = userupdate;
       this.active = active;
       this.group = group;
    }
   
     @GenericGenerator(name="generator", strategy="org.hibernate.id.enhanced.SequenceStyleGenerator", parameters={@Parameter(name="optimizer", value="none"), @Parameter(name="sequence_name", value="app_setting_idappsetting_seq"), @Parameter(name="increment_size", value="1")})@Id @GeneratedValue(generator="generator")

    
    @Column(name="idsetting", unique=true, nullable=false)
    public Long getIdsetting() {
        return this.idsetting;
    }
    
    public void setIdsetting(Long idsetting) {
        this.idsetting = idsetting;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="iduser")
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    
    @Column(name="key", nullable=false)
    public String getKey() {
        return this.key;
    }
    
    public void setKey(String key) {
        this.key = key;
    }

    
    @Column(name="value", nullable=false, length=1000)
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
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

    
    @Column(name="userupdate", length=100)
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

    
    @Column(name="group")
    public String getGroup() {
        return this.group;
    }
    
    public void setGroup(String group) {
        this.group = group;
    }




}

