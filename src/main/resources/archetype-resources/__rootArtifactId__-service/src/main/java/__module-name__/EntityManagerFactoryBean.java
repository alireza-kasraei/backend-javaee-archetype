package ${package}.${module-name};

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class EntityManagerFactoryBean {

	@Produces
	@PersistenceContext(unitName = "pu")
	private EntityManager entityManager;

}
