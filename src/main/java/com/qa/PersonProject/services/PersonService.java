package com.qa.PersonProject.services;


import com.qa.PersonProject.entities.Person;
import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;


//service annotation
@Service
public class PersonService {

    private final List<Person> people = new ArrayList<>();


    public Person addPerson(@RequestBody @Valid Person person) {
        this.people.add(person);
        return this.people.get(this.people.size() - 1);
    }

        public List<Person> getAllPeople() {
            return this.people;
        }
    public Person updatePerson(@PathParam("id") int id, @RequestBody @Valid Person person) {
        this.people.remove(id);
        this.people.add(id, person);
        return this.people.get(id);
    }
    public Person removePerson(@PathVariable("id") int id, @RequestBody @Valid Person person) {
        return this.people.remove(id);


    }
}
