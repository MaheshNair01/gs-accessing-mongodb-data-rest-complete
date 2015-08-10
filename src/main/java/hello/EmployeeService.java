package hello;

import java.util.List;

import org.springframework.data.domain.Pageable;
/**
 * 
 * @author m.c.nair
 * 
 * Service Layer for the REST API
 *
 */
public interface EmployeeService {

	Person create(Person person);
	//Order createOrder(Order order);
	List<Person> insertAll(List<Person> persons);
	List<Person> listOrdersbyLastName(String lastName);
	List<Person> listOrdersbyFirstName(String lastName);
	//List<Person> listAll(Person person, Pageable lastName);
	void deleteAll();
}
