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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Term generated by hbm2java
 */
@Entity
@Table(name="term"
    , uniqueConstraints = @UniqueConstraint(columnNames={"id_entity_rev", "sequence"}) 
)
public class Term  implements java.io.Serializable {


     private Integer idTerm;
     private EntitySpecVer entitySpecVer;
     private int sequence;
     private char termSign;
     private Set<TermEntity> termEntities = new HashSet<TermEntity>(0);

    public Term() {
    }

	
    public Term(EntitySpecVer entitySpecVer, int sequence, char termSign) {
        this.entitySpecVer = entitySpecVer;
        this.sequence = sequence;
        this.termSign = termSign;
    }
    public Term(EntitySpecVer entitySpecVer, int sequence, char termSign, Set<TermEntity> termEntities) {
       this.entitySpecVer = entitySpecVer;
       this.sequence = sequence;
       this.termSign = termSign;
       this.termEntities = termEntities;
    }
   
     @SequenceGenerator(name="generator", sequenceName="SEQ__Jpa_Term__id_Jpa_Term")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")
    
    @Column(name="id_term", unique=true, nullable=false)
    public Integer getIdTerm() {
        return this.idTerm;
    }
    
    public void setIdTerm(Integer idTerm) {
        this.idTerm = idTerm;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_entity_rev", nullable=false)
    public EntitySpecVer getEntitySpecVer() {
        return this.entitySpecVer;
    }
    
    public void setEntitySpecVer(EntitySpecVer entitySpecVer) {
        this.entitySpecVer = entitySpecVer;
    }
    
    @Column(name="sequence", nullable=false)
    public int getSequence() {
        return this.sequence;
    }
    
    public void setSequence(int sequence) {
        this.sequence = sequence;
    }
    
    @Column(name="term_sign", nullable=false, length=1)
    public char getTermSign() {
        return this.termSign;
    }
    
    public void setTermSign(char termSign) {
        this.termSign = termSign;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="term")
    public Set<TermEntity> getTermEntities() {
        return this.termEntities;
    }
    
    public void setTermEntities(Set<TermEntity> termEntities) {
        this.termEntities = termEntities;
    }




}


