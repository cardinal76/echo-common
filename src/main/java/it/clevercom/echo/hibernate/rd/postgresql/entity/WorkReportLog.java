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
 * WorkReportLog generated by hbm2java
 */
@Entity
@Table(name="rd_work_report_log"
)
public class WorkReportLog  implements java.io.Serializable {


     private Long idworkreportlog;
     private WorkReport workReport;
     private Long idworksession;
     private Long accessionnumber;
     private String statuscode;
     private Date creationdate;
     private Date completiondate;
     private String body;
     private Long idworktask;
     private Date created;
     private Date updated;
     private String userupdate;
     private boolean active;

    public WorkReportLog() {
    }

	
    public WorkReportLog(WorkReport workReport, Long idworksession, String statuscode, Date creationdate, String body, Long idworktask, Date created, Date updated, String userupdate, boolean active) {
        this.workReport = workReport;
        this.idworksession = idworksession;
        this.statuscode = statuscode;
        this.creationdate = creationdate;
        this.body = body;
        this.idworktask = idworktask;
        this.created = created;
        this.updated = updated;
        this.userupdate = userupdate;
        this.active = active;
    }
    public WorkReportLog(WorkReport workReport, Long idworksession, Long accessionnumber, String statuscode, Date creationdate, Date completiondate, String body, Long idworktask, Date created, Date updated, String userupdate, boolean active) {
       this.workReport = workReport;
       this.idworksession = idworksession;
       this.accessionnumber = accessionnumber;
       this.statuscode = statuscode;
       this.creationdate = creationdate;
       this.completiondate = completiondate;
       this.body = body;
       this.idworktask = idworktask;
       this.created = created;
       this.updated = updated;
       this.userupdate = userupdate;
       this.active = active;
    }
   
     @GenericGenerator(name="generator", strategy="org.hibernate.id.enhanced.SequenceStyleGenerator", parameters={@Parameter(name="optimizer", value="none"), @Parameter(name="sequence_name", value="workreportlog_idworkreportlog_seq"), @Parameter(name="increment_size", value="1")})@Id @GeneratedValue(generator="generator")

    
    @Column(name="idworkreportlog", unique=true, nullable=false)
    public Long getIdworkreportlog() {
        return this.idworkreportlog;
    }
    
    public void setIdworkreportlog(Long idworkreportlog) {
        this.idworkreportlog = idworkreportlog;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idworkreport", nullable=false)
    public WorkReport getWorkReport() {
        return this.workReport;
    }
    
    public void setWorkReport(WorkReport workReport) {
        this.workReport = workReport;
    }

    
    @Column(name="idworksession", nullable=false)
    public Long getIdworksession() {
        return this.idworksession;
    }
    
    public void setIdworksession(Long idworksession) {
        this.idworksession = idworksession;
    }

    
    @Column(name="accessionnumber")
    public Long getAccessionnumber() {
        return this.accessionnumber;
    }
    
    public void setAccessionnumber(Long accessionnumber) {
        this.accessionnumber = accessionnumber;
    }

    
    @Column(name="statuscode", nullable=false, length=100)
    public String getStatuscode() {
        return this.statuscode;
    }
    
    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="creationdate", nullable=false, length=29)
    public Date getCreationdate() {
        return this.creationdate;
    }
    
    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="completiondate", length=29)
    public Date getCompletiondate() {
        return this.completiondate;
    }
    
    public void setCompletiondate(Date completiondate) {
        this.completiondate = completiondate;
    }

    
    @Column(name="body", nullable=false)
    public String getBody() {
        return this.body;
    }
    
    public void setBody(String body) {
        this.body = body;
    }

    
    @Column(name="idworktask", nullable=false)
    public Long getIdworktask() {
        return this.idworktask;
    }
    
    public void setIdworktask(Long idworktask) {
        this.idworktask = idworktask;
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

