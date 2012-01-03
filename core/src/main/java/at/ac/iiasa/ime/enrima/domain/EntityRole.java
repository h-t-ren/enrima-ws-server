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
 * EntityRole generated by hbm2java
 */
@Entity
@Table(name="entity_role"
)
public class EntityRole  implements java.io.Serializable {


     private int roleCode;
     private String roleName;
     private Set<EntitySpecVer> entitySpecVers = new HashSet<EntitySpecVer>(0);

    public EntityRole() {
    }

	
    public EntityRole(int roleCode, String roleName) {
        this.roleCode = roleCode;
        this.roleName = roleName;
    }
    public EntityRole(int roleCode, String roleName, Set<EntitySpecVer> entitySpecVers) {
       this.roleCode = roleCode;
       this.roleName = roleName;
       this.entitySpecVers = entitySpecVers;
    }
   
     @Id 
    
    @Column(name="role_code", unique=true, nullable=false)
    public int getRoleCode() {
        return this.roleCode;
    }
    
    public void setRoleCode(int roleCode) {
        this.roleCode = roleCode;
    }
    
    @Column(name="role_name", nullable=false, length=30)
    public String getRoleName() {
        return this.roleName;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="entityRole")
    public Set<EntitySpecVer> getEntitySpecVers() {
        return this.entitySpecVers;
    }
    
    public void setEntitySpecVers(Set<EntitySpecVer> entitySpecVers) {
        this.entitySpecVers = entitySpecVers;
    }




}


