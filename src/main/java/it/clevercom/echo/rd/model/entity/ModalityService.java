package it.clevercom.echo.rd.model.entity;
// Generated 7-mar-2017 16.06.19 by Hibernate Tools 5.2.2.Final


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
 * ModalityService generated by hbm2java
 */
@Entity
@Table(name="rd_modality_service"
)
public class ModalityService  implements java.io.Serializable {


     private Long idmodalityservice;
     private Modality modality;
     private Service service;
     private Date created;
     private Date updated;
     private String userupdate;
     private boolean active;

    public ModalityService() {
    }

    public ModalityService(Long idmodalityservice, Modality modality, Service service, Date created, Date updated, String userupdate, boolean active) {
       this.idmodalityservice = idmodalityservice;
       this.modality = modality;
       this.service = service;
       this.created = created;
       this.updated = updated;
       this.userupdate = userupdate;
       this.active = active;
    }
   
     @Id 

    
    @Column(name="idmodalityservice", unique=true, nullable=false)
    public Long getIdmodalityservice() {
        return this.idmodalityservice;
    }
    
    public void setIdmodalityservice(Long idmodalityservice) {
        this.idmodalityservice = idmodalityservice;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idmodality", nullable=false)
    public Modality getModality() {
        return this.modality;
    }
    
    public void setModality(Modality modality) {
        this.modality = modality;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idservice", nullable=false)
    public Service getService() {
        return this.service;
    }
    
    public void setService(Service service) {
        this.service = service;
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




}


