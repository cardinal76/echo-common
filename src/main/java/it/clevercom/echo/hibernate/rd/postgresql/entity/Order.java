package it.clevercom.echo.hibernate.rd.postgresql.entity;
// Generated 8-mar-2017 17.12.23 by Hibernate Tools 5.2.2.Final


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Order generated by hbm2java
 */
@Entity
@Table(name="rd_order"
)
public class Order  implements java.io.Serializable {


     private Long idorder;
     private OrganizationUnit organizationUnitByOriginorganizationunitid;
     private OrganizationUnit organizationUnitByTargetorganizationunitid;
     private WorkPriority workPriority;
     private WorkSession workSession;
     private WorkStatus workStatus;
     private String acquisitionchannel;
     private Date creationdate;
     private Date scheduleddate;
     private Date acceptancedate;
     private Long duration;
     private String requestingphysician;
     private String orderreason;
     private String rejectreason;
     private String clinicalhistory;
     private String notes;
     private Date created;
     private Date updated;
     private String userupdate;
     private Boolean active;
     private Set<OrderLog> orderLogs = new HashSet<OrderLog>(0);
     private Set<OrderService> orderServices = new HashSet<OrderService>(0);

    public Order() {
    }

	
    public Order(WorkPriority workPriority, WorkSession workSession, WorkStatus workStatus, String acquisitionchannel, Date creationdate, Date created, Date updated, String userupdate, Boolean active) {
        this.workPriority = workPriority;
        this.workSession = workSession;
        this.workStatus = workStatus;
        this.acquisitionchannel = acquisitionchannel;
        this.creationdate = creationdate;
        this.created = created;
        this.updated = updated;
        this.userupdate = userupdate;
        this.active = active;
    }
    public Order(OrganizationUnit organizationUnitByOriginorganizationunitid, OrganizationUnit organizationUnitByTargetorganizationunitid, WorkPriority workPriority, WorkSession workSession, WorkStatus workStatus, String acquisitionchannel, Date creationdate, Date scheduleddate, Date acceptancedate, Long duration, String requestingphysician, String orderreason, String rejectreason, String clinicalhistory, String notes, Date created, Date updated, String userupdate, Boolean active, Set<OrderLog> orderLogs, Set<OrderService> orderServices) {
       this.organizationUnitByOriginorganizationunitid = organizationUnitByOriginorganizationunitid;
       this.organizationUnitByTargetorganizationunitid = organizationUnitByTargetorganizationunitid;
       this.workPriority = workPriority;
       this.workSession = workSession;
       this.workStatus = workStatus;
       this.acquisitionchannel = acquisitionchannel;
       this.creationdate = creationdate;
       this.scheduleddate = scheduleddate;
       this.acceptancedate = acceptancedate;
       this.duration = duration;
       this.requestingphysician = requestingphysician;
       this.orderreason = orderreason;
       this.rejectreason = rejectreason;
       this.clinicalhistory = clinicalhistory;
       this.notes = notes;
       this.created = created;
       this.updated = updated;
       this.userupdate = userupdate;
       this.active = active;
       this.orderLogs = orderLogs;
       this.orderServices = orderServices;
    }
   
     @GenericGenerator(name="generator", strategy="org.hibernate.id.enhanced.SequenceStyleGenerator", parameters={@Parameter(name="optimizer", value="none"), @Parameter(name="sequence_name", value="order_idorder_seq"), @Parameter(name="increment_size", value="1")})@Id @GeneratedValue(generator="generator")

    
    @Column(name="idorder", unique=true, nullable=false)
    public Long getIdorder() {
        return this.idorder;
    }
    
    public void setIdorder(Long idorder) {
        this.idorder = idorder;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="originorganizationunitid")
    public OrganizationUnit getOrganizationUnitByOriginorganizationunitid() {
        return this.organizationUnitByOriginorganizationunitid;
    }
    
    public void setOrganizationUnitByOriginorganizationunitid(OrganizationUnit organizationUnitByOriginorganizationunitid) {
        this.organizationUnitByOriginorganizationunitid = organizationUnitByOriginorganizationunitid;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="targetorganizationunitid")
    public OrganizationUnit getOrganizationUnitByTargetorganizationunitid() {
        return this.organizationUnitByTargetorganizationunitid;
    }
    
    public void setOrganizationUnitByTargetorganizationunitid(OrganizationUnit organizationUnitByTargetorganizationunitid) {
        this.organizationUnitByTargetorganizationunitid = organizationUnitByTargetorganizationunitid;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="prioritycode", nullable=false)
    public WorkPriority getWorkPriority() {
        return this.workPriority;
    }
    
    public void setWorkPriority(WorkPriority workPriority) {
        this.workPriority = workPriority;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idworksession", nullable=false)
    public WorkSession getWorkSession() {
        return this.workSession;
    }
    
    public void setWorkSession(WorkSession workSession) {
        this.workSession = workSession;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="statuscode", nullable=false)
    public WorkStatus getWorkStatus() {
        return this.workStatus;
    }
    
    public void setWorkStatus(WorkStatus workStatus) {
        this.workStatus = workStatus;
    }

    
    @Column(name="acquisitionchannel", nullable=false, length=20)
    public String getAcquisitionchannel() {
        return this.acquisitionchannel;
    }
    
    public void setAcquisitionchannel(String acquisitionchannel) {
        this.acquisitionchannel = acquisitionchannel;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="creationdate", nullable=false, length=13)
    public Date getCreationdate() {
        return this.creationdate;
    }
    
    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="scheduleddate", length=13)
    public Date getScheduleddate() {
        return this.scheduleddate;
    }
    
    public void setScheduleddate(Date scheduleddate) {
        this.scheduleddate = scheduleddate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="acceptancedate", length=13)
    public Date getAcceptancedate() {
        return this.acceptancedate;
    }
    
    public void setAcceptancedate(Date acceptancedate) {
        this.acceptancedate = acceptancedate;
    }

    
    @Column(name="duration")
    public Long getDuration() {
        return this.duration;
    }
    
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    
    @Column(name="requestingphysician")
    public String getRequestingphysician() {
        return this.requestingphysician;
    }
    
    public void setRequestingphysician(String requestingphysician) {
        this.requestingphysician = requestingphysician;
    }

    
    @Column(name="orderreason")
    public String getOrderreason() {
        return this.orderreason;
    }
    
    public void setOrderreason(String orderreason) {
        this.orderreason = orderreason;
    }

    
    @Column(name="rejectreason")
    public String getRejectreason() {
        return this.rejectreason;
    }
    
    public void setRejectreason(String rejectreason) {
        this.rejectreason = rejectreason;
    }

    
    @Column(name="clinicalhistory")
    public String getClinicalhistory() {
        return this.clinicalhistory;
    }
    
    public void setClinicalhistory(String clinicalhistory) {
        this.clinicalhistory = clinicalhistory;
    }

    
    @Column(name="notes")
    public String getNotes() {
        return this.notes;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
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
    public Boolean getActive() {
        return this.active;
    }
    
    public void setActive(Boolean active) {
        this.active = active;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="order")
    public Set<OrderLog> getOrderLogs() {
        return this.orderLogs;
    }
    
    public void setOrderLogs(Set<OrderLog> orderLogs) {
        this.orderLogs = orderLogs;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="order")
    public Set<OrderService> getOrderServices() {
        return this.orderServices;
    }
    
    public void setOrderServices(Set<OrderService> orderServices) {
        this.orderServices = orderServices;
    }




}


