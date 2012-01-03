package at.ac.iiasa.ime.enrima.domain;
// Generated Nov 29, 2011 9:34:07 AM by Hibernate Tools 3.2.2.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * InstanceState generated by hbm2java
 */
@Entity
@Table(name="instance_state"
)
public class InstanceState  implements java.io.Serializable {


     private int idState;
     private String stateName;
     private Set<ModelInstance> modelInstances = new HashSet<ModelInstance>(0);

    public InstanceState() {
    }

	
    public InstanceState(int idState, String stateName) {
        this.idState = idState;
        this.stateName = stateName;
    }
    public InstanceState(int idState, String stateName, Set<ModelInstance> modelInstances) {
       this.idState = idState;
       this.stateName = stateName;
       this.modelInstances = modelInstances;
    }
   
     @Id 
    
    @Column(name="id_state", unique=true, nullable=false)
    public int getIdState() {
        return this.idState;
    }
    
    public void setIdState(int idState) {
        this.idState = idState;
    }
    
    @Column(name="state_name", nullable=false, length=20)
    public String getStateName() {
        return this.stateName;
    }
    
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="instanceState")
    public Set<ModelInstance> getModelInstances() {
        return this.modelInstances;
    }
    
    public void setModelInstances(Set<ModelInstance> modelInstances) {
        this.modelInstances = modelInstances;
    }




}


