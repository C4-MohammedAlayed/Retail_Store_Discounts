package com.example.demo.deo;

import com.example.demo.model.Person;

import java.util.List;
import java.util.UUID;

public interface PersonDeo {
    int insertPerson(UUID id, Person Person);
    default int insertPerson(Person Person){
        UUID id = UUID.randomUUID();
        return insertPerson(id,Person);
    }


    List<Person> selectAllPeople();
}
