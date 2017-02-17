package it.clevercom.echo.tm.model.entity;
// Generated 17-feb-2017 16.34.42 by Hibernate Tools 5.2.0.CR1

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
 * WorkTask generated by hbm2java
 */
@Entity
@Table(name = "work_task")
public class WorkTask implements java.io.Serializable {

	private long idworktask;
	private WorkList workList;
	private WorkType workType;
	private String taskuuid;
	private Date assignment;
	private Date deadline;
	private Date execution;
	private Boolean completed;
	private String status;
	private Date created;
	private Date updated;
	private boolean active;
	private String updateuser;

	public WorkTask() {
	}

	public WorkTask(long idworktask, WorkList workList, WorkType workType, Date assignment, Date created, Date updated,
			boolean active, String updateuser) {
		this.idworktask = idworktask;
		this.workList = workList;
		this.workType = workType;
		this.assignment = assignment;
		this.created = created;
		this.updated = updated;
		this.active = active;
		this.updateuser = updateuser;
	}

	public WorkTask(long idworktask, WorkList workList, WorkType workType, String taskuuid, Date assignment,
			Date deadline, Date execution, Boolean completed, String status, Date created, Date updated, boolean active,
			String updateuser) {
		this.idworktask = idworktask;
		this.workList = workList;
		this.workType = workType;
		this.taskuuid = taskuuid;
		this.assignment = assignment;
		this.deadline = deadline;
		this.execution = execution;
		this.completed = completed;
		this.status = status;
		this.created = created;
		this.updated = updated;
		this.active = active;
		this.updateuser = updateuser;
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
	@JoinColumn(name = "idworklist", nullable = false)
	public WorkList getWorkList() {
		return this.workList;
	}

	public void setWorkList(WorkList workList) {
		this.workList = workList;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idworktype", nullable = false)
	public WorkType getWorkType() {
		return this.workType;
	}

	public void setWorkType(WorkType workType) {
		this.workType = workType;
	}

	@Column(name = "taskuuid", length = 36)
	public String getTaskuuid() {
		return this.taskuuid;
	}

	public void setTaskuuid(String taskuuid) {
		this.taskuuid = taskuuid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "assignment", nullable = false, length = 29)
	public Date getAssignment() {
		return this.assignment;
	}

	public void setAssignment(Date assignment) {
		this.assignment = assignment;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "deadline", length = 29)
	public Date getDeadline() {
		return this.deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "execution", length = 29)
	public Date getExecution() {
		return this.execution;
	}

	public void setExecution(Date execution) {
		this.execution = execution;
	}

	@Column(name = "completed")
	public Boolean getCompleted() {
		return this.completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

	@Column(name = "status")
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	@Column(name = "active", nullable = false)
	public boolean isActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Column(name = "updateuser", nullable = false, length = 100)
	public String getUpdateuser() {
		return this.updateuser;
	}

	public void setUpdateuser(String updateuser) {
		this.updateuser = updateuser;
	}

}
