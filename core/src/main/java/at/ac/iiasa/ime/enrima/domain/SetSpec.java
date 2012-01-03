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
 * SetSpec generated by hbm2java
 */
@Entity
@Table(name="set_spec"
    , uniqueConstraints = {@UniqueConstraint(columnNames={"id_model", "position"}), @UniqueConstraint(columnNames={"id_model", "label"})} 
)
public class SetSpec  implements java.io.Serializable {


     private Integer idSetSpec;
     private IteratorContainer iteratorContainer;
     private SetSpec setSpec;
     private Model model;
     private String label;
     private char commited;
     private int position;
     private Set<SetSpec> setSpecs = new HashSet<SetSpec>(0);
     private Set<SetData> setDatas = new HashSet<SetData>(0);
     private Set<IteratorAtom> iteratorAtoms = new HashSet<IteratorAtom>(0);
     private Set<ActiveSet> activeSets = new HashSet<ActiveSet>(0);
     private Set<UploadedSet> uploadedSets = new HashSet<UploadedSet>(0);
     private Set<SetSpecVer> setSpecVers = new HashSet<SetSpecVer>(0);

    public SetSpec() {
    }

	
    public SetSpec(String label, char commited, int position) {
        this.label = label;
        this.commited = commited;
        this.position = position;
    }
    public SetSpec(IteratorContainer iteratorContainer, SetSpec setSpec, Model model, String label, char commited, int position, Set<SetSpec> setSpecs, Set<SetData> setDatas, Set<IteratorAtom> iteratorAtoms, Set<ActiveSet> activeSets, Set<UploadedSet> uploadedSets, Set<SetSpecVer> setSpecVers) {
       this.iteratorContainer = iteratorContainer;
       this.setSpec = setSpec;
       this.model = model;
       this.label = label;
       this.commited = commited;
       this.position = position;
       this.setSpecs = setSpecs;
       this.setDatas = setDatas;
       this.iteratorAtoms = iteratorAtoms;
       this.activeSets = activeSets;
       this.uploadedSets = uploadedSets;
       this.setSpecVers = setSpecVers;
    }
   
     @SequenceGenerator(name="generator", sequenceName="SEQ__JPA_SET_SPEC__ID_JPA_SET_SPEC")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")
    
    @Column(name="id_set_spec", unique=true, nullable=false)
    public Integer getIdSetSpec() {
        return this.idSetSpec;
    }
    
    public void setIdSetSpec(Integer idSetSpec) {
        this.idSetSpec = idSetSpec;
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
    @JoinColumn(name="parent_id_set")
    public SetSpec getSetSpec() {
        return this.setSpec;
    }
    
    public void setSetSpec(SetSpec setSpec) {
        this.setSpec = setSpec;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_model")
    public Model getModel() {
        return this.model;
    }
    
    public void setModel(Model model) {
        this.model = model;
    }
    
    @Column(name="label", nullable=false, length=12)
    public String getLabel() {
        return this.label;
    }
    
    public void setLabel(String label) {
        this.label = label;
    }
    
    @Column(name="commited", nullable=false, length=1)
    public char getCommited() {
        return this.commited;
    }
    
    public void setCommited(char commited) {
        this.commited = commited;
    }
    
    @Column(name="position", nullable=false)
    public int getPosition() {
        return this.position;
    }
    
    public void setPosition(int position) {
        this.position = position;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="setSpec")
    public Set<SetSpec> getSetSpecs() {
        return this.setSpecs;
    }
    
    public void setSetSpecs(Set<SetSpec> setSpecs) {
        this.setSpecs = setSpecs;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="setSpec")
    public Set<SetData> getSetDatas() {
        return this.setDatas;
    }
    
    public void setSetDatas(Set<SetData> setDatas) {
        this.setDatas = setDatas;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="setSpec")
    public Set<IteratorAtom> getIteratorAtoms() {
        return this.iteratorAtoms;
    }
    
    public void setIteratorAtoms(Set<IteratorAtom> iteratorAtoms) {
        this.iteratorAtoms = iteratorAtoms;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="setSpec")
    public Set<ActiveSet> getActiveSets() {
        return this.activeSets;
    }
    
    public void setActiveSets(Set<ActiveSet> activeSets) {
        this.activeSets = activeSets;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="setSpec")
    public Set<UploadedSet> getUploadedSets() {
        return this.uploadedSets;
    }
    
    public void setUploadedSets(Set<UploadedSet> uploadedSets) {
        this.uploadedSets = uploadedSets;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="setSpec")
    public Set<SetSpecVer> getSetSpecVers() {
        return this.setSpecVers;
    }
    
    public void setSetSpecVers(Set<SetSpecVer> setSpecVers) {
        this.setSpecVers = setSpecVers;
    }




}


