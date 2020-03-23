package com.prakhar.parwal.repositories;

import org.springframework.data.repository.CrudRepository;

import com.prakhar.parwal.data.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {

}
