package at.ac.iiasa.ime.enrima.domain;
// Generated Nov 29, 2011 9:34:07 AM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ActiveEntityId generated by hbm2java
 */
@Embeddable
public class ActiveEntityId  implements java.io.Serializable {


     private int idModel;
     private int idSubmodel;
     private int idEntitySpec;

    public ActiveEntityId() {
    }

    public ActiveEntityId(int idModel, int idSubmodel, int idEntitySpec) {
       this.idModel = idModel;
       this.idSubmodel = idSubmodel;
       this.idEntitySpec = idEntitySpec;
    }
   

    @Column(name="id_model", nullable=false)
    public int getIdModel() {
        return this.idModel;
    }
    
    public void setIdModel(int idModel) {
        this.idModel = idModel;
    }

    @Column(name="id_submodel", nullable=false)
    public int getIdSubmodel() {
        return this.idSubmodel;
    }
    
    public void setIdSubmodel(int idSubmodel) {
        this.idSubmodel = idSubmodel;
    }

    @Column(name="id_entity_spec", nullable=false)
    public int getIdEntitySpec() {
        return this.idEntitySpec;
    }
    
    public void setIdEntitySpec(int idEntitySpec) {
        this.idEntitySpec = idEntitySpec;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ActiveEntityId) ) return false;
		 ActiveEntityId castOther = ( ActiveEntityId ) other; 
         
		 return (this.getIdModel()==castOther.getIdModel())
 && (this.getIdSubmodel()==castOther.getIdSubmodel())
 && (this.getIdEntitySpec()==castOther.getIdEntitySpec());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdModel();
         result = 37 * result + this.getIdSubmodel();
         result = 37 * result + this.getIdEntitySpec();
         return result;
   }   


}


