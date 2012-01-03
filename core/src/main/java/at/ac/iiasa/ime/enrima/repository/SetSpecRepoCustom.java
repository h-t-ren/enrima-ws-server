package at.ac.iiasa.ime.enrima.repository;

import java.util.List;

import at.ac.iiasa.ime.enrima.domain.SetSpec;
import at.ac.iiasa.ime.enrima.domain.enums.SetTypeEnum;

public interface SetSpecRepoCustom {
	public List<SetSpec> findAllSet(int idModel,SetTypeEnum setTypeEnum);
}
