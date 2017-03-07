package it.clevercom.echo.rd.model.entity;
// Generated 7-mar-2017 22.12.30 by Hibernate Tools 5.2.2.Final


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * WorkSession generated by hbm2java
 */
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name="rd_work_session"
)
public class WorkSession  implements java.io.Serializable {


     private Long idworksession;
     private Patient patient;
     private WorkStatus workStatus;
     private Date created;
     private Date updated;
     private String userupdate;
     private boolean active;
     private Set<WorkReport> workReports = new HashSet<WorkReport>(0);
     private Set<WorkTask> workTasks = new HashSet<WorkTask>(0);
     private Set<Order> orders = new HashSet<Order>(0);

    public WorkSession() {
    }

	
    public WorkSession(Patient patient, WorkStatus workStatus, Date created, Date updated, String userupdate, boolean active) {
        this.patient = patient;
        this.workStatus = workStatus;
        this.created = created;
        this.updated = updated;
        this.userupdate = userupdate;
        this.active = active;
    }
    public WorkSession(Patient patient, WorkStatus workStatus, Date created, Date updated, String userupdate, boolean active, Set<WorkReport> workReports, Set<WorkTask> workTasks, Set<Order> orders) {
       this.patient = patient;
       this.workStatus = workStatus;
       this.created = created;
       this.updated = updated;
       this.userupdate = userupdate;
       this.active = active;
       this.workReports = workReports;
       this.workTasks = workTasks;
       this.orders = orders;
    }
   
     @SequenceGenerator(name="it.clevercom.echo.rd.model.entity.WorkSessionIdGenerator")@Id @GeneratedValue(strategy=SEQUENCE, generator="it.clevercom.echo.rd.model.entity.WorkSessionIdGenerator")

    
    @Column(name="idworksession", unique=true, nullable=false)
    public Long getIdworksession() {
        return this.idworksession;
    }
    
    public void setIdworksession(Long idworksession) {
        this.idworksession = idworksession;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idpatient", nullable=false)
    public Patient getPatient() {
        return this.patient;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="statuscode", nullable=false)
    public WorkStatus getWorkStatus() {
        return this.workStatus;
    }
    
    public void setWorkStatus(WorkStatus workStatus) {
        this.workStatus = workStatus;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="workSession")
    public Set<WorkReport> getWorkReports() {
        return this.workReports;
    }
    
    public void setWorkReports(Set<WorkReport> workReports) {
        this.workReports = workReports;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="workSession")
    public Set<WorkTask> getWorkTasks() {
        return this.workTasks;
    }
    
    public void setWorkTasks(Set<WorkTask> workTasks) {
        this.workTasks = workTasks;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="workSession")
    public Set<Order> getOrders() {
        return this.orders;
    }
    
    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }




}


