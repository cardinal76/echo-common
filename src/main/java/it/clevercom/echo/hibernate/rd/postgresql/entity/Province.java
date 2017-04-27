package it.clevercom.echo.hibernate.rd.postgresql.entity;
// Generated 27-apr-2017 11.40.51 by Hibernate Tools 5.2.2.Final


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
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Province generated by hbm2java
 */
@Entity
@Table(name="rd_province"
)
public class Province  implements java.io.Serializable {


     private Long idprovince;
     private Region region;
     private String provincename;
     private String provincestdcode;
     private Set<Municipality> municipalities = new HashSet<Municipality>(0);

    public Province() {
    }

    public Province(Region region, String provincename, String provincestdcode, Set<Municipality> municipalities) {
       this.region = region;
       this.provincename = provincename;
       this.provincestdcode = provincestdcode;
       this.municipalities = municipalities;
    }
   
     @GenericGenerator(name="generator", strategy="org.hibernate.id.enhanced.SequenceStyleGenerator", parameters={@Parameter(name="optimizer", value="none"), @Parameter(name="sequence_name", value="province_idprovince_seq"), @Parameter(name="increment_size", value="1")})@Id @GeneratedValue(generator="generator")

    
    @Column(name="idprovince", unique=true, nullable=false)
    public Long getIdprovince() {
        return this.idprovince;
    }
    
    public void setIdprovince(Long idprovince) {
        this.idprovince = idprovince;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idregion")
    public Region getRegion() {
        return this.region;
    }
    
    public void setRegion(Region region) {
        this.region = region;
    }

    
    @Column(name="provincename", length=100)
    public String getProvincename() {
        return this.provincename;
    }
    
    public void setProvincename(String provincename) {
        this.provincename = provincename;
    }

    
    @Column(name="provincestdcode", length=10)
    public String getProvincestdcode() {
        return this.provincestdcode;
    }
    
    public void setProvincestdcode(String provincestdcode) {
        this.provincestdcode = provincestdcode;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="province")
    public Set<Municipality> getMunicipalities() {
        return this.municipalities;
    }
    
    public void setMunicipalities(Set<Municipality> municipalities) {
        this.municipalities = municipalities;
    }




}


