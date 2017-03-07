package it.clevercom.echo.rd.model.entity;
// Generated 7-mar-2017 16.06.19 by Hibernate Tools 5.2.2.Final


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ModalityType generated by hbm2java
 */
@Entity
@Table(name="rd_modality_type"
)
public class ModalityType  implements java.io.Serializable {


     private Long idmodalitytype;
     private String type;
     private Date created;
     private Date updated;
     private String userupdate;
     private boolean active;
     private Set<Service> services = new HashSet<Service>(0);

    public ModalityType() {
    }

	
    public ModalityType(String type, Date created, Date updated, String userupdate, boolean active) {
        this.type = type;
        this.created = created;
        this.updated = updated;
        this.userupdate = userupdate;
        this.active = active;
    }
    public ModalityType(String type, Date created, Date updated, String userupdate, boolean active, Set<Service> services) {
       this.type = type;
       this.created = created;
       this.updated = updated;
       this.userupdate = userupdate;
       this.active = active;
       this.services = services;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idmodalitytype", unique=true, nullable=false)
    public Long getIdmodalitytype() {
        return this.idmodalitytype;
    }
    
    public void setIdmodalitytype(Long idmodalitytype) {
        this.idmodalitytype = idmodalitytype;
    }

    
    @Column(name="type", nullable=false)
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
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

    
    @Column(name="userupdate", nullable=false, length=100)
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="modalityType")
    public Set<Service> getServices() {
        return this.services;
    }
    
    public void setServices(Set<Service> services) {
        this.services = services;
    }




}


