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
 * Message generated by hbm2java
 */
@Entity
@Table(name = "message")
public class Message implements java.io.Serializable {

	private long idmessage;
	private Patient patient;
	private Physician physician;
	private String message;
	private Date readedbypatient;
	private Date readedbyphysician;
	private String attachmenturl;
	private Date created;
	private Date updated;
	private boolean active;
	private String updateuser;

	public Message() {
	}

	public Message(long idmessage, Patient patient, Date created, Date updated, boolean active, String updateuser) {
		this.idmessage = idmessage;
		this.patient = patient;
		this.created = created;
		this.updated = updated;
		this.active = active;
		this.updateuser = updateuser;
	}

	public Message(long idmessage, Patient patient, Physician physician, String message, Date readedbypatient,
			Date readedbyphysician, String attachmenturl, Date created, Date updated, boolean active,
			String updateuser) {
		this.idmessage = idmessage;
		this.patient = patient;
		this.physician = physician;
		this.message = message;
		this.readedbypatient = readedbypatient;
		this.readedbyphysician = readedbyphysician;
		this.attachmenturl = attachmenturl;
		this.created = created;
		this.updated = updated;
		this.active = active;
		this.updateuser = updateuser;
	}

	@Id

	@Column(name = "idmessage", unique = true, nullable = false)
	public long getIdmessage() {
		return this.idmessage;
	}

	public void setIdmessage(long idmessage) {
		this.idmessage = idmessage;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idpatient", nullable = false)
	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idphysician")
	public Physician getPhysician() {
		return this.physician;
	}

	public void setPhysician(Physician physician) {
		this.physician = physician;
	}

	@Column(name = "message")
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "readedbypatient", length = 29)
	public Date getReadedbypatient() {
		return this.readedbypatient;
	}

	public void setReadedbypatient(Date readedbypatient) {
		this.readedbypatient = readedbypatient;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "readedbyphysician", length = 29)
	public Date getReadedbyphysician() {
		return this.readedbyphysician;
	}

	public void setReadedbyphysician(Date readedbyphysician) {
		this.readedbyphysician = readedbyphysician;
	}

	@Column(name = "attachmenturl")
	public String getAttachmenturl() {
		return this.attachmenturl;
	}

	public void setAttachmenturl(String attachmenturl) {
		this.attachmenturl = attachmenturl;
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
