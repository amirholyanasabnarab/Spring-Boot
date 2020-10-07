package com.example.firstapp.controller;

import com.example.firstapp.model.Person;
import com.example.firstapp.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/person")
@RestController
public class PersonController {
    @Autowired
    private PersonRepository personRepository;
    @GetMapping
    public List<Person> personList(){
        return personRepository.findAll();
    }
    @PostMapping
    public Person save(@RequestBody Person person){
        return personRepository.save(person);
    }

    @DeleteMapping
    public void delete(@RequestBody Person person){
        personRepository.delete(person) ;
    }

}
