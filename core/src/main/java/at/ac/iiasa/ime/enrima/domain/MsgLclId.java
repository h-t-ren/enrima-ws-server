package at.ac.iiasa.ime.enrima.domain;
// Generated Nov 29, 2011 9:34:07 AM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MsgLclId generated by hbm2java
 */
@Embeddable
public class MsgLclId  implements java.io.Serializable {


     private String idMsg;
     private String idLcl;

    public MsgLclId() {
    }

    public MsgLclId(String idMsg, String idLcl) {
       this.idMsg = idMsg;
       this.idLcl = idLcl;
    }
   

    @Column(name="id_msg", nullable=false, length=64)
    public String getIdMsg() {
        return this.idMsg;
    }
    
    public void setIdMsg(String idMsg) {
        this.idMsg = idMsg;
    }

    @Column(name="id_lcl", nullable=false, length=5)
    public String getIdLcl() {
        return this.idLcl;
    }
    
    public void setIdLcl(String idLcl) {
        this.idLcl = idLcl;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MsgLclId) ) return false;
		 MsgLclId castOther = ( MsgLclId ) other; 
         
		 return ( (this.getIdMsg()==castOther.getIdMsg()) || ( this.getIdMsg()!=null && castOther.getIdMsg()!=null && this.getIdMsg().equals(castOther.getIdMsg()) ) )
 && ( (this.getIdLcl()==castOther.getIdLcl()) || ( this.getIdLcl()!=null && castOther.getIdLcl()!=null && this.getIdLcl().equals(castOther.getIdLcl()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getIdMsg() == null ? 0 : this.getIdMsg().hashCode() );
         result = 37 * result + ( getIdLcl() == null ? 0 : this.getIdLcl().hashCode() );
         return result;
   }   


}


