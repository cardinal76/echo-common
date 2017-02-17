package it.clevercom.echo.tm.model.entity;
// Generated 17-feb-2017 16.34.42 by Hibernate Tools 5.2.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NotificationType generated by hbm2java
 */
@Entity
@Table(name = "notification_type")
public class NotificationType implements java.io.Serializable {

	private long idnotificationtype;
	private String description;
	private Date created;
	private Date updated;
	private boolean active;
	private String updateduser;
	private Set<Notification> notifications = new HashSet<Notification>(0);

	public NotificationType() {
	}

	public NotificationType(long idnotificationtype, Date created, Date updated, boolean active, String updateduser) {
		this.idnotificationtype = idnotificationtype;
		this.created = created;
		this.updated = updated;
		this.active = active;
		this.updateduser = updateduser;
	}

	public NotificationType(long idnotificationtype, String description, Date created, Date updated, boolean active,
			String updateduser, Set<Notification> notifications) {
		this.idnotificationtype = idnotificationtype;
		this.description = description;
		this.created = created;
		this.updated = updated;
		this.active = active;
		this.updateduser = updateduser;
		this.notifications = notifications;
	}

	@Id

	@Column(name = "idnotificationtype", unique = true, nullable = false)
	public long getIdnotificationtype() {
		return this.idnotificationtype;
	}

	public void setIdnotificationtype(long idnotificationtype) {
		this.idnotificationtype = idnotificationtype;
	}

	@Column(name = "description", length = 100)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	@Column(name = "updateduser", nullable = false, length = 100)
	public String getUpdateduser() {
		return this.updateduser;
	}

	public void setUpdateduser(String updateduser) {
		this.updateduser = updateduser;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "notificationType")
	public Set<Notification> getNotifications() {
		return this.notifications;
	}

	public void setNotifications(Set<Notification> notifications) {
		this.notifications = notifications;
	}

}
