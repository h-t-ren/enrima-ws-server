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
 * Acs generated by hbm2java
 */
@Entity
@Table(name="acs"
)
public class Acs  implements java.io.Serializable {


     private Integer idAcs;
     private DbSts dbSts;
     private Rl rl;
     private UsrGrp usrGrp;
     private Sn sn;
     private short objTp;
     private Integer obj;
     private Set<AcsLg> acsLgs = new HashSet<AcsLg>(0);

    public Acs() {
    }

	
    public Acs(DbSts dbSts, Rl rl, UsrGrp usrGrp, Sn sn, short objTp) {
        this.dbSts = dbSts;
        this.rl = rl;
        this.usrGrp = usrGrp;
        this.sn = sn;
        this.objTp = objTp;
    }
    public Acs(DbSts dbSts, Rl rl, UsrGrp usrGrp, Sn sn, short objTp, Integer obj, Set<AcsLg> acsLgs) {
       this.dbSts = dbSts;
       this.rl = rl;
       this.usrGrp = usrGrp;
       this.sn = sn;
       this.objTp = objTp;
       this.obj = obj;
       this.acsLgs = acsLgs;
    }
   
     @SequenceGenerator(name="generator", sequenceName="seq__acs__id_acs")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")
    
    @Column(name="id_acs", unique=true, nullable=false)
    public Integer getIdAcs() {
        return this.idAcs;
    }
    
    public void setIdAcs(Integer idAcs) {
        this.idAcs = idAcs;
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
    @JoinColumn(name="rl", nullable=false)
    public Rl getRl() {
        return this.rl;
    }
    
    public void setRl(Rl rl) {
        this.rl = rl;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="usr_grp", nullable=false)
    public UsrGrp getUsrGrp() {
        return this.usrGrp;
    }
    
    public void setUsrGrp(UsrGrp usrGrp) {
        this.usrGrp = usrGrp;
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
    
    @Column(name="obj")
    public Integer getObj() {
        return this.obj;
    }
    
    public void setObj(Integer obj) {
        this.obj = obj;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="acs")
    public Set<AcsLg> getAcsLgs() {
        return this.acsLgs;
    }
    
    public void setAcsLgs(Set<AcsLg> acsLgs) {
        this.acsLgs = acsLgs;
    }




}


