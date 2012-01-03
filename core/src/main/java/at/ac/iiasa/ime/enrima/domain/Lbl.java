package at.ac.iiasa.ime.enrima.domain;
// Generated Nov 29, 2011 9:34:07 AM by Hibernate Tools 3.2.2.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Lbl generated by hbm2java
 */
@Entity
@Table(name="lbl"
)
public class Lbl  implements java.io.Serializable {


     private Integer idLbl;
     private DbSts dbSts;
     private Sn sn;
     private short objTp;
     private Set<UsrGrp> usrGrps = new HashSet<UsrGrp>(0);
     private Set<UsrGrpLg> usrGrpLgs = new HashSet<UsrGrpLg>(0);
     private Set<LblLg> lblLgs = new HashSet<LblLg>(0);
     private Set<LblLcl> lblLcls = new HashSet<LblLcl>(0);
     private Set<Rl> rls = new HashSet<Rl>(0);
     private Set<Athntctn> athntctns = new HashSet<Athntctn>(0);

    public Lbl() {
    }

	
    public Lbl(DbSts dbSts, Sn sn, short objTp) {
        this.dbSts = dbSts;
        this.sn = sn;
        this.objTp = objTp;
    }
    public Lbl(DbSts dbSts, Sn sn, short objTp, Set<UsrGrp> usrGrps, Set<UsrGrpLg> usrGrpLgs, Set<LblLg> lblLgs, Set<LblLcl> lblLcls, Set<Rl> rls, Set<Athntctn> athntctns) {
       this.dbSts = dbSts;
       this.sn = sn;
       this.objTp = objTp;
       this.usrGrps = usrGrps;
       this.usrGrpLgs = usrGrpLgs;
       this.lblLgs = lblLgs;
       this.lblLcls = lblLcls;
       this.rls = rls;
       this.athntctns = athntctns;
    }
   
     @SequenceGenerator(name="generator", sequenceName="seq__lbl__id_lbl")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")
    
    @Column(name="id_lbl", unique=true, nullable=false)
    public Integer getIdLbl() {
        return this.idLbl;
    }
    
    public void setIdLbl(Integer idLbl) {
        this.idLbl = idLbl;
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
    @JoinColumn(name="sn", nullable=false)
    public Sn getSn() {
        return this.sn;
    }
    
    public void setSn(Sn sn) {
        this.sn = sn;
    }
    
    @Column(name="obj_tp", nullable=false)
    public short getObjTp() {
        return this.objTp;
    }
    
    public void setObjTp(short objTp) {
        this.objTp = objTp;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="lbl")
    public Set<UsrGrp> getUsrGrps() {
        return this.usrGrps;
    }
    
    public void setUsrGrps(Set<UsrGrp> usrGrps) {
        this.usrGrps = usrGrps;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="lbl")
    public Set<UsrGrpLg> getUsrGrpLgs() {
        return this.usrGrpLgs;
    }
    
    public void setUsrGrpLgs(Set<UsrGrpLg> usrGrpLgs) {
        this.usrGrpLgs = usrGrpLgs;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="lbl")
    public Set<LblLg> getLblLgs() {
        return this.lblLgs;
    }
    
    public void setLblLgs(Set<LblLg> lblLgs) {
        this.lblLgs = lblLgs;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="lbl")
    public Set<LblLcl> getLblLcls() {
        return this.lblLcls;
    }
    
    public void setLblLcls(Set<LblLcl> lblLcls) {
        this.lblLcls = lblLcls;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="lbl")
    public Set<Rl> getRls() {
        return this.rls;
    }
    
    public void setRls(Set<Rl> rls) {
        this.rls = rls;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="lbl")
    public Set<Athntctn> getAthntctns() {
        return this.athntctns;
    }
    
    public void setAthntctns(Set<Athntctn> athntctns) {
        this.athntctns = athntctns;
    }




}


