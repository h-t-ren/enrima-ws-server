package at.ac.iiasa.ime.enrima.example.ws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import at.ac.iiasa.ime.enrima.ws.example.oxm.GetModelDescriptionRequest;
import at.ac.iiasa.ime.enrima.ws.example.oxm.GetModelDescriptionResponse;
import at.ac.iiasa.ime.enrima.ws.example.oxm.GetModelListResponse;
import at.ac.iiasa.ime.enrima.ws.example.oxm.ObjectFactory;
import at.ac.iiasa.ime.enrima.ws.example.oxm.SaveModelDescriptionRequest;
import at.ac.iiasa.ime.enrima.ws.example.oxm.SaveModelDescriptionResponse;
import at.ac.iiasa.ime.enrima.domain.Model;
import at.ac.iiasa.ime.enrima.example.ws.converter.ModelConverter;
import at.ac.iiasa.ime.enrima.service.ModelSpecService;


@Service("modelService")
@Transactional(readOnly=true)
public class ModelServiceImpl implements ModelService {
	
	@Autowired private ModelSpecService modelSpecService;
	@Autowired private ModelConverter modelConverter;
	private ObjectFactory objectFactory = new ObjectFactory();

	@Override
	public GetModelListResponse getModelList() {
	
		GetModelListResponse getModelListResponse =objectFactory.createGetModelListResponse();
	
		for(Model m:modelSpecService.findAll())
		{
			getModelListResponse.getModel().add(modelConverter.convert2XmlDomian(m));
		}
		return getModelListResponse;
	}

	@Override
	public GetModelDescriptionResponse getModel(GetModelDescriptionRequest getModelDescriptionRequest) {

		GetModelDescriptionResponse response = objectFactory.createGetModelDescriptionResponse();
		Model m = modelSpecService.getModelById(getModelDescriptionRequest.getIdModel());
		if(m!=null)
		{
			response.setModel(modelConverter.convert2XmlDomian(m));
		}
		return response;
	}

	@Override @Transactional
	public SaveModelDescriptionResponse saveModel(SaveModelDescriptionRequest saveModelDescriptionRequest) {
		SaveModelDescriptionResponse response = objectFactory.createSaveModelDescriptionResponse();
		at.ac.iiasa.ime.enrima.domain.Model dbModel = modelConverter.convert2DbDomian(saveModelDescriptionRequest.getModel());
		at.ac.iiasa.ime.enrima.domain.Model m = modelSpecService.save(dbModel);
		response.setModel(modelConverter.convert2XmlDomian(m));
		return response;
	}

}
