package com.prakhar.parwal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prakhar.parwal.data.Person;
import com.prakhar.parwal.repositories.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	public List<Person> getAllPersons() {
		
		List<Person> persons = new ArrayList<>();
		personRepository.findAll().forEach(persons::add);
		return persons;
	}
	
	public void addPerson(Person person) {
		personRepository.save(person);
	} 
	
	public void deletePerson(int personId) {
		personRepository.deleteById(new Integer(personId));
	} 
	
	public void updatePerson(Person person) {
		personRepository.save(person);
	}
}
