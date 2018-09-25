package ${package}.${module-name}.sample;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 * 
 *
 */
@ApplicationScoped
class SampleServiceImpl implements SampleService {

	//maybe its better to use constructor or setter injection
	//uncomment while you setup JPA
	//@Inject
	//private SampleRepository sampleRepository;
	
	
	@Override
	public String sayHello() {
		return "Hello From ${rootArtifactId}";
	}
	
	
	

}
