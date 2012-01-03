package at.ac.iiasa.ime.enrima.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import at.ac.iiasa.ime.enrima.domain.Model;

public interface ModelRepo extends CrudRepository<Model, Integer> { 
	@Query("select m from Model m where m.majorLabel =:majorLabel and m.minorLabel=:minorLabel")
	public Model findModel(@Param("majorLabel") String majorLabel,@Param("minorLabel") String minorLabel);

}
