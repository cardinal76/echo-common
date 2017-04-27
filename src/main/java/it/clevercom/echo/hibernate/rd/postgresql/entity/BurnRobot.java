package it.clevercom.echo.hibernate.rd.postgresql.entity;
// Generated 27-apr-2017 11.40.51 by Hibernate Tools 5.2.2.Final


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * BurnRobot generated by hbm2java
 */
@Entity
@Table(name="rd_burn_robot"
)
public class BurnRobot  implements java.io.Serializable {


     private Long idburnrobot;
     private OrganizationUnit organizationUnit;
     private String name;
     private String hostname;
     private String ipaddress;
     private String uri;

    public BurnRobot() {
    }

	
    public BurnRobot(String name) {
        this.name = name;
    }
    public BurnRobot(OrganizationUnit organizationUnit, String name, String hostname, String ipaddress, String uri) {
       this.organizationUnit = organizationUnit;
       this.name = name;
       this.hostname = hostname;
       this.ipaddress = ipaddress;
       this.uri = uri;
    }
   
     @GenericGenerator(name="generator", strategy="org.hibernate.id.enhanced.SequenceStyleGenerator", parameters={@Parameter(name="optimizer", value="none"), @Parameter(name="sequence_name", value="burn_robot_idburnrobot_seq"), @Parameter(name="increment_size", value="1")})@Id @GeneratedValue(generator="generator")

    
    @Column(name="idburnrobot", unique=true, nullable=false)
    public Long getIdburnrobot() {
        return this.idburnrobot;
    }
    
    public void setIdburnrobot(Long idburnrobot) {
        this.idburnrobot = idburnrobot;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idorganizationunit")
    public OrganizationUnit getOrganizationUnit() {
        return this.organizationUnit;
    }
    
    public void setOrganizationUnit(OrganizationUnit organizationUnit) {
        this.organizationUnit = organizationUnit;
    }

    
    @Column(name="name", nullable=false)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="hostname")
    public String getHostname() {
        return this.hostname;
    }
    
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    
    @Column(name="ipaddress")
    public String getIpaddress() {
        return this.ipaddress;
    }
    
    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    
    @Column(name="uri")
    public String getUri() {
        return this.uri;
    }
    
    public void setUri(String uri) {
        this.uri = uri;
    }




}


