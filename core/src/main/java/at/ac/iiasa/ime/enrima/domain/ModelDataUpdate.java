package at.ac.iiasa.ime.enrima.domain;
// Generated Nov 29, 2011 9:34:07 AM by Hibernate Tools 3.2.2.GA


import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ModelDataUpdate generated by hbm2java
 */
@Entity
@Table(name="model_data_update"
)
public class ModelDataUpdate  implements java.io.Serializable {


     private Integer idUpdate;
     private Sn snByLckSts;
     private ModelDataUpdate modelDataUpdate;
     private Usr usr;
     private DbSts dbSts;
     private Model model;
     private Sn snBySn;
     private Integer locked;
     private Date updateDate;
     private Integer viewStatus;
     private String description;
     private Set<SetMember> setMembers = new HashSet<SetMember>(0);
     private Set<Comments> commentses = new HashSet<Comments>(0);
     private Set<SetMemberView> setMemberViews = new HashSet<SetMemberView>(0);
     private Set<ModelInstance> modelInstances = new HashSet<ModelInstance>(0);
     private Set<FileUploadInfo> fileUploadInfos = new HashSet<FileUploadInfo>(0);
     private Set<EntityValues> entityValueses = new HashSet<EntityValues>(0);
     private Set<ParameterValuesView> parameterValuesViews = new HashSet<ParameterValuesView>(0);
     private Set<ModelDataUpdate> modelDataUpdates = new HashSet<ModelDataUpdate>(0);

    public ModelDataUpdate() {
    }

    public ModelDataUpdate(Sn snByLckSts, ModelDataUpdate modelDataUpdate, Usr usr, DbSts dbSts, Model model, Sn snBySn, Integer locked, Date updateDate, Integer viewStatus, String description, Set<SetMember> setMembers, Set<Comments> commentses, Set<SetMemberView> setMemberViews, Set<ModelInstance> modelInstances, Set<FileUploadInfo> fileUploadInfos, Set<EntityValues> entityValueses, Set<ParameterValuesView> parameterValuesViews, Set<ModelDataUpdate> modelDataUpdates) {
       this.snByLckSts = snByLckSts;
       this.modelDataUpdate = modelDataUpdate;
       this.usr = usr;
       this.dbSts = dbSts;
       this.model = model;
       this.snBySn = snBySn;
       this.locked = locked;
       this.updateDate = updateDate;
       this.viewStatus = viewStatus;
       this.description = description;
       this.setMembers = setMembers;
       this.commentses = commentses;
       this.setMemberViews = setMemberViews;
       this.modelInstances = modelInstances;
       this.fileUploadInfos = fileUploadInfos;
       this.entityValueses = entityValueses;
       this.parameterValuesViews = parameterValuesViews;
       this.modelDataUpdates = modelDataUpdates;
    }
   
     @SequenceGenerator(name="generator", sequenceName="SEQ__JPA_MODEL_DATA_UPDATE__ID_JPA_MODEL_DATA_UPDATE")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")
    
    @Column(name="id_update", unique=true, nullable=false)
    public Integer getIdUpdate() {
        return this.idUpdate;
    }
    
    public void setIdUpdate(Integer idUpdate) {
        this.idUpdate = idUpdate;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="lck_sts")
    public Sn getSnByLckSts() {
        return this.snByLckSts;
    }
    
    public void setSnByLckSts(Sn snByLckSts) {
        this.snByLckSts = snByLckSts;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="parent_id_update")
    public ModelDataUpdate getModelDataUpdate() {
        return this.modelDataUpdate;
    }
    
    public void setModelDataUpdate(ModelDataUpdate modelDataUpdate) {
        this.modelDataUpdate = modelDataUpdate;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="updated_by")
    public Usr getUsr() {
        return this.usr;
    }
    
    public void setUsr(Usr usr) {
        this.usr = usr;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="db_sts")
    public DbSts getDbSts() {
        return this.dbSts;
    }
    
    public void setDbSts(DbSts dbSts) {
        this.dbSts = dbSts;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_model")
    public Model getModel() {
        return this.model;
    }
    
    public void setModel(Model model) {
        this.model = model;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="sn")
    public Sn getSnBySn() {
        return this.snBySn;
    }
    
    public void setSnBySn(Sn snBySn) {
        this.snBySn = snBySn;
    }
    
    @Column(name="locked")
    public Integer getLocked() {
        return this.locked;
    }
    
    public void setLocked(Integer locked) {
        this.locked = locked;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="update_date", length=29)
    public Date getUpdateDate() {
        return this.updateDate;
    }
    
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
    
    @Column(name="view_status")
    public Integer getViewStatus() {
        return this.viewStatus;
    }
    
    public void setViewStatus(Integer viewStatus) {
        this.viewStatus = viewStatus;
    }
    
    @Column(name="description", length=1000)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="modelDataUpdate")
    public Set<SetMember> getSetMembers() {
        return this.setMembers;
    }
    
    public void setSetMembers(Set<SetMember> setMembers) {
        this.setMembers = setMembers;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="modelDataUpdate")
    public Set<Comments> getCommentses() {
        return this.commentses;
    }
    
    public void setCommentses(Set<Comments> commentses) {
        this.commentses = commentses;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="modelDataUpdate")
    public Set<SetMemberView> getSetMemberViews() {
        return this.setMemberViews;
    }
    
    public void setSetMemberViews(Set<SetMemberView> setMemberViews) {
        this.setMemberViews = setMemberViews;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="modelDataUpdate")
    public Set<ModelInstance> getModelInstances() {
        return this.modelInstances;
    }
    
    public void setModelInstances(Set<ModelInstance> modelInstances) {
        this.modelInstances = modelInstances;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="modelDataUpdate")
    public Set<FileUploadInfo> getFileUploadInfos() {
        return this.fileUploadInfos;
    }
    
    public void setFileUploadInfos(Set<FileUploadInfo> fileUploadInfos) {
        this.fileUploadInfos = fileUploadInfos;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="modelDataUpdate")
    public Set<EntityValues> getEntityValueses() {
        return this.entityValueses;
    }
    
    public void setEntityValueses(Set<EntityValues> entityValueses) {
        this.entityValueses = entityValueses;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="modelDataUpdate")
    public Set<ParameterValuesView> getParameterValuesViews() {
        return this.parameterValuesViews;
    }
    
    public void setParameterValuesViews(Set<ParameterValuesView> parameterValuesViews) {
        this.parameterValuesViews = parameterValuesViews;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="modelDataUpdate")
    public Set<ModelDataUpdate> getModelDataUpdates() {
        return this.modelDataUpdates;
    }
    
    public void setModelDataUpdates(Set<ModelDataUpdate> modelDataUpdates) {
        this.modelDataUpdates = modelDataUpdates;
    }




}


