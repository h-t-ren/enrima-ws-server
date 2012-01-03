package at.ac.iiasa.ime.enrima.repository;

import org.springframework.data.repository.CrudRepository;
import at.ac.iiasa.ime.enrima.domain.SetSpec;

public interface SetSpecRepo extends CrudRepository<SetSpec, Integer>,SetSpecRepoCustom { 
	
	

}
