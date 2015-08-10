package hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/createAsList")
public class EmployeeCreateController {
	private final EmployeeService service;
	@Autowired
	EmployeeCreateController(EmployeeService service) {
        this.service = service;
    }
	@RequestMapping( method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    List<Person> create(@RequestBody List<Person> persons) {
		service.deleteAll();
        return service.insertAll(persons);
    }

}
