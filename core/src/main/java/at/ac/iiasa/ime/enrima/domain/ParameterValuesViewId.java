package at.ac.iiasa.ime.enrima.domain;
// Generated Nov 29, 2011 9:34:07 AM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ParameterValuesViewId generated by hbm2java
 */
@Embeddable
public class ParameterValuesViewId  implements java.io.Serializable {


     private int idUpdate;
     private int idEntitySpec;
     private int idTuple;

    public ParameterValuesViewId() {
    }

    public ParameterValuesViewId(int idUpdate, int idEntitySpec, int idTuple) {
       this.idUpdate = idUpdate;
       this.idEntitySpec = idEntitySpec;
       this.idTuple = idTuple;
    }
   

    @Column(name="id_update", nullable=false)
    public int getIdUpdate() {
        return this.idUpdate;
    }
    
    public void setIdUpdate(int idUpdate) {
        this.idUpdate = idUpdate;
    }

    @Column(name="id_entity_spec", nullable=false)
    public int getIdEntitySpec() {
        return this.idEntitySpec;
    }
    
    public void setIdEntitySpec(int idEntitySpec) {
        this.idEntitySpec = idEntitySpec;
    }

    @Column(name="id_tuple", nullable=false)
    public int getIdTuple() {
        return this.idTuple;
    }
    
    public void setIdTuple(int idTuple) {
        this.idTuple = idTuple;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ParameterValuesViewId) ) return false;
		 ParameterValuesViewId castOther = ( ParameterValuesViewId ) other; 
         
		 return (this.getIdUpdate()==castOther.getIdUpdate())
 && (this.getIdEntitySpec()==castOther.getIdEntitySpec())
 && (this.getIdTuple()==castOther.getIdTuple());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdUpdate();
         result = 37 * result + this.getIdEntitySpec();
         result = 37 * result + this.getIdTuple();
         return result;
   }   


}

