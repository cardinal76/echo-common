package it.clevercom.echo.hibernate.rd.postgresql.entity;
// Generated 27-apr-2017 11.40.51 by Hibernate Tools 5.2.2.Final


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Country generated by hbm2java
 */
@Entity
@Table(name="rd_country"
)
public class Country  implements java.io.Serializable {


     private Long idcountry;
     private String countryname;
     private String countrynicename;
     private String countryiso2;
     private String countryiso3;
     private Long countryisonumcode;
     private Set<Patient> patientsForDomicileidcountry = new HashSet<Patient>(0);
     private Set<Patient> patientsForResidenceidcountry = new HashSet<Patient>(0);
     private Set<Region> regions = new HashSet<Region>(0);
     private Set<Patient> patientsForBirthplaceidcountry = new HashSet<Patient>(0);

    public Country() {
    }

    public Country(String countryname, String countrynicename, String countryiso2, String countryiso3, Long countryisonumcode, Set<Patient> patientsForDomicileidcountry, Set<Patient> patientsForResidenceidcountry, Set<Region> regions, Set<Patient> patientsForBirthplaceidcountry) {
       this.countryname = countryname;
       this.countrynicename = countrynicename;
       this.countryiso2 = countryiso2;
       this.countryiso3 = countryiso3;
       this.countryisonumcode = countryisonumcode;
       this.patientsForDomicileidcountry = patientsForDomicileidcountry;
       this.patientsForResidenceidcountry = patientsForResidenceidcountry;
       this.regions = regions;
       this.patientsForBirthplaceidcountry = patientsForBirthplaceidcountry;
    }
   
     @GenericGenerator(name="generator", strategy="org.hibernate.id.enhanced.SequenceStyleGenerator", parameters={@Parameter(name="optimizer", value="none"), @Parameter(name="sequence_name", value="country_idcountry_seq"), @Parameter(name="increment_size", value="1")})@Id @GeneratedValue(generator="generator")

    
    @Column(name="idcountry", unique=true, nullable=false)
    public Long getIdcountry() {
        return this.idcountry;
    }
    
    public void setIdcountry(Long idcountry) {
        this.idcountry = idcountry;
    }

    
    @Column(name="countryname", length=100)
    public String getCountryname() {
        return this.countryname;
    }
    
    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    
    @Column(name="countrynicename", length=100)
    public String getCountrynicename() {
        return this.countrynicename;
    }
    
    public void setCountrynicename(String countrynicename) {
        this.countrynicename = countrynicename;
    }

    
    @Column(name="countryiso2", length=10)
    public String getCountryiso2() {
        return this.countryiso2;
    }
    
    public void setCountryiso2(String countryiso2) {
        this.countryiso2 = countryiso2;
    }

    
    @Column(name="countryiso3", length=10)
    public String getCountryiso3() {
        return this.countryiso3;
    }
    
    public void setCountryiso3(String countryiso3) {
        this.countryiso3 = countryiso3;
    }

    
    @Column(name="countryisonumcode")
    public Long getCountryisonumcode() {
        return this.countryisonumcode;
    }
    
    public void setCountryisonumcode(Long countryisonumcode) {
        this.countryisonumcode = countryisonumcode;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="countryByDomicileidcountry")
    public Set<Patient> getPatientsForDomicileidcountry() {
        return this.patientsForDomicileidcountry;
    }
    
    public void setPatientsForDomicileidcountry(Set<Patient> patientsForDomicileidcountry) {
        this.patientsForDomicileidcountry = patientsForDomicileidcountry;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="countryByResidenceidcountry")
    public Set<Patient> getPatientsForResidenceidcountry() {
        return this.patientsForResidenceidcountry;
    }
    
    public void setPatientsForResidenceidcountry(Set<Patient> patientsForResidenceidcountry) {
        this.patientsForResidenceidcountry = patientsForResidenceidcountry;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="country")
    public Set<Region> getRegions() {
        return this.regions;
    }
    
    public void setRegions(Set<Region> regions) {
        this.regions = regions;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="countryByBirthplaceidcountry")
    public Set<Patient> getPatientsForBirthplaceidcountry() {
        return this.patientsForBirthplaceidcountry;
    }
    
    public void setPatientsForBirthplaceidcountry(Set<Patient> patientsForBirthplaceidcountry) {
        this.patientsForBirthplaceidcountry = patientsForBirthplaceidcountry;
    }




}


