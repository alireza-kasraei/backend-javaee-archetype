package ${package};

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.sadad.web.exception.mapper.InvalidArgumentsExceptionMapper;
import com.sadad.web.exception.mapper.GeneralExceptionMapper;
import com.sadad.web.exception.mapper.InvalidArgumentsExceptionMapper;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

import ${package}.${module-name}.sample.SampleRestController;

/**
 * A class extending {@link Application} and annotated with @ApplicationPath is
 * the Java EE 7 "no XML" approach to activating JAX-RS.
 * <p>
 * <p>
 * Resources are served relative to the servlet path specified in the
 * {@link ApplicationPath} annotation.
 * </p>
 */
public class JaxRsActivator extends Application {
    /* class body intentionally left blank */

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<>();

        resources.add(SampleRestController.class);
        
        // exception mappers
        addExceptionMappers(resources);

        // swagger resources
        resources.add(io.swagger.jaxrs.listing.ApiListingResource.class);
        resources.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);

        resources.add(JacksonJaxbJsonProvider.class);
        return resources;
    }



    private void addExceptionMappers(Set<Class<?>> resources) {
        resources.add(GeneralExceptionMapper.class);
        resources.add(InvalidArgumentsExceptionMapper.class);
    }

}
