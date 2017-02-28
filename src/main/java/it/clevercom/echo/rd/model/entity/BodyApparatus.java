package it.clevercom.echo.rd.model.entity;
// Generated 28-feb-2017 10.00.08 by Hibernate Tools 5.2.0.CR1

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
 * BodyApparatus generated by hbm2java
 */
@Entity
@Table(name = "body_apparatus")
public class BodyApparatus implements java.io.Serializable {

	private char code;
	private String description;
	private Date created;
	private Date updated;
	private String userupdate;
	private boolean active;
	private Set<Service> services = new HashSet<Service>(0);

	public BodyApparatus() {
	}

	public BodyApparatus(char code, String description, Date created, Date updated, String userupdate, boolean active) {
		this.code = code;
		this.description = description;
		this.created = created;
		this.updated = updated;
		this.userupdate = userupdate;
		this.active = active;
	}

	public BodyApparatus(char code, String description, Date created, Date updated, String userupdate, boolean active,
			Set<Service> services) {
		this.code = code;
		this.description = description;
		this.created = created;
		this.updated = updated;
		this.userupdate = userupdate;
		this.active = active;
		this.services = services;
	}

	@Id

	@Column(name = "code", unique = true, nullable = false, length = 1)
	public char getCode() {
		return this.code;
	}

	public void setCode(char code) {
		this.code = code;
	}

	@Column(name = "description", nullable = false)
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bodyApparatus")
	public Set<Service> getServices() {
		return this.services;
	}

	public void setServices(Set<Service> services) {
		this.services = services;
	}

}
