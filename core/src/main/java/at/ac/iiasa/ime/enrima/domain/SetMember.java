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
 * SetMember generated by hbm2java
 */
@Entity
@Table(name="set_member"
)
public class SetMember  implements java.io.Serializable {


     private SetMemberId id;
     private SetData setData;
     private MembersDictionary membersDictionary;
     private ModelDataUpdate modelDataUpdate;
     private Integer isMember;

    public SetMember() {
    }

	
    public SetMember(SetMemberId id, SetData setData, MembersDictionary membersDictionary, ModelDataUpdate modelDataUpdate) {
        this.id = id;
        this.setData = setData;
        this.membersDictionary = membersDictionary;
        this.modelDataUpdate = modelDataUpdate;
    }
    public SetMember(SetMemberId id, SetData setData, MembersDictionary membersDictionary, ModelDataUpdate modelDataUpdate, Integer isMember) {
       this.id = id;
       this.setData = setData;
       this.membersDictionary = membersDictionary;
       this.modelDataUpdate = modelDataUpdate;
       this.isMember = isMember;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="idSet", column=@Column(name="id_set", nullable=false) ), 
        @AttributeOverride(name="idUpdate", column=@Column(name="id_update", nullable=false) ), 
        @AttributeOverride(name="idMember", column=@Column(name="id_member", nullable=false) ) } )
    public SetMemberId getId() {
        return this.id;
    }
    
    public void setId(SetMemberId id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_set", nullable=false, insertable=false, updatable=false)
    public SetData getSetData() {
        return this.setData;
    }
    
    public void setSetData(SetData setData) {
        this.setData = setData;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_member", nullable=false, insertable=false, updatable=false)
    public MembersDictionary getMembersDictionary() {
        return this.membersDictionary;
    }
    
    public void setMembersDictionary(MembersDictionary membersDictionary) {
        this.membersDictionary = membersDictionary;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_update", nullable=false, insertable=false, updatable=false)
    public ModelDataUpdate getModelDataUpdate() {
        return this.modelDataUpdate;
    }
    
    public void setModelDataUpdate(ModelDataUpdate modelDataUpdate) {
        this.modelDataUpdate = modelDataUpdate;
    }
    
    @Column(name="is_member")
    public Integer getIsMember() {
        return this.isMember;
    }
    
    public void setIsMember(Integer isMember) {
        this.isMember = isMember;
    }




}


