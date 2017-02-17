package it.clevercom.echo.rd.model.entity;
// Generated 17-feb-2017 17.22.02 by Hibernate Tools 5.2.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * WorkTask generated by hbm2java
 */
@Entity
@Table(name = "work_task")
public class WorkTask implements java.io.Serializable {

	private long idworktask;
	private Modality modality;
	private Service service;
	private User user;
	private WorkPriority workPriority;
	private WorkSession workSession;
	private WorkStatus workStatus;
	private long accessionnumber;
	private Date scheduleddate;
	private Date executiondate;
	private String studyuuid;
	private String studyid;
	private Date updated;
	private String userupdate;
	private boolean active;
	private Set<WorkReport> workReports = new HashSet<WorkReport>(0);
	private Set<WorkTaskLog> workTaskLogs = new HashSet<WorkTaskLog>(0);

	public WorkTask() {
	}

	public WorkTask(long idworktask, Modality modality, Service service, User user, WorkPriority workPriority,
			WorkSession workSession, WorkStatus workStatus, long accessionnumber, Date scheduleddate, String studyuuid,
			Date updated, String userupdate, boolean active) {
		this.idworktask = idworktask;
		this.modality = modality;
		this.service = service;
		this.user = user;
		this.workPriority = workPriority;
		this.workSession = workSession;
		this.workStatus = workStatus;
		this.accessionnumber = accessionnumber;
		this.scheduleddate = scheduleddate;
		this.studyuuid = studyuuid;
		this.updated = updated;
		this.userupdate = userupdate;
		this.active = active;
	}

	public WorkTask(long idworktask, Modality modality, Service service, User user, WorkPriority workPriority,
			WorkSession workSession, WorkStatus workStatus, long accessionnumber, Date scheduleddate,
			Date executiondate, String studyuuid, String studyid, Date updated, String userupdate, boolean active,
			Set<WorkReport> workReports, Set<WorkTaskLog> workTaskLogs) {
		this.idworktask = idworktask;
		this.modality = modality;
		this.service = service;
		this.user = user;
		this.workPriority = workPriority;
		this.workSession = workSession;
		this.workStatus = workStatus;
		this.accessionnumber = accessionnumber;
		this.scheduleddate = scheduleddate;
		this.executiondate = executiondate;
		this.studyuuid = studyuuid;
		this.studyid = studyid;
		this.updated = updated;
		this.userupdate = userupdate;
		this.active = active;
		this.workReports = workReports;
		this.workTaskLogs = workTaskLogs;
	}

	@Id

	@Column(name = "idworktask", unique = true, nullable = false)
	public long getIdworktask() {
		return this.idworktask;
	}

	public void setIdworktask(long idworktask) {
		this.idworktask = idworktask;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idmodality", nullable = false)
	public Modality getModality() {
		return this.modality;
	}

	public void setModality(Modality modality) {
		this.modality = modality;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idservice", nullable = false)
	public Service getService() {
		return this.service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "iduser", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "prioritycode", nullable = false)
	public WorkPriority getWorkPriority() {
		return this.workPriority;
	}

	public void setWorkPriority(WorkPriority workPriority) {
		this.workPriority = workPriority;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idworksession", nullable = false)
	public WorkSession getWorkSession() {
		return this.workSession;
	}

	public void setWorkSession(WorkSession workSession) {
		this.workSession = workSession;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "statuscode", nullable = false)
	public WorkStatus getWorkStatus() {
		return this.workStatus;
	}

	public void setWorkStatus(WorkStatus workStatus) {
		this.workStatus = workStatus;
	}

	@Column(name = "accessionnumber", nullable = false)
	public long getAccessionnumber() {
		return this.accessionnumber;
	}

	public void setAccessionnumber(long accessionnumber) {
		this.accessionnumber = accessionnumber;
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

	@Column(name = "studyid", length = 100)
	public String getStudyid() {
		return this.studyid;
	}

	public void setStudyid(String studyid) {
		this.studyid = studyid;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "workTask")
	public Set<WorkReport> getWorkReports() {
		return this.workReports;
	}

	public void setWorkReports(Set<WorkReport> workReports) {
		this.workReports = workReports;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "workTask")
	public Set<WorkTaskLog> getWorkTaskLogs() {
		return this.workTaskLogs;
	}

	public void setWorkTaskLogs(Set<WorkTaskLog> workTaskLogs) {
		this.workTaskLogs = workTaskLogs;
	}

}
