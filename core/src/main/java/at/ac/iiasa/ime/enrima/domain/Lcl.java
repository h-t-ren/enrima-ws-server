package at.ac.iiasa.ime.enrima.domain;
// Generated Nov 29, 2011 9:34:07 AM by Hibernate Tools 3.2.2.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Lcl generated by hbm2java
 */
@Entity
@Table(name="lcl"
)
public class Lcl  implements java.io.Serializable {


     private String idLcl;
     private DbSts dbSts;
     private Cntr cntr;
     private Lng lng;
     private String variant;
     private Set<LblLcl> lblLcls = new HashSet<LblLcl>(0);
     private Set<MsgLcl> msgLcls = new HashSet<MsgLcl>(0);

    public Lcl() {
    }

	
    public Lcl(String idLcl, DbSts dbSts, Cntr cntr, Lng lng) {
        this.idLcl = idLcl;
        this.dbSts = dbSts;
        this.cntr = cntr;
        this.lng = lng;
    }
    public Lcl(String idLcl, DbSts dbSts, Cntr cntr, Lng lng, String variant, Set<LblLcl> lblLcls, Set<MsgLcl> msgLcls) {
       this.idLcl = idLcl;
       this.dbSts = dbSts;
       this.cntr = cntr;
       this.lng = lng;
       this.variant = variant;
       this.lblLcls = lblLcls;
       this.msgLcls = msgLcls;
    }
   
     @Id 
    
    @Column(name="id_lcl", unique=true, nullable=false, length=5)
    public String getIdLcl() {
        return this.idLcl;
    }
    
    public void setIdLcl(String idLcl) {
        this.idLcl = idLcl;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="db_sts", nullable=false)
    public DbSts getDbSts() {
        return this.dbSts;
    }
    
    public void setDbSts(DbSts dbSts) {
        this.dbSts = dbSts;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cntr", nullable=false)
    public Cntr getCntr() {
        return this.cntr;
    }
    
    public void setCntr(Cntr cntr) {
        this.cntr = cntr;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="lng", nullable=false)
    public Lng getLng() {
        return this.lng;
    }
    
    public void setLng(Lng lng) {
        this.lng = lng;
    }
    
    @Column(name="variant", length=20)
    public String getVariant() {
        return this.variant;
    }
    
    public void setVariant(String variant) {
        this.variant = variant;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="lcl")
    public Set<LblLcl> getLblLcls() {
        return this.lblLcls;
    }
    
    public void setLblLcls(Set<LblLcl> lblLcls) {
        this.lblLcls = lblLcls;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="lcl")
    public Set<MsgLcl> getMsgLcls() {
        return this.msgLcls;
    }
    
    public void setMsgLcls(Set<MsgLcl> msgLcls) {
        this.msgLcls = msgLcls;
    }




}


