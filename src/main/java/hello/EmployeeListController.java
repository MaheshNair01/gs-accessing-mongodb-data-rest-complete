package hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author m.c.nair
 *
 * 
 *
 * Controller to handle request "/api/listPerson"
 * returns the list of people with a given Last Name
 *
 */

@RestController
@RequestMapping("/api/listPerson")
final class EmployeeListController {
	private final EmployeeService service;
	@Autowired
	EmployeeListController(EmployeeService service) {
        this.service = service;
    }
	@RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.ACCEPTED)
	
    List<Person> listOrdersbyLastName(@RequestBody Person person) {
		
			 return service.listOrdersbyLastName(person.getLastName());
    }
	
}
