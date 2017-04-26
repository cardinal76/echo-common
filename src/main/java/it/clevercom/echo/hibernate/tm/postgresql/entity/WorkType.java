package it.clevercom.echo.hibernate.tm.postgresql.entity;
// Generated 20-apr-2017 6.54.04 by Hibernate Tools 5.2.2.Final


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
 * WorkType generated by hbm2java
 */
@Entity
@Table(name="tm_work_type"
)
public class WorkType  implements java.io.Serializable {


     private Long idworktype;
     private String name;
     private String description;
     private Date created;
     private Date updated;
     private boolean active;
     private String userupdate;
     private Set<WorkTask> workTasks = new HashSet<WorkTask>(0);

    public WorkType() {
    }

	
    public WorkType(Long idworktype, String name, Date created, Date updated, boolean active, String userupdate) {
        this.idworktype = idworktype;
        this.name = name;
        this.created = created;
        this.updated = updated;
        this.active = active;
        this.userupdate = userupdate;
    }
    public WorkType(Long idworktype, String name, String description, Date created, Date updated, boolean active, String userupdate, Set<WorkTask> workTasks) {
       this.idworktype = idworktype;
       this.name = name;
       this.description = description;
       this.created = created;
       this.updated = updated;
       this.active = active;
       this.userupdate = userupdate;
       this.workTasks = workTasks;
    }
   
     @Id 

    
    @Column(name="idworktype", unique=true, nullable=false)
    public Long getIdworktype() {
        return this.idworktype;
    }
    
    public void setIdworktype(Long idworktype) {
        this.idworktype = idworktype;
    }

    
    @Column(name="name", nullable=false, length=100)
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

    
    @Column(name="active", nullable=false)
    public boolean isActive() {
        return this.active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }

    
    @Column(name="userupdate", nullable=false, length=100)
    public String getUserupdate() {
        return this.userupdate;
    }
    
    public void setUserupdate(String userupdate) {
        this.userupdate = userupdate;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="workType")
    public Set<WorkTask> getWorkTasks() {
        return this.workTasks;
    }
    
    public void setWorkTasks(Set<WorkTask> workTasks) {
        this.workTasks = workTasks;
    }




}


