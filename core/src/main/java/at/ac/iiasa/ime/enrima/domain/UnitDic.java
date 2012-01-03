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
 * UnitDic generated by hbm2java
 */
@Entity
@Table(name="unit_dic"
)
public class UnitDic  implements java.io.Serializable {


     private int idUnit;
     private String unit;
     private Set<EntitySpecVer> entitySpecVers = new HashSet<EntitySpecVer>(0);

    public UnitDic() {
    }

	
    public UnitDic(int idUnit) {
        this.idUnit = idUnit;
    }
    public UnitDic(int idUnit, String unit, Set<EntitySpecVer> entitySpecVers) {
       this.idUnit = idUnit;
       this.unit = unit;
       this.entitySpecVers = entitySpecVers;
    }
   
     @Id 
    
    @Column(name="id_unit", unique=true, nullable=false)
    public int getIdUnit() {
        return this.idUnit;
    }
    
    public void setIdUnit(int idUnit) {
        this.idUnit = idUnit;
    }
    
    @Column(name="unit", length=64)
    public String getUnit() {
        return this.unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="unitDic")
    public Set<EntitySpecVer> getEntitySpecVers() {
        return this.entitySpecVers;
    }
    
    public void setEntitySpecVers(Set<EntitySpecVer> entitySpecVers) {
        this.entitySpecVers = entitySpecVers;
    }




}


