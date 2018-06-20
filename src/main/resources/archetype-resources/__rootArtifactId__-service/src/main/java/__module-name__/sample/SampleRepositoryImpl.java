package ${package}.${module-name}.sample;

import ${package}.${module-name}.model.SampleEntity;
import javax.enterprise.context.ApplicationScoped;
import com.sadad.persistence.repository.CrudRepositoryImpl;

@ApplicationScoped
class SampleRepositoryImpl extends CrudRepositoryImpl<SampleEntity, Long> implements SampleRepository {

}
