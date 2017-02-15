package it.clevercom.echo.rd.model.entity;
// Generated 15-feb-2017 17.20.09 by Hibernate Tools 5.2.0.CR1

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Radiologyorder generated by hbm2java
 */
@Entity
@Table(name = "RADIOLOGYORDER")
public class Radiologyorder implements java.io.Serializable {

	private BigDecimal idorder;
	private Status status;
	private Organizationunit organizationunitByOriginorganizationunitid;
	private Organizationunit organizationunitByTargetorganizationunitid;
	private Priority priority;
	private Radiologytask radiologytask;
	private String acquisitionchannel;
	private Date creationdate;
	private Date scheduleddate;
	private Date acceptancedate;
	private BigDecimal duration;
	private String requestingphysician;
	private String orderreason;
	private String rejectreason;
	private String clinicalhistory;
	private String notes;
	private Serializable created;
	private Serializable updated;
	private String userupdate;
	private Short active;
	private Set<Service> services = new HashSet<Service>(0);

	public Radiologyorder() {
	}

	public Radiologyorder(BigDecimal idorder, Status status, Priority priority, Radiologytask radiologytask,
			String acquisitionchannel, Date creationdate, Serializable created, Serializable updated,
			String userupdate) {
		this.idorder = idorder;
		this.status = status;
		this.priority = priority;
		this.radiologytask = radiologytask;
		this.acquisitionchannel = acquisitionchannel;
		this.creationdate = creationdate;
		this.created = created;
		this.updated = updated;
		this.userupdate = userupdate;
	}

	public Radiologyorder(BigDecimal idorder, Status status,
			Organizationunit organizationunitByOriginorganizationunitid,
			Organizationunit organizationunitByTargetorganizationunitid, Priority priority, Radiologytask radiologytask,
			String acquisitionchannel, Date creationdate, Date scheduleddate, Date acceptancedate, BigDecimal duration,
			String requestingphysician, String orderreason, String rejectreason, String clinicalhistory, String notes,
			Serializable created, Serializable updated, String userupdate, Short active, Set<Service> services) {
		this.idorder = idorder;
		this.status = status;
		this.organizationunitByOriginorganizationunitid = organizationunitByOriginorganizationunitid;
		this.organizationunitByTargetorganizationunitid = organizationunitByTargetorganizationunitid;
		this.priority = priority;
		this.radiologytask = radiologytask;
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
		this.services = services;
	}

	@Id

	@Column(name = "IDORDER", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getIdorder() {
		return this.idorder;
	}

	public void setIdorder(BigDecimal idorder) {
		this.idorder = idorder;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STATUSCODE", nullable = false)
	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ORIGINORGANIZATIONUNITID")
	public Organizationunit getOrganizationunitByOriginorganizationunitid() {
		return this.organizationunitByOriginorganizationunitid;
	}

	public void setOrganizationunitByOriginorganizationunitid(
			Organizationunit organizationunitByOriginorganizationunitid) {
		this.organizationunitByOriginorganizationunitid = organizationunitByOriginorganizationunitid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TARGETORGANIZATIONUNITID")
	public Organizationunit getOrganizationunitByTargetorganizationunitid() {
		return this.organizationunitByTargetorganizationunitid;
	}

	public void setOrganizationunitByTargetorganizationunitid(
			Organizationunit organizationunitByTargetorganizationunitid) {
		this.organizationunitByTargetorganizationunitid = organizationunitByTargetorganizationunitid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRIORITYCODE", nullable = false)
	public Priority getPriority() {
		return this.priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDRADIOLOGYTASK", nullable = false)
	public Radiologytask getRadiologytask() {
		return this.radiologytask;
	}

	public void setRadiologytask(Radiologytask radiologytask) {
		this.radiologytask = radiologytask;
	}

	@Column(name = "ACQUISITIONCHANNEL", nullable = false, length = 20)
	public String getAcquisitionchannel() {
		return this.acquisitionchannel;
	}

	public void setAcquisitionchannel(String acquisitionchannel) {
		this.acquisitionchannel = acquisitionchannel;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATIONDATE", nullable = false, length = 7)
	public Date getCreationdate() {
		return this.creationdate;
	}

	public void setCreationdate(Date creationdate) {
		this.creationdate = creationdate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "SCHEDULEDDATE", length = 7)
	public Date getScheduleddate() {
		return this.scheduleddate;
	}

	public void setScheduleddate(Date scheduleddate) {
		this.scheduleddate = scheduleddate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ACCEPTANCEDATE", length = 7)
	public Date getAcceptancedate() {
		return this.acceptancedate;
	}

	public void setAcceptancedate(Date acceptancedate) {
		this.acceptancedate = acceptancedate;
	}

	@Column(name = "DURATION", precision = 22, scale = 0)
	public BigDecimal getDuration() {
		return this.duration;
	}

	public void setDuration(BigDecimal duration) {
		this.duration = duration;
	}

	@Column(name = "REQUESTINGPHYSICIAN")
	public String getRequestingphysician() {
		return this.requestingphysician;
	}

	public void setRequestingphysician(String requestingphysician) {
		this.requestingphysician = requestingphysician;
	}

	@Column(name = "ORDERREASON", length = 1000)
	public String getOrderreason() {
		return this.orderreason;
	}

	public void setOrderreason(String orderreason) {
		this.orderreason = orderreason;
	}

	@Column(name = "REJECTREASON", length = 1000)
	public String getRejectreason() {
		return this.rejectreason;
	}

	public void setRejectreason(String rejectreason) {
		this.rejectreason = rejectreason;
	}

	@Column(name = "CLINICALHISTORY", length = 1000)
	public String getClinicalhistory() {
		return this.clinicalhistory;
	}

	public void setClinicalhistory(String clinicalhistory) {
		this.clinicalhistory = clinicalhistory;
	}

	@Column(name = "NOTES", length = 1000)
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name = "CREATED", nullable = false)
	public Serializable getCreated() {
		return this.created;
	}

	public void setCreated(Serializable created) {
		this.created = created;
	}

	@Column(name = "UPDATED", nullable = false)
	public Serializable getUpdated() {
		return this.updated;
	}

	public void setUpdated(Serializable updated) {
		this.updated = updated;
	}

	@Column(name = "USERUPDATE", nullable = false, length = 100)
	public String getUserupdate() {
		return this.userupdate;
	}

	public void setUserupdate(String userupdate) {
		this.userupdate = userupdate;
	}

	@Column(name = "ACTIVE", precision = 3, scale = 0)
	public Short getActive() {
		return this.active;
	}

	public void setActive(Short active) {
		this.active = active;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "ORDER_SERVICE", joinColumns = {
			@JoinColumn(name = "IDORDER", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "IDSERVICE", nullable = false, updatable = false) })
	public Set<Service> getServices() {
		return this.services;
	}

	public void setServices(Set<Service> services) {
		this.services = services;
	}

}
