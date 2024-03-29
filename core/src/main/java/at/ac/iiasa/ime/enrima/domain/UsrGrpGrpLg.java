package at.ac.iiasa.ime.enrima.domain;
// Generated Nov 29, 2011 9:34:07 AM by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * UsrGrpGrpLg generated by hbm2java
 */
@Entity
@Table(name="usr_grp_grp_lg"
)
public class UsrGrpGrpLg  implements java.io.Serializable {


     private UsrGrpGrpLgId id;
     private Srvc srvc;
     private UsrGrpGrp usrGrpGrp;
     private DbSts dbSts;
     private Sn sn;

    public UsrGrpGrpLg() {
    }

    public UsrGrpGrpLg(UsrGrpGrpLgId id, Srvc srvc, UsrGrpGrp usrGrpGrp, DbSts dbSts, Sn sn) {
       this.id = id;
       this.srvc = srvc;
       this.usrGrpGrp = usrGrpGrp;
       this.dbSts = dbSts;
       this.sn = sn;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="idLg", column=@Column(name="id_lg", nullable=false) ), 
        @AttributeOverride(name="ts", column=@Column(name="ts", nullable=false, length=29) ) } )
    public UsrGrpGrpLgId getId() {
        return this.id;
    }
    
    public void setId(UsrGrpGrpLgId id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="srvc", nullable=false)
    public Srvc getSrvc() {
        return this.srvc;
    }
    
    public void setSrvc(Srvc srvc) {
        this.srvc = srvc;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns( { 
        @JoinColumn(name="id_usr_grp", referencedColumnName="id_usr_grp", nullable=false), 
        @JoinColumn(name="id_usr_grp_mbr", referencedColumnName="id_usr_grp_mbr", nullable=false) } )
    public UsrGrpGrp getUsrGrpGrp() {
        return this.usrGrpGrp;
    }
    
    public void setUsrGrpGrp(UsrGrpGrp usrGrpGrp) {
        this.usrGrpGrp = usrGrpGrp;
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




}


