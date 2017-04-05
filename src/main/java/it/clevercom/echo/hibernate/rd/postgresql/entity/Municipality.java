package it.clevercom.echo.hibernate.rd.postgresql.entity;
// Generated 5-apr-2017 11.35.01 by Hibernate Tools 5.2.2.Final


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Municipality generated by hbm2java
 */
@Entity
@Table(name="rd_municipality"
)
public class Municipality  implements java.io.Serializable {


     private Long idmunicipality;
     private Province province;
     private String municipalityname;
     private String municipalitystdcode;
     private Date created;
     private Date updated;
     private String userupdate;
     private Boolean active;
     private String postalcode;
     private Set<Patient> patientsForDomicileidmunicipality = new HashSet<Patient>(0);
     private Set<Patient> patientsForResidenceidmunicipality = new HashSet<Patient>(0);
     private Set<Patient> patientsForBirthplaceidmunicipality = new HashSet<Patient>(0);
     private Set<OrganizationUnit> organizationUnits = new HashSet<OrganizationUnit>(0);

    public Municipality() {
    }

	
    public Municipality(Date created, Date updated, String userupdate, Boolean active) {
        this.created = created;
        this.updated = updated;
        this.userupdate = userupdate;
        this.active = active;
    }
    public Municipality(Province province, String municipalityname, String municipalitystdcode, Date created, Date updated, String userupdate, Boolean active, String postalcode, Set<Patient> patientsForDomicileidmunicipality, Set<Patient> patientsForResidenceidmunicipality, Set<Patient> patientsForBirthplaceidmunicipality, Set<OrganizationUnit> organizationUnits) {
       this.province = province;
       this.municipalityname = municipalityname;
       this.municipalitystdcode = municipalitystdcode;
       this.created = created;
       this.updated = updated;
       this.userupdate = userupdate;
       this.active = active;
       this.postalcode = postalcode;
       this.patientsForDomicileidmunicipality = patientsForDomicileidmunicipality;
       this.patientsForResidenceidmunicipality = patientsForResidenceidmunicipality;
       this.patientsForBirthplaceidmunicipality = patientsForBirthplaceidmunicipality;
       this.organizationUnits = organizationUnits;
    }
   
     @GenericGenerator(name="generator", strategy="org.hibernate.id.enhanced.SequenceStyleGenerator", parameters={@Parameter(name="optimizer", value="none"), @Parameter(name="sequence_name", value="municipality_idmunicipality_seq"), @Parameter(name="increment_size", value="1")})@Id @GeneratedValue(generator="generator")

    
    @Column(name="idmunicipality", unique=true, nullable=false)
    public Long getIdmunicipality() {
        return this.idmunicipality;
    }
    
    public void setIdmunicipality(Long idmunicipality) {
        this.idmunicipality = idmunicipality;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idprovince")
    public Province getProvince() {
        return this.province;
    }
    
    public void setProvince(Province province) {
        this.province = province;
    }

    
    @Column(name="municipalityname", length=100)
    public String getMunicipalityname() {
        return this.municipalityname;
    }
    
    public void setMunicipalityname(String municipalityname) {
        this.municipalityname = municipalityname;
    }

    
    @Column(name="municipalitystdcode", length=10)
    public String getMunicipalitystdcode() {
        return this.municipalitystdcode;
    }
    
    public void setMunicipalitystdcode(String municipalitystdcode) {
        this.municipalitystdcode = municipalitystdcode;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created", nullable=false, length=29)
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="updated", nullable=false, length=29)
    public Date getUpdated() {
        return this.updated;
    }
    
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    
    @Column(name="userupdate", nullable=false, length=100)
    public String getUserupdate() {
        return this.userupdate;
    }
    
    public void setUserupdate(String userupdate) {
        this.userupdate = userupdate;
    }

    
    @Column(name="active", nullable=false)
    public Boolean getActive() {
        return this.active;
    }
    
    public void setActive(Boolean active) {
        this.active = active;
    }

    
    @Column(name="postalcode", length=25)
    public String getPostalcode() {
        return this.postalcode;
    }
    
    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="municipalityByDomicileidmunicipality")
    public Set<Patient> getPatientsForDomicileidmunicipality() {
        return this.patientsForDomicileidmunicipality;
    }
    
    public void setPatientsForDomicileidmunicipality(Set<Patient> patientsForDomicileidmunicipality) {
        this.patientsForDomicileidmunicipality = patientsForDomicileidmunicipality;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="municipalityByResidenceidmunicipality")
    public Set<Patient> getPatientsForResidenceidmunicipality() {
        return this.patientsForResidenceidmunicipality;
    }
    
    public void setPatientsForResidenceidmunicipality(Set<Patient> patientsForResidenceidmunicipality) {
        this.patientsForResidenceidmunicipality = patientsForResidenceidmunicipality;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="municipalityByBirthplaceidmunicipality")
    public Set<Patient> getPatientsForBirthplaceidmunicipality() {
        return this.patientsForBirthplaceidmunicipality;
    }
    
    public void setPatientsForBirthplaceidmunicipality(Set<Patient> patientsForBirthplaceidmunicipality) {
        this.patientsForBirthplaceidmunicipality = patientsForBirthplaceidmunicipality;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="municipality")
    public Set<OrganizationUnit> getOrganizationUnits() {
        return this.organizationUnits;
    }
    
    public void setOrganizationUnits(Set<OrganizationUnit> organizationUnits) {
        this.organizationUnits = organizationUnits;
    }




}


