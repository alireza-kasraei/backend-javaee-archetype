package ${package}.${module-name};

import java.util.List;

import javax.inject.Inject;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import ${package}.ServiceDeployment;
import ${package}.${module-name}.SampleService;
import ${package}.model.SampleEntity;

@RunWith(Arquillian.class)
public class SampleServiceTest extends ServiceDeployment {

	@Inject
	SampleService sampleService;

	@Test
	public void mustHaveOneItem() {
		sampleService.createSample();
		List<SampleEntity> allSamples = sampleService.findAll();
		Assert.assertEquals(1, allSamples.size());
	}

	@Test
	public void testSayHelloService() {
		final String sayHello = sampleService.sayHello();
		Assert.assertEquals("Hello From ${rootArtifactId}", sayHello);
	}
}