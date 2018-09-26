package ${package}.${module-name};

import ${package}.model.SampleEntity;
import javax.enterprise.context.ApplicationScoped;
import com.sadad.persistence.repository.AbstractCrudRepository;

@ApplicationScoped
class SampleRepositoryImpl extends AbstractCrudRepository<SampleEntity, Long> implements SampleRepository {

}
