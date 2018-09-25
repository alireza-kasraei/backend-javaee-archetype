package ${package}.${module-name}.sample;

import ${package}.${module-name}.model.SampleEntity;
import javax.enterprise.context.ApplicationScoped;
import com.sadad.persistence.repository.AbstractCrudRepository;

@ApplicationScoped
class SampleRepositoryImpl extends AbstractCrudRepository<SampleEntity, Long> implements SampleRepository {

}
