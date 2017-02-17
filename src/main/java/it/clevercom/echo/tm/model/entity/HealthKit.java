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
 * HealthKit generated by hbm2java
 */
@Entity
@Table(name = "health_kit")
public class HealthKit implements java.io.Serializable {

	private long idhealthkit;
	private String name;
	private String description;
	private String serialnumber;
	private Date created;
	private Date updated;
	private boolean active;
	private String userupdate;
	private Set<HealthkitPatient> healthkitPatients = new HashSet<HealthkitPatient>(0);
	private Set<HealthDevice> healthDevices = new HashSet<HealthDevice>(0);

	public HealthKit() {
	}

	public HealthKit(long idhealthkit, Date created, Date updated, boolean active, String userupdate) {
		this.idhealthkit = idhealthkit;
		this.created = created;
		this.updated = updated;
		this.active = active;
		this.userupdate = userupdate;
	}

	public HealthKit(long idhealthkit, String name, String description, String serialnumber, Date created, Date updated,
			boolean active, String userupdate, Set<HealthkitPatient> healthkitPatients,
			Set<HealthDevice> healthDevices) {
		this.idhealthkit = idhealthkit;
		this.name = name;
		this.description = description;
		this.serialnumber = serialnumber;
		this.created = created;
		this.updated = updated;
		this.active = active;
		this.userupdate = userupdate;
		this.healthkitPatients = healthkitPatients;
		this.healthDevices = healthDevices;
	}

	@Id

	@Column(name = "idhealthkit", unique = true, nullable = false)
	public long getIdhealthkit() {
		return this.idhealthkit;
	}

	public void setIdhealthkit(long idhealthkit) {
		this.idhealthkit = idhealthkit;
	}

	@Column(name = "name", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "serialnumber", length = 100)
	public String getSerialnumber() {
		return this.serialnumber;
	}

	public void setSerialnumber(String serialnumber) {
		this.serialnumber = serialnumber;
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

	@Column(name = "userupdate", nullable = false, length = 100)
	public String getUserupdate() {
		return this.userupdate;
	}

	public void setUserupdate(String userupdate) {
		this.userupdate = userupdate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "healthKit")
	public Set<HealthkitPatient> getHealthkitPatients() {
		return this.healthkitPatients;
	}

	public void setHealthkitPatients(Set<HealthkitPatient> healthkitPatients) {
		this.healthkitPatients = healthkitPatients;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "healthKit")
	public Set<HealthDevice> getHealthDevices() {
		return this.healthDevices;
	}

	public void setHealthDevices(Set<HealthDevice> healthDevices) {
		this.healthDevices = healthDevices;
	}

}
