package at.ac.iiasa.ime.enrima.domain;
// Generated Nov 29, 2011 9:34:07 AM by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TermEntity generated by hbm2java
 */
@Entity
@Table(name="term_entity"
)
public class TermEntity  implements java.io.Serializable {


     private TermEntityId id;
     private IteratorContainer iteratorContainer;
     private EntitySpec entitySpec;
     private Term term;

    public TermEntity() {
    }

	
    public TermEntity(TermEntityId id, EntitySpec entitySpec, Term term) {
        this.id = id;
        this.entitySpec = entitySpec;
        this.term = term;
    }
    public TermEntity(TermEntityId id, IteratorContainer iteratorContainer, EntitySpec entitySpec, Term term) {
       this.id = id;
       this.iteratorContainer = iteratorContainer;
       this.entitySpec = entitySpec;
       this.term = term;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="idTerm", column=@Column(name="id_term", nullable=false) ), 
        @AttributeOverride(name="idEntitySpec", column=@Column(name="id_entity_spec", nullable=false) ), 
        @AttributeOverride(name="sequence", column=@Column(name="sequence", nullable=false) ) } )
    public TermEntityId getId() {
        return this.id;
    }
    
    public void setId(TermEntityId id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_iter_cont")
    public IteratorContainer getIteratorContainer() {
        return this.iteratorContainer;
    }
    
    public void setIteratorContainer(IteratorContainer iteratorContainer) {
        this.iteratorContainer = iteratorContainer;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_entity_spec", nullable=false, insertable=false, updatable=false)
    public EntitySpec getEntitySpec() {
        return this.entitySpec;
    }
    
    public void setEntitySpec(EntitySpec entitySpec) {
        this.entitySpec = entitySpec;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_term", nullable=false, insertable=false, updatable=false)
    public Term getTerm() {
        return this.term;
    }
    
    public void setTerm(Term term) {
        this.term = term;
    }




}


