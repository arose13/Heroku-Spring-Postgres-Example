package com.example.hello;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * This is the Database interface. Spring will actually read what method to and parse it to generate the SQL statement
 */
public interface PersonRepo extends CrudRepository<Person, Long> {

    List<Person> findByNameIgnoreCase(String name);

}