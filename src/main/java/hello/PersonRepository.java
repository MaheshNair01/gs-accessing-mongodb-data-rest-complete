
package hello;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 
 * @author m.c.nair
 * 
 * MongoDB repository interface
 *
 */
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends MongoRepository<Person, String> {

	
	List<Person> findByLastName(@Param("name") String name);
	List<Person> findByFirstName(@Param("name") String name);
	//List<Person> findAll(@Param("name") String name, Pageable pageIndex);
	//Person save(Person saved);
}
