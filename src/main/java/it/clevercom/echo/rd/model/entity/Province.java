package it.clevercom.echo.rd.model.entity;
// Generated 21-feb-2017 16.05.29 by Hibernate Tools 5.2.0.CR1

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
 * Province generated by hbm2java
 */
@Entity
@Table(name = "province")
public class Province implements java.io.Serializable {

	private long idprovince;
	private Region region;
	private String provincename;
	private String provincestdcode;
	private Date created;
	private Date updated;
	private String updateuser;
	private boolean active;
	private Set<Municipality> municipalities = new HashSet<Municipality>(0);

	public Province() {
	}

	public Province(long idprovince, Date created, Date updated, String updateuser, boolean active) {
		this.idprovince = idprovince;
		this.created = created;
		this.updated = updated;
		this.updateuser = updateuser;
		this.active = active;
	}

	public Province(long idprovince, Region region, String provincename, String provincestdcode, Date created,
			Date updated, String updateuser, boolean active, Set<Municipality> municipalities) {
		this.idprovince = idprovince;
		this.region = region;
		this.provincename = provincename;
		this.provincestdcode = provincestdcode;
		this.created = created;
		this.updated = updated;
		this.updateuser = updateuser;
		this.active = active;
		this.municipalities = municipalities;
	}

	@Id

	@Column(name = "idprovince", unique = true, nullable = false)
	public long getIdprovince() {
		return this.idprovince;
	}

	public void setIdprovince(long idprovince) {
		this.idprovince = idprovince;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idregion")
	public Region getRegion() {
		return this.region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	@Column(name = "provincename", length = 100)
	public String getProvincename() {
		return this.provincename;
	}

	public void setProvincename(String provincename) {
		this.provincename = provincename;
	}

	@Column(name = "provincestdcode", length = 10)
	public String getProvincestdcode() {
		return this.provincestdcode;
	}

	public void setProvincestdcode(String provincestdcode) {
		this.provincestdcode = provincestdcode;
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

	@Column(name = "updateuser", nullable = false, length = 100)
	public String getUpdateuser() {
		return this.updateuser;
	}

	public void setUpdateuser(String updateuser) {
		this.updateuser = updateuser;
	}

	@Column(name = "active", nullable = false)
	public boolean isActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "province")
	public Set<Municipality> getMunicipalities() {
		return this.municipalities;
	}

	public void setMunicipalities(Set<Municipality> municipalities) {
		this.municipalities = municipalities;
	}

}
