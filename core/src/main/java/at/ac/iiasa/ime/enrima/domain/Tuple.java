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

/**
 * Tuple generated by hbm2java
 */
@Entity
@Table(name="tuple"
)
public class Tuple  implements java.io.Serializable {


     private Integer idTuple;
     private IteratorContainer iteratorContainer;
     private Set<TupleElement> tupleElements = new HashSet<TupleElement>(0);
     private Set<SetData> setDatas = new HashSet<SetData>(0);
     private Set<ParameterValuesView> parameterValuesViews = new HashSet<ParameterValuesView>(0);
     private Set<EntityValues> entityValueses = new HashSet<EntityValues>(0);

    public Tuple() {
    }

    public Tuple(IteratorContainer iteratorContainer, Set<TupleElement> tupleElements, Set<SetData> setDatas, Set<ParameterValuesView> parameterValuesViews, Set<EntityValues> entityValueses) {
       this.iteratorContainer = iteratorContainer;
       this.tupleElements = tupleElements;
       this.setDatas = setDatas;
       this.parameterValuesViews = parameterValuesViews;
       this.entityValueses = entityValueses;
    }
   
     @SequenceGenerator(name="generator", sequenceName="SEQ__JPA_TUPLE__ID_JPA_TUPLE")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")
    
    @Column(name="id_tuple", unique=true, nullable=false)
    public Integer getIdTuple() {
        return this.idTuple;
    }
    
    public void setIdTuple(Integer idTuple) {
        this.idTuple = idTuple;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_iter_cont")
    public IteratorContainer getIteratorContainer() {
        return this.iteratorContainer;
    }
    
    public void setIteratorContainer(IteratorContainer iteratorContainer) {
        this.iteratorContainer = iteratorContainer;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tuple")
    public Set<TupleElement> getTupleElements() {
        return this.tupleElements;
    }
    
    public void setTupleElements(Set<TupleElement> tupleElements) {
        this.tupleElements = tupleElements;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tuple")
    public Set<SetData> getSetDatas() {
        return this.setDatas;
    }
    
    public void setSetDatas(Set<SetData> setDatas) {
        this.setDatas = setDatas;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tuple")
    public Set<ParameterValuesView> getParameterValuesViews() {
        return this.parameterValuesViews;
    }
    
    public void setParameterValuesViews(Set<ParameterValuesView> parameterValuesViews) {
        this.parameterValuesViews = parameterValuesViews;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="tuple")
    public Set<EntityValues> getEntityValueses() {
        return this.entityValueses;
    }
    
    public void setEntityValueses(Set<EntityValues> entityValueses) {
        this.entityValueses = entityValueses;
    }




}


