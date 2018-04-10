package ${package}.${module-name}.sample;

import ${package}.${module-name}.model.SampleEntity;
import javax.inject.Named;
import com.sadad.persistence.repository.CrudRepositoryImpl;

@Named("sampleRepository")
class SampleRepositoryImpl extends CrudRepositoryImpl<SampleEntity, Long> implements SampleRepository {

}
