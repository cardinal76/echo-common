package it.clevercom.echo.hibernate.rd.postgresql.entity;
// Generated 12-apr-2017 9.59.56 by Hibernate Tools 5.2.2.Final


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
 * OrganizationUnit generated by hbm2java
 */
@Entity
@Table(name="rd_organization_unit"
)
public class OrganizationUnit  implements java.io.Serializable {


     private Long idorganizationunit;
     private Municipality municipality;
     private OrganizationUnit organizationUnit;
     private String name;
     private String description;
     private String address;
     private String telephone;
     private String email;
     private String fax;
     private String website;
     private String type;
     private Date created;
     private Date updated;
     private String userupdate;
     private Boolean active;
     private String code;
     private Set<Order> ordersForOriginorganizationunitid = new HashSet<Order>(0);
     private Set<Patient> patientsForIdintorganizationunit = new HashSet<Patient>(0);
     private Set<BurnRobot> burnRobots = new HashSet<BurnRobot>(0);
     private Set<Order> ordersForTargetorganizationunitid = new HashSet<Order>(0);
     private Set<Patient> patientsForIdextorganizationunit = new HashSet<Patient>(0);
     private Set<Modality> modalities = new HashSet<Modality>(0);
     private Set<OrganizationUnit> organizationUnits = new HashSet<OrganizationUnit>(0);

    public OrganizationUnit() {
    }

	
    public OrganizationUnit(Date created, Date updated, String userupdate, Boolean active) {
        this.created = created;
        this.updated = updated;
        this.userupdate = userupdate;
        this.active = active;
    }
    public OrganizationUnit(Municipality municipality, OrganizationUnit organizationUnit, String name, String description, String address, String telephone, String email, String fax, String website, String type, Date created, Date updated, String userupdate, Boolean active, String code, Set<Order> ordersForOriginorganizationunitid, Set<Patient> patientsForIdintorganizationunit, Set<BurnRobot> burnRobots, Set<Order> ordersForTargetorganizationunitid, Set<Patient> patientsForIdextorganizationunit, Set<Modality> modalities, Set<OrganizationUnit> organizationUnits) {
       this.municipality = municipality;
       this.organizationUnit = organizationUnit;
       this.name = name;
       this.description = description;
       this.address = address;
       this.telephone = telephone;
       this.email = email;
       this.fax = fax;
       this.website = website;
       this.type = type;
       this.created = created;
       this.updated = updated;
       this.userupdate = userupdate;
       this.active = active;
       this.code = code;
       this.ordersForOriginorganizationunitid = ordersForOriginorganizationunitid;
       this.patientsForIdintorganizationunit = patientsForIdintorganizationunit;
       this.burnRobots = burnRobots;
       this.ordersForTargetorganizationunitid = ordersForTargetorganizationunitid;
       this.patientsForIdextorganizationunit = patientsForIdextorganizationunit;
       this.modalities = modalities;
       this.organizationUnits = organizationUnits;
    }
   
     @GenericGenerator(name="generator", strategy="org.hibernate.id.enhanced.SequenceStyleGenerator", parameters={@Parameter(name="optimizer", value="none"), @Parameter(name="sequence_name", value="organizationunit_idorganizationunit_seq"), @Parameter(name="increment_size", value="1")})@Id @GeneratedValue(generator="generator")

    
    @Column(name="idorganizationunit", unique=true, nullable=false)
    public Long getIdorganizationunit() {
        return this.idorganizationunit;
    }
    
    public void setIdorganizationunit(Long idorganizationunit) {
        this.idorganizationunit = idorganizationunit;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idmunicipality")
    public Municipality getMunicipality() {
        return this.municipality;
    }
    
    public void setMunicipality(Municipality municipality) {
        this.municipality = municipality;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="parentid")
    public OrganizationUnit getOrganizationUnit() {
        return this.organizationUnit;
    }
    
    public void setOrganizationUnit(OrganizationUnit organizationUnit) {
        this.organizationUnit = organizationUnit;
    }

    
    @Column(name="name", length=100)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="description")
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="address", length=45)
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    
    @Column(name="telephone", length=100)
    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    
    @Column(name="email", length=100)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="fax", length=100)
    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }

    
    @Column(name="website", length=100)
    public String getWebsite() {
        return this.website;
    }
    
    public void setWebsite(String website) {
        this.website = website;
    }

    
    @Column(name="type", length=20)
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
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

    
    @Column(name="code", length=10)
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="organizationUnitByOriginorganizationunitid")
    public Set<Order> getOrdersForOriginorganizationunitid() {
        return this.ordersForOriginorganizationunitid;
    }
    
    public void setOrdersForOriginorganizationunitid(Set<Order> ordersForOriginorganizationunitid) {
        this.ordersForOriginorganizationunitid = ordersForOriginorganizationunitid;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="organizationUnitByIdintorganizationunit")
    public Set<Patient> getPatientsForIdintorganizationunit() {
        return this.patientsForIdintorganizationunit;
    }
    
    public void setPatientsForIdintorganizationunit(Set<Patient> patientsForIdintorganizationunit) {
        this.patientsForIdintorganizationunit = patientsForIdintorganizationunit;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="organizationUnit")
    public Set<BurnRobot> getBurnRobots() {
        return this.burnRobots;
    }
    
    public void setBurnRobots(Set<BurnRobot> burnRobots) {
        this.burnRobots = burnRobots;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="organizationUnitByTargetorganizationunitid")
    public Set<Order> getOrdersForTargetorganizationunitid() {
        return this.ordersForTargetorganizationunitid;
    }
    
    public void setOrdersForTargetorganizationunitid(Set<Order> ordersForTargetorganizationunitid) {
        this.ordersForTargetorganizationunitid = ordersForTargetorganizationunitid;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="organizationUnitByIdextorganizationunit")
    public Set<Patient> getPatientsForIdextorganizationunit() {
        return this.patientsForIdextorganizationunit;
    }
    
    public void setPatientsForIdextorganizationunit(Set<Patient> patientsForIdextorganizationunit) {
        this.patientsForIdextorganizationunit = patientsForIdextorganizationunit;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="organizationUnit")
    public Set<Modality> getModalities() {
        return this.modalities;
    }
    
    public void setModalities(Set<Modality> modalities) {
        this.modalities = modalities;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="organizationUnit")
    public Set<OrganizationUnit> getOrganizationUnits() {
        return this.organizationUnits;
    }
    
    public void setOrganizationUnits(Set<OrganizationUnit> organizationUnits) {
        this.organizationUnits = organizationUnits;
    }




}


