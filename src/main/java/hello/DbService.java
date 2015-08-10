package hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
@Service("EmployeeService")
public class DbService implements EmployeeService{

	private final PersonRepository personRepository;
	@Autowired
    DbService(PersonRepository repository) {
        this.personRepository = repository;
    }
	@Override
	public Person create(Person person) {
		person = personRepository.save(person);
		// TODO Auto-generated method stub
		return person;
	}
	@Override
	public List<Person> insertAll(List<Person> persons) {
		return personRepository.insert(persons);
		
	}
	@Override
	public List<Person> listOrdersbyLastName(String lastName) {
		return personRepository.findByLastName(lastName);
	}
	@Override
	public void deleteAll() {

		personRepository.deleteAll();
	}
	@Override
	public List<Person> listOrdersbyFirstName(String lastName) {
		return personRepository.findByFirstName(lastName);
		 
	}
	/*@Override
	public List<Person> listAll(Person person, Pageable pageIndex) {
		return personRepository.findAll(person.getFirstName(), pageIndex);
	}*/
	
}
