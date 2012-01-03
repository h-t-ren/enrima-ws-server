package at.ac.iiasa.ime.enrima.example.ws.service;

import at.ac.iiasa.ime.enrima.ws.example.oxm.GetModelDescriptionRequest;
import at.ac.iiasa.ime.enrima.ws.example.oxm.GetModelDescriptionResponse;
import at.ac.iiasa.ime.enrima.ws.example.oxm.GetModelListResponse;
import at.ac.iiasa.ime.enrima.ws.example.oxm.SaveModelDescriptionRequest;
import at.ac.iiasa.ime.enrima.ws.example.oxm.SaveModelDescriptionResponse;

public interface ModelService {
	public GetModelListResponse getModelList();
	public GetModelDescriptionResponse getModel(GetModelDescriptionRequest getModelDescriptionRequest);
	public SaveModelDescriptionResponse saveModel(SaveModelDescriptionRequest saveModelDescriptionRequest);
}
