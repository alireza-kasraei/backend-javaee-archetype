package ${package}.${module-name};

import java.util.List;

import ${package}.model.SampleEntity;



/**
 * public API for our sample service
 */
public interface SampleService {
	
	public String sayHello();

	public void createSample();

	public List<SampleEntity> findAll();


}
