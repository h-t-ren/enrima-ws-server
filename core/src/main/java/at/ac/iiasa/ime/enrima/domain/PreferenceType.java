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
 * PreferenceType generated by hbm2java
 */
@Entity
@Table(name="preference_type"
)
public class PreferenceType  implements java.io.Serializable {


     private int idPrefType;
     private String prefTypeName;
     private Set<Preference> preferences = new HashSet<Preference>(0);

    public PreferenceType() {
    }

	
    public PreferenceType(int idPrefType, String prefTypeName) {
        this.idPrefType = idPrefType;
        this.prefTypeName = prefTypeName;
    }
    public PreferenceType(int idPrefType, String prefTypeName, Set<Preference> preferences) {
       this.idPrefType = idPrefType;
       this.prefTypeName = prefTypeName;
       this.preferences = preferences;
    }
   
     @Id 
    
    @Column(name="id_pref_type", unique=true, nullable=false)
    public int getIdPrefType() {
        return this.idPrefType;
    }
    
    public void setIdPrefType(int idPrefType) {
        this.idPrefType = idPrefType;
    }
    
    @Column(name="pref_type_name", nullable=false, length=20)
    public String getPrefTypeName() {
        return this.prefTypeName;
    }
    
    public void setPrefTypeName(String prefTypeName) {
        this.prefTypeName = prefTypeName;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="preferenceType")
    public Set<Preference> getPreferences() {
        return this.preferences;
    }
    
    public void setPreferences(Set<Preference> preferences) {
        this.preferences = preferences;
    }




}


