package at.ac.iiasa.ime.enrima.domain;
// Generated Nov 29, 2011 9:34:07 AM by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * MsgLg generated by hbm2java
 */
@Entity
@Table(name="msg_lg"
)
public class MsgLg  implements java.io.Serializable {


     private MsgLgId id;
     private Srvc srvc;
     private Sn snByLckSts;
     private Msg msg;
     private DbSts dbSts;
     private Sn snBySn;

    public MsgLg() {
    }

	
    public MsgLg(MsgLgId id, Srvc srvc, Msg msg, DbSts dbSts, Sn snBySn) {
        this.id = id;
        this.srvc = srvc;
        this.msg = msg;
        this.dbSts = dbSts;
        this.snBySn = snBySn;
    }
    public MsgLg(MsgLgId id, Srvc srvc, Sn snByLckSts, Msg msg, DbSts dbSts, Sn snBySn) {
       this.id = id;
       this.srvc = srvc;
       this.snByLckSts = snByLckSts;
       this.msg = msg;
       this.dbSts = dbSts;
       this.snBySn = snBySn;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="idLg", column=@Column(name="id_lg", nullable=false) ), 
        @AttributeOverride(name="ts", column=@Column(name="ts", nullable=false, length=29) ) } )
    public MsgLgId getId() {
        return this.id;
    }
    
    public void setId(MsgLgId id) {
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
    @JoinColumn(name="lck_sts")
    public Sn getSnByLckSts() {
        return this.snByLckSts;
    }
    
    public void setSnByLckSts(Sn snByLckSts) {
        this.snByLckSts = snByLckSts;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_msg", nullable=false)
    public Msg getMsg() {
        return this.msg;
    }
    
    public void setMsg(Msg msg) {
        this.msg = msg;
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
    public Sn getSnBySn() {
        return this.snBySn;
    }
    
    public void setSnBySn(Sn snBySn) {
        this.snBySn = snBySn;
    }




}


