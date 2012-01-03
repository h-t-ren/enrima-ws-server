package at.ac.iiasa.ime.enrima.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import at.ac.iiasa.ime.enrima.domain.SetSpec;
import at.ac.iiasa.ime.enrima.domain.enums.SetStateEnum;
import at.ac.iiasa.ime.enrima.domain.enums.SetTypeEnum;

public class SetSpecRepoImpl implements SetSpecRepoCustom {

	@PersistenceContext private EntityManager em;
	
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	@Override
	public List<SetSpec> findAllSet(int idModel, SetTypeEnum setTypeEnum) {
		String queryStr = "select s from SetSpec s where s.model.idModel =:idModel and (s.commited =:commited or s.commited =:tested)";
		if (setTypeEnum.equals(SetTypeEnum.Mainset)) {
			queryStr += " and s.setSpec is null and s.iteratorContainer is null";
		} else if (setTypeEnum.equals(SetTypeEnum.Non_Indexedsubset)) {
			queryStr += " and s.setSpec is not null and s.iteratorContainer is null";
		} else if (setTypeEnum.equals(SetTypeEnum.Indexedsubset)) {
			queryStr += " and s.setSpec is not null and s.iteratorContainer is not null";
		} else {

		}
		Query query = em.createQuery(queryStr, SetSpec.class);
		query.setParameter("idModel", idModel);
		query.setParameter("commited", SetStateEnum.COMMITED.getSymbol());
		query.setParameter("tested", SetStateEnum.TESTED.getSymbol());
		return query.getResultList();

	}

}
