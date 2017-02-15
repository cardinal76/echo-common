package it.clevercom.echo.sso.model.entity;
// Generated 15-feb-2017 17.21.43 by Hibernate Tools 5.2.0.CR1

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Application generated by hbm2java
 */
@Entity
@Table(name = "APPLICATION", uniqueConstraints = @UniqueConstraint(columnNames = "CODE"))
public class Application implements java.io.Serializable {

	private long idapplication;
	private String code;
	private String description;
	private String url;
	private Serializable created;
	private Serializable updated;
	private boolean active;
	private String updateuser;
	private Set<LoginApplication> loginApplications = new HashSet<LoginApplication>(0);

	public Application() {
	}

	public Application(long idapplication, String code, String description, Serializable created, Serializable updated,
			boolean active, String updateuser) {
		this.idapplication = idapplication;
		this.code = code;
		this.description = description;
		this.created = created;
		this.updated = updated;
		this.active = active;
		this.updateuser = updateuser;
	}

	public Application(long idapplication, String code, String description, String url, Serializable created,
			Serializable updated, boolean active, String updateuser, Set<LoginApplication> loginApplications) {
		this.idapplication = idapplication;
		this.code = code;
		this.description = description;
		this.url = url;
		this.created = created;
		this.updated = updated;
		this.active = active;
		this.updateuser = updateuser;
		this.loginApplications = loginApplications;
	}

	@Id

	@Column(name = "IDAPPLICATION", unique = true, nullable = false, precision = 10, scale = 0)
	public long getIdapplication() {
		return this.idapplication;
	}

	public void setIdapplication(long idapplication) {
		this.idapplication = idapplication;
	}

	@Column(name = "CODE", unique = true, nullable = false, length = 45)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "DESCRIPTION", nullable = false)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "URL")
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
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

	@Column(name = "ACTIVE", nullable = false, precision = 1, scale = 0)
	public boolean isActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Column(name = "UPDATEUSER", nullable = false, length = 100)
	public String getUpdateuser() {
		return this.updateuser;
	}

	public void setUpdateuser(String updateuser) {
		this.updateuser = updateuser;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "application")
	public Set<LoginApplication> getLoginApplications() {
		return this.loginApplications;
	}

	public void setLoginApplications(Set<LoginApplication> loginApplications) {
		this.loginApplications = loginApplications;
	}

}
