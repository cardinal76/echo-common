package it.clevercom.echo.hibernate.rd.postgresql.entity;
// Generated 27-apr-2017 11.40.51 by Hibernate Tools 5.2.2.Final


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
 * WorkTask generated by hbm2java
 */
@Entity
@Table(name="rd_work_task"
)
public class WorkTask  implements java.io.Serializable {


     private Long idworktask;
     private Modality modality;
     private Service service;
     private User user;
     private WorkPriority workPriority;
     private WorkSession workSession;
     private WorkStatus workStatus;
     private Long accessionnumber;
     private Date scheduleddate;
     private Date executeddate;
     private String studyuuid;
     private String studyid;
     private Date executingdate;
     private Date reportingdate;
     private Date reporteddate;
     private String executingnote;
     private String executednote;
     private String reportednote;
     private String reportingnote;
     private Set<WorkReport> workReports = new HashSet<WorkReport>(0);
     private Set<WorkTaskLog> workTaskLogs = new HashSet<WorkTaskLog>(0);

    public WorkTask() {
    }

	
    public WorkTask(Modality modality, Service service, User user, WorkPriority workPriority, WorkSession workSession, WorkStatus workStatus, Long accessionnumber, Date scheduleddate) {
        this.modality = modality;
        this.service = service;
        this.user = user;
        this.workPriority = workPriority;
        this.workSession = workSession;
        this.workStatus = workStatus;
        this.accessionnumber = accessionnumber;
        this.scheduleddate = scheduleddate;
    }
    public WorkTask(Modality modality, Service service, User user, WorkPriority workPriority, WorkSession workSession, WorkStatus workStatus, Long accessionnumber, Date scheduleddate, Date executeddate, String studyuuid, String studyid, Date executingdate, Date reportingdate, Date reporteddate, String executingnote, String executednote, String reportednote, String reportingnote, Set<WorkReport> workReports, Set<WorkTaskLog> workTaskLogs) {
       this.modality = modality;
       this.service = service;
       this.user = user;
       this.workPriority = workPriority;
       this.workSession = workSession;
       this.workStatus = workStatus;
       this.accessionnumber = accessionnumber;
       this.scheduleddate = scheduleddate;
       this.executeddate = executeddate;
       this.studyuuid = studyuuid;
       this.studyid = studyid;
       this.executingdate = executingdate;
       this.reportingdate = reportingdate;
       this.reporteddate = reporteddate;
       this.executingnote = executingnote;
       this.executednote = executednote;
       this.reportednote = reportednote;
       this.reportingnote = reportingnote;
       this.workReports = workReports;
       this.workTaskLogs = workTaskLogs;
    }
   
     @GenericGenerator(name="generator", strategy="org.hibernate.id.enhanced.SequenceStyleGenerator", parameters={@Parameter(name="optimizer", value="none"), @Parameter(name="sequence_name", value="worktask_idworktask_seq"), @Parameter(name="increment_size", value="1")})@Id @GeneratedValue(generator="generator")

    
    @Column(name="idworktask", unique=true, nullable=false)
    public Long getIdworktask() {
        return this.idworktask;
    }
    
    public void setIdworktask(Long idworktask) {
        this.idworktask = idworktask;
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

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="username", nullable=false)
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idworkpriority", nullable=false)
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
    @JoinColumn(name="idworkstatus", nullable=false)
    public WorkStatus getWorkStatus() {
        return this.workStatus;
    }
    
    public void setWorkStatus(WorkStatus workStatus) {
        this.workStatus = workStatus;
    }

    
    @Column(name="accessionnumber", nullable=false)
    public Long getAccessionnumber() {
        return this.accessionnumber;
    }
    
    public void setAccessionnumber(Long accessionnumber) {
        this.accessionnumber = accessionnumber;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="scheduleddate", nullable=false, length=29)
    public Date getScheduleddate() {
        return this.scheduleddate;
    }
    
    public void setScheduleddate(Date scheduleddate) {
        this.scheduleddate = scheduleddate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="executeddate", length=29)
    public Date getExecuteddate() {
        return this.executeddate;
    }
    
    public void setExecuteddate(Date executeddate) {
        this.executeddate = executeddate;
    }

    
    @Column(name="studyuuid", length=100)
    public String getStudyuuid() {
        return this.studyuuid;
    }
    
    public void setStudyuuid(String studyuuid) {
        this.studyuuid = studyuuid;
    }

    
    @Column(name="studyid", length=100)
    public String getStudyid() {
        return this.studyid;
    }
    
    public void setStudyid(String studyid) {
        this.studyid = studyid;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="executingdate", length=29)
    public Date getExecutingdate() {
        return this.executingdate;
    }
    
    public void setExecutingdate(Date executingdate) {
        this.executingdate = executingdate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="reportingdate", length=29)
    public Date getReportingdate() {
        return this.reportingdate;
    }
    
    public void setReportingdate(Date reportingdate) {
        this.reportingdate = reportingdate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="reporteddate", length=29)
    public Date getReporteddate() {
        return this.reporteddate;
    }
    
    public void setReporteddate(Date reporteddate) {
        this.reporteddate = reporteddate;
    }

    
    @Column(name="executingnote")
    public String getExecutingnote() {
        return this.executingnote;
    }
    
    public void setExecutingnote(String executingnote) {
        this.executingnote = executingnote;
    }

    
    @Column(name="executednote")
    public String getExecutednote() {
        return this.executednote;
    }
    
    public void setExecutednote(String executednote) {
        this.executednote = executednote;
    }

    
    @Column(name="reportednote")
    public String getReportednote() {
        return this.reportednote;
    }
    
    public void setReportednote(String reportednote) {
        this.reportednote = reportednote;
    }

    
    @Column(name="reportingnote")
    public String getReportingnote() {
        return this.reportingnote;
    }
    
    public void setReportingnote(String reportingnote) {
        this.reportingnote = reportingnote;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="workTask")
    public Set<WorkReport> getWorkReports() {
        return this.workReports;
    }
    
    public void setWorkReports(Set<WorkReport> workReports) {
        this.workReports = workReports;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="workTask")
    public Set<WorkTaskLog> getWorkTaskLogs() {
        return this.workTaskLogs;
    }
    
    public void setWorkTaskLogs(Set<WorkTaskLog> workTaskLogs) {
        this.workTaskLogs = workTaskLogs;
    }




}


