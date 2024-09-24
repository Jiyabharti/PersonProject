package com.qa.PersonProject.controller;

import com.qa.PersonProject.entities.Person;
import com.qa.PersonProject.services.PersonService;
import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    private PersonService service;

    public PersonController(PersonService service){
        super();
        this.service = service;


    }

@GetMapping("/person/health")
    public String health(){
        return "Person controller is healthy";
}

    @GetMapping("/person/getAll")
    public List<Person> getAllPeople() {
        return this.service.getAllPeople();
    }



@PutMapping("/person/update")
public Person updatePerson(@PathParam("id") int id, @RequestBody @Valid Person person) {
    return this.service.updatePerson(id, person);
}

@PostMapping("/person/create")
public Person addPerson(@RequestBody @Valid Person person) {
    return this.service.addPerson(person);

}

    @DeleteMapping("/person/delete")
    public Person removePerson(@PathVariable("id") int id, @RequestBody @Valid Person person) {
            return this.service.removePerson(id, person);


}


}
