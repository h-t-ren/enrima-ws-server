package at.ac.iiasa.ime.enrima.example.ws.endpoint;


import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import at.ac.iiasa.ime.enrima.example.ws.service.ModelService;
import at.ac.iiasa.ime.enrima.ws.example.oxm.GetModelDescriptionRequest;
import at.ac.iiasa.ime.enrima.ws.example.oxm.GetModelDescriptionResponse;
import at.ac.iiasa.ime.enrima.ws.example.oxm.GetModelListResponse;
import at.ac.iiasa.ime.enrima.ws.example.oxm.SaveModelDescriptionRequest;
import at.ac.iiasa.ime.enrima.ws.example.oxm.SaveModelDescriptionResponse;


@Endpoint
public class ModelEndPoint implements NameSpaceURI{


	 private static final String GET_ModelList_REQUEST_LOCAL_NAME = "getModelListRequest";
	
	 private static final String GET_ModelDescription_REQUEST_LOCAL_NAME = "getModelDescriptionRequest";
	 private static final String SAVE_ModelDescription_REQUEST_LOCAL_NAME = "saveModelDescriptionRequest";
	 
	 @Autowired private ModelService modelService;

	 /**
     * This endpoint method uses marshalling to handle message with a JAXB2 payload.
    */
    @PayloadRoot(localPart = GET_ModelList_REQUEST_LOCAL_NAME, namespace = NAMESPACE_URI)
    @ResponsePayload
    public GetModelListResponse handleGetModelListRequest()
    {	
    	return modelService.getModelList();
     }
    
    @PayloadRoot(localPart = GET_ModelDescription_REQUEST_LOCAL_NAME, namespace = NAMESPACE_URI)
    @ResponsePayload
    public GetModelDescriptionResponse handleGetModelDescriptionRequest(@RequestPayload GetModelDescriptionRequest request)
    {	
    	return modelService.getModel(request);
    	
    }
    @PayloadRoot(localPart = SAVE_ModelDescription_REQUEST_LOCAL_NAME, namespace = NAMESPACE_URI)
    @ResponsePayload
    public SaveModelDescriptionResponse handleSaveModelDescriptionRequest(@RequestPayload SaveModelDescriptionRequest request)
    {	
    	return modelService.saveModel(request);
    	
    }
}
