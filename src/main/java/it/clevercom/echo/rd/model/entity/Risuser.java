package it.clevercom.echo.rd.model.entity;
// Generated 15-feb-2017 17.20.09 by Hibernate Tools 5.2.0.CR1

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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Risuser generated by hbm2java
 */
@Entity
@Table(name = "RISUSER")
public class Risuser implements java.io.Serializable {

	private BigDecimal idrisuser;
	private Municipality municipality;
	private String username;
	private String type;
	private String name;
	private String surname;
	private char gender;
	private String taxcode;
	private Date birthdate;
	private String nationality;
	private String homeaddress;
	private String phonenumber;
	private Date created;
	private Date updated;
	private String userupdate;
	private BigDecimal active;
	private Set<Phrasebook> phrasebooks = new HashSet<Phrasebook>(0);
	private Set<Worklist> worklists = new HashSet<Worklist>(0);
	private Set<Report> reports = new HashSet<Report>(0);

	public Risuser() {
	}

	public Risuser(BigDecimal idrisuser, String username, String type, String name, String surname, char gender) {
		this.idrisuser = idrisuser;
		this.username = username;
		this.type = type;
		this.name = name;
		this.surname = surname;
		this.gender = gender;
	}

	public Risuser(BigDecimal idrisuser, Municipality municipality, String username, String type, String name,
			String surname, char gender, String taxcode, Date birthdate, String nationality, String homeaddress,
			String phonenumber, Date created, Date updated, String userupdate, BigDecimal active,
			Set<Phrasebook> phrasebooks, Set<Worklist> worklists, Set<Report> reports) {
		this.idrisuser = idrisuser;
		this.municipality = municipality;
		this.username = username;
		this.type = type;
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.taxcode = taxcode;
		this.birthdate = birthdate;
		this.nationality = nationality;
		this.homeaddress = homeaddress;
		this.phonenumber = phonenumber;
		this.created = created;
		this.updated = updated;
		this.userupdate = userupdate;
		this.active = active;
		this.phrasebooks = phrasebooks;
		this.worklists = worklists;
		this.reports = reports;
	}

	@Id

	@Column(name = "IDRISUSER", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getIdrisuser() {
		return this.idrisuser;
	}

	public void setIdrisuser(BigDecimal idrisuser) {
		this.idrisuser = idrisuser;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDMUNICIPALITY")
	public Municipality getMunicipality() {
		return this.municipality;
	}

	public void setMunicipality(Municipality municipality) {
		this.municipality = municipality;
	}

	@Column(name = "USERNAME", nullable = false, length = 100)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "TYPE", nullable = false, length = 50)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "NAME", nullable = false, length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "SURNAME", nullable = false, length = 100)
	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Column(name = "GENDER", nullable = false, length = 1)
	public char getGender() {
		return this.gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Column(name = "TAXCODE", length = 20)
	public String getTaxcode() {
		return this.taxcode;
	}

	public void setTaxcode(String taxcode) {
		this.taxcode = taxcode;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "BIRTHDATE", length = 7)
	public Date getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	@Column(name = "NATIONALITY", length = 100)
	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Column(name = "HOMEADDRESS", length = 100)
	public String getHomeaddress() {
		return this.homeaddress;
	}

	public void setHomeaddress(String homeaddress) {
		this.homeaddress = homeaddress;
	}

	@Column(name = "PHONENUMBER", length = 100)
	public String getPhonenumber() {
		return this.phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED", length = 7)
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATED", length = 7)
	public Date getUpdated() {
		return this.updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	@Column(name = "USERUPDATE", length = 100)
	public String getUserupdate() {
		return this.userupdate;
	}

	public void setUserupdate(String userupdate) {
		this.userupdate = userupdate;
	}

	@Column(name = "ACTIVE", precision = 22, scale = 0)
	public BigDecimal getActive() {
		return this.active;
	}

	public void setActive(BigDecimal active) {
		this.active = active;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "risuser")
	public Set<Phrasebook> getPhrasebooks() {
		return this.phrasebooks;
	}

	public void setPhrasebooks(Set<Phrasebook> phrasebooks) {
		this.phrasebooks = phrasebooks;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "risuser")
	public Set<Worklist> getWorklists() {
		return this.worklists;
	}

	public void setWorklists(Set<Worklist> worklists) {
		this.worklists = worklists;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "USER_REPORT", joinColumns = {
			@JoinColumn(name = "IDUSER", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "IDREPORT", nullable = false, updatable = false) })
	public Set<Report> getReports() {
		return this.reports;
	}

	public void setReports(Set<Report> reports) {
		this.reports = reports;
	}

}
