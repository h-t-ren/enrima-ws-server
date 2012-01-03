package at.ac.iiasa.ime.enrima.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import at.ac.iiasa.ime.enrima.domain.Model;
import at.ac.iiasa.ime.enrima.domain.SetSpec;
import at.ac.iiasa.ime.enrima.domain.enums.SetTypeEnum;
import at.ac.iiasa.ime.enrima.repository.ModelRepo;
import at.ac.iiasa.ime.enrima.repository.SetSpecRepo;

@Service("modelSpecService")
@Transactional(readOnly=true)
public class ModelSpecServiceImpl implements ModelSpecService {

	@Autowired private SetSpecRepo setSpecRepo;
	@Autowired private ModelRepo modelRepo;
	@Override
	public List<SetSpec> findAllSets(int idModel, SetTypeEnum setType) {
		return setSpecRepo.findAllSet(idModel, setType);
	}
	@Override
	public List<Model> findAll() {
		List<Model> modelList = new ArrayList<Model>();
		for(Model m:modelRepo.findAll())
		{
			if(m.getIdModel()>1)
			{
				modelList.add(m);
			}
		}
		return modelList;
	}
	@Override
	public Model getModelById(int idModel) {
		return modelRepo.findOne(idModel);
	}
	@Override @Transactional
	public Model save(Model model) {
		return modelRepo.save(model);
	}

}
