package at.ac.iiasa.ime.enrima.example.ws.converter;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import at.ac.iiasa.ime.enrima.service.ModelSpecService;
import at.ac.iiasa.ime.enrima.ws.example.oxm.Auditable;
import at.ac.iiasa.ime.enrima.ws.example.oxm.Model;
import at.ac.iiasa.ime.enrima.ws.example.oxm.ObjectFactory;
import at.ac.iiasa.ime.enrima.ws.example.oxm.User;


@Service("modelConvertor")
public class ModelConverter {
	
	@Autowired private ModelSpecService modelSpecService;
	
	@Transactional(readOnly=true)
	public Model convert2XmlDomian(at.ac.iiasa.ime.enrima.domain.Model dbModel)
	{
		ObjectFactory objectFactory = new ObjectFactory();
		Model xmlModel = objectFactory.createModel();
		xmlModel.setId(dbModel.getIdModel());
		xmlModel.setName(dbModel.getMajorLabel());
		xmlModel.setVersion(dbModel.getMinorLabel());
		xmlModel.setDescription(dbModel.getName());
		xmlModel.setNote(dbModel.getDescription());
		
		Auditable auditable = objectFactory.createAuditable();
		
		if(dbModel.getUsrByCreatedBy()!=null)
		{
			User creator = objectFactory.createUser();
			creator.setId(dbModel.getUsrByCreatedBy().getIdUsr());
			creator.setLogin(dbModel.getUsrByCreatedBy().getLogin());
			auditable.setCreatedBy(creator);
			
		}
		if(dbModel.getCreationDate()!=null)
		{
			auditable.setCreationDate(XMLGregorianCalendarConverter.asXMLGregorianCalendar(dbModel.getCreationDate()));
		}
		
		if(dbModel.getUsrByModifiedBy()!=null)
		{
			User modifer = objectFactory.createUser();
			modifer.setId(dbModel.getUsrByModifiedBy().getIdUsr());
			modifer.setLogin(dbModel.getUsrByModifiedBy().getLogin());
			auditable.setModifieddBy(modifer);
			
		}
		if(dbModel.getModificationDate()!=null)
		{
			auditable.setModificationDate(XMLGregorianCalendarConverter.asXMLGregorianCalendar(dbModel.getModificationDate()));
		}
		
		xmlModel.setAuditable(auditable);
		
		//todo revision list
		
		return xmlModel;
	}

	
	@Transactional(readOnly=true)
	public at.ac.iiasa.ime.enrima.domain.Model convert2DbDomian(Model xmlModel)
	{
		at.ac.iiasa.ime.enrima.domain.Model dbModel;
		if(xmlModel.getId()==0)
		{
			dbModel = new at.ac.iiasa.ime.enrima.domain.Model();
		}
		else
		{
			dbModel =modelSpecService.getModelById(xmlModel.getId());
		}
		dbModel.setMajorLabel(xmlModel.getName());
		dbModel.setMinorLabel(xmlModel.getVersion());
		dbModel.setName(xmlModel.getDescription());
		dbModel.setDescription(xmlModel.getNote());
		//todo user 
		//dbModel.setUsrByModifiedBy(usrByModifiedBy)
		dbModel.setModificationDate(new Date());
		return dbModel;
	}
}
