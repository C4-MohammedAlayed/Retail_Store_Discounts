package com.example.demo.Service;

import com.example.demo.deo.PersonDeo;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {
    private final PersonDeo personDeo;
@Autowired
    public PersonService(@Qualifier("Dao") PersonDeo personDeo) {
        this.personDeo = personDeo;
    }


//addPerson
    public int addPerson(Person person){
        return personDeo.insertPerson(person);
    }
//getAllPeople
     public List<Person>getAllPeople(){
    return personDeo.selectAllPeople();
     }
//getPersonById
     public Optional<Person>getPersonById(UUID id){
    return personDeo.selectPersonById(id);
     }
     //updatePerson by id
public int updatePerson(UUID id, Person newPerson){
    return personDeo.updatePersonById(id,newPerson);
}
}
