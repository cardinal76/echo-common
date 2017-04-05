package it.clevercom.echo.hibernate.rd.postgresql.entity;
// Generated 5-apr-2017 11.35.01 by Hibernate Tools 5.2.2.Final


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
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * AppSetting generated by hbm2java
 */
@Entity
@Table(name="rd_app_setting"
    , uniqueConstraints = @UniqueConstraint(columnNames={"key", "feature", "username"}) 
)
public class AppSetting  implements java.io.Serializable {


     private Long idappsetting;
     private User user;
     private String key;
     private String value;
     private Date created;
     private Date updated;
     private String userupdate;
     private Boolean active;
     private String feature;

    public AppSetting() {
    }

	
    public AppSetting(String key, String value, Date created, Date updated, Boolean active) {
        this.key = key;
        this.value = value;
        this.created = created;
        this.updated = updated;
        this.active = active;
    }
    public AppSetting(User user, String key, String value, Date created, Date updated, String userupdate, Boolean active, String feature) {
       this.user = user;
       this.key = key;
       this.value = value;
       this.created = created;
       this.updated = updated;
       this.userupdate = userupdate;
       this.active = active;
       this.feature = feature;
    }
   
     @GenericGenerator(name="generator", strategy="org.hibernate.id.enhanced.SequenceStyleGenerator", parameters={@Parameter(name="optimizer", value="none"), @Parameter(name="sequence_name", value="app_setting_idappsetting_seq"), @Parameter(name="increment_size", value="1")})@Id @GeneratedValue(generator="generator")

    
    @Column(name="idappsetting", unique=true, nullable=false)
    public Long getIdappsetting() {
        return this.idappsetting;
    }
    
    public void setIdappsetting(Long idappsetting) {
        this.idappsetting = idappsetting;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="username")
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
    public Boolean getActive() {
        return this.active;
    }
    
    public void setActive(Boolean active) {
        this.active = active;
    }

    
    @Column(name="feature")
    public String getFeature() {
        return this.feature;
    }
    
    public void setFeature(String feature) {
        this.feature = feature;
    }




}


