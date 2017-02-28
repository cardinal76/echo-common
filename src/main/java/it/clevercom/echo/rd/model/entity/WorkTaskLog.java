package it.clevercom.echo.rd.model.entity;
// Generated 28-feb-2017 10.00.08 by Hibernate Tools 5.2.0.CR1

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
 * WorkTaskLog generated by hbm2java
 */
@Entity
@Table(name = "work_task_log")
public class WorkTaskLog implements java.io.Serializable {

	private long idworktasklog;
	private WorkTask workTask;
	private long idworksession;
	private long accessionnumber;
	private String statuscode;
	private String prioritycode;
	private long idservice;
	private long idmodality;
	private Date scheduleddate;
	private Date executiondate;
	private String studyuuid;
	private Long studyid;
	private long iduser;
	private Date created;
	private Date updated;
	private String userupdate;
	private boolean active;

	public WorkTaskLog() {
	}

	public WorkTaskLog(long idworktasklog, WorkTask workTask, long idworksession, long accessionnumber,
			String statuscode, String prioritycode, long idservice, long idmodality, Date scheduleddate,
			String studyuuid, long iduser, Date created, Date updated, String userupdate, boolean active) {
		this.idworktasklog = idworktasklog;
		this.workTask = workTask;
		this.idworksession = idworksession;
		this.accessionnumber = accessionnumber;
		this.statuscode = statuscode;
		this.prioritycode = prioritycode;
		this.idservice = idservice;
		this.idmodality = idmodality;
		this.scheduleddate = scheduleddate;
		this.studyuuid = studyuuid;
		this.iduser = iduser;
		this.created = created;
		this.updated = updated;
		this.userupdate = userupdate;
		this.active = active;
	}

	public WorkTaskLog(long idworktasklog, WorkTask workTask, long idworksession, long accessionnumber,
			String statuscode, String prioritycode, long idservice, long idmodality, Date scheduleddate,
			Date executiondate, String studyuuid, Long studyid, long iduser, Date created, Date updated,
			String userupdate, boolean active) {
		this.idworktasklog = idworktasklog;
		this.workTask = workTask;
		this.idworksession = idworksession;
		this.accessionnumber = accessionnumber;
		this.statuscode = statuscode;
		this.prioritycode = prioritycode;
		this.idservice = idservice;
		this.idmodality = idmodality;
		this.scheduleddate = scheduleddate;
		this.executiondate = executiondate;
		this.studyuuid = studyuuid;
		this.studyid = studyid;
		this.iduser = iduser;
		this.created = created;
		this.updated = updated;
		this.userupdate = userupdate;
		this.active = active;
	}

	@Id

	@Column(name = "idworktasklog", unique = true, nullable = false)
	public long getIdworktasklog() {
		return this.idworktasklog;
	}

	public void setIdworktasklog(long idworktasklog) {
		this.idworktasklog = idworktasklog;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idworktask", nullable = false)
	public WorkTask getWorkTask() {
		return this.workTask;
	}

	public void setWorkTask(WorkTask workTask) {
		this.workTask = workTask;
	}

	@Column(name = "idworksession", nullable = false)
	public long getIdworksession() {
		return this.idworksession;
	}

	public void setIdworksession(long idworksession) {
		this.idworksession = idworksession;
	}

	@Column(name = "accessionnumber", nullable = false)
	public long getAccessionnumber() {
		return this.accessionnumber;
	}

	public void setAccessionnumber(long accessionnumber) {
		this.accessionnumber = accessionnumber;
	}

	@Column(name = "statuscode", nullable = false, length = 100)
	public String getStatuscode() {
		return this.statuscode;
	}

	public void setStatuscode(String statuscode) {
		this.statuscode = statuscode;
	}

	@Column(name = "prioritycode", nullable = false, length = 100)
	public String getPrioritycode() {
		return this.prioritycode;
	}

	public void setPrioritycode(String prioritycode) {
		this.prioritycode = prioritycode;
	}

	@Column(name = "idservice", nullable = false)
	public long getIdservice() {
		return this.idservice;
	}

	public void setIdservice(long idservice) {
		this.idservice = idservice;
	}

	@Column(name = "idmodality", nullable = false)
	public long getIdmodality() {
		return this.idmodality;
	}

	public void setIdmodality(long idmodality) {
		this.idmodality = idmodality;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "scheduleddate", nullable = false, length = 29)
	public Date getScheduleddate() {
		return this.scheduleddate;
	}

	public void setScheduleddate(Date scheduleddate) {
		this.scheduleddate = scheduleddate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "executiondate", length = 29)
	public Date getExecutiondate() {
		return this.executiondate;
	}

	public void setExecutiondate(Date executiondate) {
		this.executiondate = executiondate;
	}

	@Column(name = "studyuuid", nullable = false, length = 100)
	public String getStudyuuid() {
		return this.studyuuid;
	}

	public void setStudyuuid(String studyuuid) {
		this.studyuuid = studyuuid;
	}

	@Column(name = "studyid")
	public Long getStudyid() {
		return this.studyid;
	}

	public void setStudyid(Long studyid) {
		this.studyid = studyid;
	}

	@Column(name = "iduser", nullable = false)
	public long getIduser() {
		return this.iduser;
	}

	public void setIduser(long iduser) {
		this.iduser = iduser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created", nullable = false, length = 29)
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated", nullable = false, length = 29)
	public Date getUpdated() {
		return this.updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	@Column(name = "userupdate", nullable = false, length = 100)
	public String getUserupdate() {
		return this.userupdate;
	}

	public void setUserupdate(String userupdate) {
		this.userupdate = userupdate;
	}

	@Column(name = "active", nullable = false)
	public boolean isActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
