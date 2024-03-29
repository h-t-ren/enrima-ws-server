package at.ac.iiasa.ime.enrima.domain;
// Generated Nov 18, 2011 2:44:24 PM by Hibernate Tools 3.2.2.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ObjTpSrvc generated by hbm2java
 */
@Entity
@Table(name="obj_tp_srvc"
)
public class ObjTpSrvc  implements java.io.Serializable {


     private ObjTpSrvcId id;
     private ObjTp objTp;
     private Set<ObjTpSrvcRl> objTpSrvcRls = new HashSet<ObjTpSrvcRl>(0);

    public ObjTpSrvc() {
    }

	
    public ObjTpSrvc(ObjTpSrvcId id, ObjTp objTp) {
        this.id = id;
        this.objTp = objTp;
    }
    public ObjTpSrvc(ObjTpSrvcId id, ObjTp objTp, Set<ObjTpSrvcRl> objTpSrvcRls) {
       this.id = id;
       this.objTp = objTp;
       this.objTpSrvcRls = objTpSrvcRls;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="idObjTp", column=@Column(name="id_obj_tp", nullable=false) ), 
        @AttributeOverride(name="idSrvc", column=@Column(name="id_srvc", nullable=false) ) } )
    public ObjTpSrvcId getId() {
        return this.id;
    }
    
    public void setId(ObjTpSrvcId id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_obj_tp", nullable=false, insertable=false, updatable=false)
    public ObjTp getObjTp() {
        return this.objTp;
    }
    
    public void setObjTp(ObjTp objTp) {
        this.objTp = objTp;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="objTpSrvc")
    public Set<ObjTpSrvcRl> getObjTpSrvcRls() {
        return this.objTpSrvcRls;
    }
    
    public void setObjTpSrvcRls(Set<ObjTpSrvcRl> objTpSrvcRls) {
        this.objTpSrvcRls = objTpSrvcRls;
    }




}


