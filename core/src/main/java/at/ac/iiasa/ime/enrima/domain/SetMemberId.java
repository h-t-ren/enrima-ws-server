package at.ac.iiasa.ime.enrima.domain;
// Generated Nov 29, 2011 9:34:07 AM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SetMemberId generated by hbm2java
 */
@Embeddable
public class SetMemberId  implements java.io.Serializable {


     private int idSet;
     private int idUpdate;
     private int idMember;

    public SetMemberId() {
    }

    public SetMemberId(int idSet, int idUpdate, int idMember) {
       this.idSet = idSet;
       this.idUpdate = idUpdate;
       this.idMember = idMember;
    }
   

    @Column(name="id_set", nullable=false)
    public int getIdSet() {
        return this.idSet;
    }
    
    public void setIdSet(int idSet) {
        this.idSet = idSet;
    }

    @Column(name="id_update", nullable=false)
    public int getIdUpdate() {
        return this.idUpdate;
    }
    
    public void setIdUpdate(int idUpdate) {
        this.idUpdate = idUpdate;
    }

    @Column(name="id_member", nullable=false)
    public int getIdMember() {
        return this.idMember;
    }
    
    public void setIdMember(int idMember) {
        this.idMember = idMember;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SetMemberId) ) return false;
		 SetMemberId castOther = ( SetMemberId ) other; 
         
		 return (this.getIdSet()==castOther.getIdSet())
 && (this.getIdUpdate()==castOther.getIdUpdate())
 && (this.getIdMember()==castOther.getIdMember());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdSet();
         result = 37 * result + this.getIdUpdate();
         result = 37 * result + this.getIdMember();
         return result;
   }   


}

