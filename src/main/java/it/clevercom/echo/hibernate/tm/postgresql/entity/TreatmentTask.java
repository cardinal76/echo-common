package it.clevercom.echo.hibernate.tm.postgresql.entity;
// Generated 11-apr-2017 13.43.21 by Hibernate Tools 5.2.2.Final


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
 * TreatmentTask generated by hbm2java
 */
@Entity
@Table(name="tm_treatment_task"
)
public class TreatmentTask  implements java.io.Serializable {


     private Long idtreatmenttask;
     private TreatmentPlan treatmentPlan;
     private String description;
     private String type;
     private Boolean completed;
     private Date execution;
     private Date schedulefrom;
     private Date scheduleto;
     private String taskuuid;
     private Date created;
     private Date updated;
     private boolean active;
     private String updateuser;

    public TreatmentTask() {
    }

	
    public TreatmentTask(Long idtreatmenttask, TreatmentPlan treatmentPlan, String type, Date created, Date updated, boolean active, String updateuser) {
        this.idtreatmenttask = idtreatmenttask;
        this.treatmentPlan = treatmentPlan;
        this.type = type;
        this.created = created;
        this.updated = updated;
        this.active = active;
        this.updateuser = updateuser;
    }
    public TreatmentTask(Long idtreatmenttask, TreatmentPlan treatmentPlan, String description, String type, Boolean completed, Date execution, Date schedulefrom, Date scheduleto, String taskuuid, Date created, Date updated, boolean active, String updateuser) {
       this.idtreatmenttask = idtreatmenttask;
       this.treatmentPlan = treatmentPlan;
       this.description = description;
       this.type = type;
       this.completed = completed;
       this.execution = execution;
       this.schedulefrom = schedulefrom;
       this.scheduleto = scheduleto;
       this.taskuuid = taskuuid;
       this.created = created;
       this.updated = updated;
       this.active = active;
       this.updateuser = updateuser;
    }
   
     @Id 

    
    @Column(name="idtreatmenttask", unique=true, nullable=false)
    public Long getIdtreatmenttask() {
        return this.idtreatmenttask;
    }
    
    public void setIdtreatmenttask(Long idtreatmenttask) {
        this.idtreatmenttask = idtreatmenttask;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idtreatmentplan", nullable=false)
    public TreatmentPlan getTreatmentPlan() {
        return this.treatmentPlan;
    }
    
    public void setTreatmentPlan(TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    
    @Column(name="description")
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="type", nullable=false)
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    
    @Column(name="completed")
    public Boolean getCompleted() {
        return this.completed;
    }
    
    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="execution", length=29)
    public Date getExecution() {
        return this.execution;
    }
    
    public void setExecution(Date execution) {
        this.execution = execution;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="schedulefrom", length=29)
    public Date getSchedulefrom() {
        return this.schedulefrom;
    }
    
    public void setSchedulefrom(Date schedulefrom) {
        this.schedulefrom = schedulefrom;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="scheduleto", length=29)
    public Date getScheduleto() {
        return this.scheduleto;
    }
    
    public void setScheduleto(Date scheduleto) {
        this.scheduleto = scheduleto;
    }

    
    @Column(name="taskuuid", length=36)
    public String getTaskuuid() {
        return this.taskuuid;
    }
    
    public void setTaskuuid(String taskuuid) {
        this.taskuuid = taskuuid;
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


