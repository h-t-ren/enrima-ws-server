package at.ac.iiasa.ime.enrima.repository;

import org.springframework.data.repository.CrudRepository;
import at.ac.iiasa.ime.enrima.domain.Usr;

public interface UsrRepo extends CrudRepository<Usr, Integer> { 
	
	public Usr findByLogin(String login);

}
