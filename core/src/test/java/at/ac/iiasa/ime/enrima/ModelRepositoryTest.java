package at.ac.iiasa.ime.enrima;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import at.ac.iiasa.ime.enrima.domain.Model;
import at.ac.iiasa.ime.enrima.repository.ModelRepo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-business.xml")
@Transactional
public class ModelRepositoryTest {
	
	@Autowired ModelRepo modelRepo;
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Test
	public void modelFindTest()
	{
	
		for(Model m: modelRepo.findAll())
		{
			log.debug("model id: " + m.getIdModel());
		}
		
	}
	
	@Test @Rollback(false)
	public void modelUpdateTest()
	{
	
		Model m = modelRepo.findOne(60);
		m.setMajorLabel("Test1.2");
		modelRepo.save(m);
		
	}

}
