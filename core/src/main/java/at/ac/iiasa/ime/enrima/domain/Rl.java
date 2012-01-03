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
 * Rl generated by hbm2java
 */
@Entity
@Table(name="rl"
)
public class Rl  implements java.io.Serializable {


     private Short idRl;
     private DbSts dbSts;
     private Lbl lbl;
     private Set<Acs> acses = new HashSet<Acs>(0);
     private Set<AcsLg> acsLgs = new HashSet<AcsLg>(0);

    public Rl() {
    }

	
    public Rl(DbSts dbSts, Lbl lbl) {
        this.dbSts = dbSts;
        this.lbl = lbl;
    }
    public Rl(DbSts dbSts, Lbl lbl, Set<Acs> acses, Set<AcsLg> acsLgs) {
       this.dbSts = dbSts;
       this.lbl = lbl;
       this.acses = acses;
       this.acsLgs = acsLgs;
    }
   
     @SequenceGenerator(name="generator", sequenceName="seq__rl__id_rl")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")
    
    @Column(name="id_rl", unique=true, nullable=false)
    public Short getIdRl() {
        return this.idRl;
    }
    
    public void setIdRl(Short idRl) {
        this.idRl = idRl;
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
    @JoinColumn(name="lbl", nullable=false)
    public Lbl getLbl() {
        return this.lbl;
    }
    
    public void setLbl(Lbl lbl) {
        this.lbl = lbl;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="rl")
    public Set<Acs> getAcses() {
        return this.acses;
    }
    
    public void setAcses(Set<Acs> acses) {
        this.acses = acses;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="rl")
    public Set<AcsLg> getAcsLgs() {
        return this.acsLgs;
    }
    
    public void setAcsLgs(Set<AcsLg> acsLgs) {
        this.acsLgs = acsLgs;
    }




}

