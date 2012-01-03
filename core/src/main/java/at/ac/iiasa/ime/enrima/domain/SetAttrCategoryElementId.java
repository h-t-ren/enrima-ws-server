package at.ac.iiasa.ime.enrima.domain;
// Generated Nov 29, 2011 9:34:07 AM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SetAttrCategoryElementId generated by hbm2java
 */
@Embeddable
public class SetAttrCategoryElementId  implements java.io.Serializable {


     private int idCategory;
     private int elementNo;

    public SetAttrCategoryElementId() {
    }

    public SetAttrCategoryElementId(int idCategory, int elementNo) {
       this.idCategory = idCategory;
       this.elementNo = elementNo;
    }
   

    @Column(name="id_category", nullable=false)
    public int getIdCategory() {
        return this.idCategory;
    }
    
    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    @Column(name="element_no", nullable=false)
    public int getElementNo() {
        return this.elementNo;
    }
    
    public void setElementNo(int elementNo) {
        this.elementNo = elementNo;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SetAttrCategoryElementId) ) return false;
		 SetAttrCategoryElementId castOther = ( SetAttrCategoryElementId ) other; 
         
		 return (this.getIdCategory()==castOther.getIdCategory())
 && (this.getElementNo()==castOther.getElementNo());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdCategory();
         result = 37 * result + this.getElementNo();
         return result;
   }   


}


