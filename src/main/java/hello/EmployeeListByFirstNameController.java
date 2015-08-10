package hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * 
 * @author m.c.nair
 * Controller to handle request "/api/listByFirstname"
 * returns the list of people with a given First Name
 *
 */
@RequestMapping("/api/listByFirstname")
final class EmployeeListByFirstNameController {
	private final EmployeeService service;
	@Autowired
	EmployeeListByFirstNameController(EmployeeService service) {
        this.service = service;
    }
	@RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.ACCEPTED)
    List<Person> listOrdersbyLastName(@RequestBody Person person) {
		
		 return service.listOrdersbyFirstName(person.getFirstName());
    }
	
}
