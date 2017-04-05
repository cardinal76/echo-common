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
 * WorkReportUser generated by hbm2java
 */
@Entity
@Table(name="rd_work_report_user"
    , uniqueConstraints = @UniqueConstraint(columnNames={"username", "idworkreport"}) 
)
public class WorkReportUser  implements java.io.Serializable {


     private Long idworkreportuser;
     private User user;
     private WorkReport workReport;
     private Date created;
     private Date updated;
     private String userupdate;
     private Boolean active;

    public WorkReportUser() {
    }

	
    public WorkReportUser(User user, WorkReport workReport, Date created, Date updated, String userupdate) {
        this.user = user;
        this.workReport = workReport;
        this.created = created;
        this.updated = updated;
        this.userupdate = userupdate;
    }
    public WorkReportUser(User user, WorkReport workReport, Date created, Date updated, String userupdate, Boolean active) {
       this.user = user;
       this.workReport = workReport;
       this.created = created;
       this.updated = updated;
       this.userupdate = userupdate;
       this.active = active;
    }
   
     @GenericGenerator(name="generator", strategy="org.hibernate.id.enhanced.SequenceStyleGenerator", parameters={@Parameter(name="optimizer", value="none"), @Parameter(name="sequence_name", value="workreportuser_idworkreportuser_seq"), @Parameter(name="increment_size", value="1")})@Id @GeneratedValue(generator="generator")

    
    @Column(name="idworkreportuser", unique=true, nullable=false)
    public Long getIdworkreportuser() {
        return this.idworkreportuser;
    }
    
    public void setIdworkreportuser(Long idworkreportuser) {
        this.idworkreportuser = idworkreportuser;
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
    @JoinColumn(name="idworkreport", nullable=false)
    public WorkReport getWorkReport() {
        return this.workReport;
    }
    
    public void setWorkReport(WorkReport workReport) {
        this.workReport = workReport;
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

    
    @Column(name="active")
    public Boolean getActive() {
        return this.active;
    }
    
    public void setActive(Boolean active) {
        this.active = active;
    }




}


