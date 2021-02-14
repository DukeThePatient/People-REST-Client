package com.example.dataAccessObject;

import com.example.dataTypeObject.Person;

import java.util.Collection;

public interface PersonDAO {

    Collection<Person> getAllPersons();
    Person getOnePersonByID(int userId);
    Person updatePerson();
    Person deletePerson();

}
