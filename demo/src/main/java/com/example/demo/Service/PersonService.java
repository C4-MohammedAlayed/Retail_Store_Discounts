package com.example.demo.Service;

import com.example.demo.deo.PersonDeo;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonDeo personDeo;
@Autowired
    public PersonService(@Qualifier("Dao") PersonDeo personDeo) {
        this.personDeo = personDeo;
    }



    public int addPerson(Person person){
        return personDeo.insertPerson(person);
    }

     public List<Person>getAllPeople(){
    return personDeo.selectAllPeople();
     }

}
