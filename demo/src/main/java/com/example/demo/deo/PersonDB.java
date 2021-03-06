package com.example.demo.deo;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("Dao")
public class PersonDB implements PersonDeo {

    private static List<Person>DB=new ArrayList<>();
//insertPerson
    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName(), person.setTotal(),person.isEmployee(), person.setDiscount()));
        return 1 ;
    }
    @Override
   public List<Person>selectAllPeople(){
        return DB;
    }
//selectPersonById
    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return DB.stream().filter(person -> person.getId().equals(id))
                .findFirst();
    }
//updatePersonById
    @Override
    public int updatePersonById(UUID id, Person update) {
        return selectPersonById(id)
                .map(person -> {
                    int indexOfPersonToUpdate =DB.indexOf(person);
                    if (indexOfPersonToUpdate>=0){
                        DB.set(indexOfPersonToUpdate,new Person(id,update.getName(), person.getTotal(),person.isEmployee(),person.setDiscount() ));
                        return person.getTotal();

                    }
                    return 0;
                })
                .orElse(0);
    }
}
