package ${package}.${module-name};

import java.util.List;
import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import ${package}.${module-name}.SampleRepository;
import ${package}.model.SampleEntity;

/**
 * 
 *
 */
@ApplicationScoped
class SampleServiceImpl implements SampleService {

	@Inject
	private SampleRepository sampleRepository;

	@Override
	public String sayHello() {
		return "Hello From ${rootArtifactId}";
	}

	@Override
	@Transactional
	public void createSample() {
		SampleEntity sampleEntity = new SampleEntity();
		sampleEntity.setSampleField(UUID.randomUUID().toString());
		sampleRepository.save(sampleEntity);
	}

	@Override
	public List<SampleEntity> findAll() {
		return sampleRepository.findAll();
	}

	
	
	

}
