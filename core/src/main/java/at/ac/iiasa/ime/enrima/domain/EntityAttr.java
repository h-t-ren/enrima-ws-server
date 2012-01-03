package at.ac.iiasa.ime.enrima.domain;
// Generated Nov 29, 2011 9:34:07 AM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * EntityAttr generated by hbm2java
 */
@Entity
@Table(name="entity_attr"
    , uniqueConstraints = @UniqueConstraint(columnNames={"id_category", "id_entity_rev"}) 
)
public class EntityAttr  implements java.io.Serializable {


     private Integer idEntityAttr;
     private EntityAttrCategoryElement entityAttrCategoryElement;
     private EntitySpecVer entitySpecVer;
     private EntityAttrCategory entityAttrCategory;

    public EntityAttr() {
    }

    public EntityAttr(EntityAttrCategoryElement entityAttrCategoryElement, EntitySpecVer entitySpecVer, EntityAttrCategory entityAttrCategory) {
       this.entityAttrCategoryElement = entityAttrCategoryElement;
       this.entitySpecVer = entitySpecVer;
       this.entityAttrCategory = entityAttrCategory;
    }
   
     @SequenceGenerator(name="generator", sequenceName="SEQ__JPA_ENTITY_ATTR__ID_JPA_ENTITY_ATTR")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")
    
    @Column(name="id_entity_attr", unique=true, nullable=false)
    public Integer getIdEntityAttr() {
        return this.idEntityAttr;
    }
    
    public void setIdEntityAttr(Integer idEntityAttr) {
        this.idEntityAttr = idEntityAttr;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_attr_cat_el", nullable=false)
    public EntityAttrCategoryElement getEntityAttrCategoryElement() {
        return this.entityAttrCategoryElement;
    }
    
    public void setEntityAttrCategoryElement(EntityAttrCategoryElement entityAttrCategoryElement) {
        this.entityAttrCategoryElement = entityAttrCategoryElement;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_entity_rev", nullable=false)
    public EntitySpecVer getEntitySpecVer() {
        return this.entitySpecVer;
    }
    
    public void setEntitySpecVer(EntitySpecVer entitySpecVer) {
        this.entitySpecVer = entitySpecVer;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_category", nullable=false)
    public EntityAttrCategory getEntityAttrCategory() {
        return this.entityAttrCategory;
    }
    
    public void setEntityAttrCategory(EntityAttrCategory entityAttrCategory) {
        this.entityAttrCategory = entityAttrCategory;
    }




}


