package ${package}.${module-name}.sample;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import ${package}.${module-name}.sample.SampleService; 


@Path("/sample")
public class SampleRestController {

	@Inject
	private SampleService sampleService;

	@Produces(MediaType.TEXT_PLAIN)
	@GET
	public Response sayHello() {
		return Response.status(Status.OK).entity(sampleService.sayHello()).build();
	}

}