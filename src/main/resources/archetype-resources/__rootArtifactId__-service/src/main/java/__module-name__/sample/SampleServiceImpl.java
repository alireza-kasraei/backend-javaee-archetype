package ${package}.${module-name}.sample;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * 
 *
 */
@Stateless
public class SampleServiceImpl implements SampleService {

	@Inject
	private SampleRepository sampleRepository;

}
