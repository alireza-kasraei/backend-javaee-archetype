package ${package}.${module-name};

import ${package}.model.SampleEntity;
import com.sadad.persistence.repository.CrudRepository;

//
interface SampleRepository extends CrudRepository<SampleEntity, Long> {

}
