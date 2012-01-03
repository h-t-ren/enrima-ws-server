package at.ac.iiasa.ime.enrima.domain;
// Generated Nov 29, 2011 9:34:07 AM by Hibernate Tools 3.2.2.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * LblLclLgId generated by hbm2java
 */
@Embeddable
public class LblLclLgId  implements java.io.Serializable {


     private int idLg;
     private Date ts;

    public LblLclLgId() {
    }

    public LblLclLgId(int idLg, Date ts) {
       this.idLg = idLg;
       this.ts = ts;
    }
   

    @Column(name="id_lg", nullable=false)
    public int getIdLg() {
        return this.idLg;
    }
    
    public void setIdLg(int idLg) {
        this.idLg = idLg;
    }

    @Column(name="ts", nullable=false, length=29)
    public Date getTs() {
        return this.ts;
    }
    
    public void setTs(Date ts) {
        this.ts = ts;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LblLclLgId) ) return false;
		 LblLclLgId castOther = ( LblLclLgId ) other; 
         
		 return (this.getIdLg()==castOther.getIdLg())
 && ( (this.getTs()==castOther.getTs()) || ( this.getTs()!=null && castOther.getTs()!=null && this.getTs().equals(castOther.getTs()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdLg();
         result = 37 * result + ( getTs() == null ? 0 : this.getTs().hashCode() );
         return result;
   }   


}

