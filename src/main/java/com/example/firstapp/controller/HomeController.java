package com.example.firstapp.controller;

import com.example.firstapp.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/home")
@RestController
public class HomeController {
    @GetMapping
    public List<Person> personList(){
        List<Person> people=new ArrayList<>();
        Person person=new Person();
        person.setId(1);
        person.setName("Amir");
        person.setFamily("Olyanasab");
        people.add(person);
        Person person1=new Person();
        person1.setId(2);
        person1.setName("Vana");
        person1.setFamily("Petrosian");
        people.add(person1);
        return people;
    }
}
