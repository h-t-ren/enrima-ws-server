package at.ac.iiasa.ime.enrima.domain;
// Generated Nov 29, 2011 9:34:07 AM by Hibernate Tools 3.2.2.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * EntityAttrCategory generated by hbm2java
 */
@Entity
@Table(name="entity_attr_category"
)
public class EntityAttrCategory  implements java.io.Serializable {


     private Integer idCategory;
     private String categoryName;
     private Integer catOrder;
     private Set<EntityAttrCategoryElement> entityAttrCategoryElements = new HashSet<EntityAttrCategoryElement>(0);
     private Set<EntityAttr> entityAttrs = new HashSet<EntityAttr>(0);

    public EntityAttrCategory() {
    }

	
    public EntityAttrCategory(String categoryName) {
        this.categoryName = categoryName;
    }
    public EntityAttrCategory(String categoryName, Integer catOrder, Set<EntityAttrCategoryElement> entityAttrCategoryElements, Set<EntityAttr> entityAttrs) {
       this.categoryName = categoryName;
       this.catOrder = catOrder;
       this.entityAttrCategoryElements = entityAttrCategoryElements;
       this.entityAttrs = entityAttrs;
    }
   
     @SequenceGenerator(name="generator", sequenceName="SEQ__JPA_ENTITY_ATTR_CATEGORY__ID_JPA_ENTITY_ATTR_CATEGORY")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")
    
    @Column(name="id_category", unique=true, nullable=false)
    public Integer getIdCategory() {
        return this.idCategory;
    }
    
    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }
    
    @Column(name="category_name", nullable=false, length=20)
    public String getCategoryName() {
        return this.categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    
    @Column(name="cat_order")
    public Integer getCatOrder() {
        return this.catOrder;
    }
    
    public void setCatOrder(Integer catOrder) {
        this.catOrder = catOrder;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="entityAttrCategory")
    public Set<EntityAttrCategoryElement> getEntityAttrCategoryElements() {
        return this.entityAttrCategoryElements;
    }
    
    public void setEntityAttrCategoryElements(Set<EntityAttrCategoryElement> entityAttrCategoryElements) {
        this.entityAttrCategoryElements = entityAttrCategoryElements;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="entityAttrCategory")
    public Set<EntityAttr> getEntityAttrs() {
        return this.entityAttrs;
    }
    
    public void setEntityAttrs(Set<EntityAttr> entityAttrs) {
        this.entityAttrs = entityAttrs;
    }




}


