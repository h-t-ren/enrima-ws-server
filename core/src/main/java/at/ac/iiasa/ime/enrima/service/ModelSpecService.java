package at.ac.iiasa.ime.enrima.service;

import java.util.List;

import at.ac.iiasa.ime.enrima.domain.Model;
import at.ac.iiasa.ime.enrima.domain.SetSpec;
import at.ac.iiasa.ime.enrima.domain.enums.SetTypeEnum;

public interface ModelSpecService {
	public List<SetSpec> findAllSets(int idModel,SetTypeEnum setType);
	public List<Model> findAll();
	public Model getModelById(int idModel);
	public Model save(Model model);

}
