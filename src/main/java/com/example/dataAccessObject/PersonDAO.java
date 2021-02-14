package com.example.dataAccessObject;

import com.example.dataTypeObject.Person;

import java.util.Collection;

public interface PersonDAO {

    Collection<Person> getAllPersons();
    void getOnePersonByID();
    Person updatePerson();
    Person deletePerson();

}
