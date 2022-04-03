package com.example.demo.deo;

import com.example.demo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

//insertPerson
public interface PersonDeo {
    int insertPerson(UUID id, Person Person);
    default int insertPerson(Person Person){
        UUID id = UUID.randomUUID();
        return insertPerson(id,Person);
    }

//selectAllPeople
    List<Person> selectAllPeople();
    Optional<Person> selectPersonById(UUID id);
    int updatePersonById(UUID id,Person person);
}
