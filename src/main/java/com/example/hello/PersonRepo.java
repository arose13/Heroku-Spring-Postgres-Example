package com.example.hello;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepo extends CrudRepository<Person, Long> {

    List<Person> findByName(String name);

}
