package com.prakhar.parwal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prakhar.parwal.data.Gender;
import com.prakhar.parwal.data.Person;
import com.prakhar.parwal.data.PersonCredentials;
import com.prakhar.parwal.service.PersonService;

@RestController
public class PersonController {

	@Autowired 
	PersonService personService;
	
	@RequestMapping(value = "/person/add", method = RequestMethod.POST, 
					headers = "Accept=application/json", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addPerson(@RequestBody Person person) {

		personService.addPerson(person);
		return "save successfully";
	}
	
	@GetMapping("/persons")
	public List<Person> getPerson() {
		
		return personService.getAllPersons();
	}
	
	@RequestMapping(value = "/deletePerson/{personId}", method = RequestMethod.DELETE)
	public String deletePerson(@PathVariable("personId") int personId) {
		
		personService.deletePerson(personId);
		
		return "person deleted successfully";
	}
	
	
	@RequestMapping(value = "/updatePerson", method = RequestMethod.PUT, 
					headers = "Accept=application/json", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updatePerson(@RequestBody Person person) {
		
		personService.updatePerson(person);
		
		return "Person updated successfully";
	}
	
	

	
}
