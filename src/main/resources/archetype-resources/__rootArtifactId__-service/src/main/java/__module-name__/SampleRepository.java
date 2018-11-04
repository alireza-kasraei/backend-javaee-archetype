package ${package}.${module-name};

import ${package}.model.SampleEntity;
import org.apache.deltaspike.data.api.FullEntityRepository;
import org.apache.deltaspike.data.api.Repository;

//
@Repository
interface SampleRepository extends FullEntityRepository<SampleEntity, Long> {
}