package com.tekiwll.lectia382;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {           // http://localhost:8080/api/person


    // HTTP
    //  -> GET  -- Ca sa obtinem date
    //  -> POST  -- Ca sa cream date
    //  -> PUT  -- Modificam datele
    //  -> DELETE -- Ca sa stergem date


    @GetMapping("/hello")
    public String getHelloWorld() {
        return "11111111111111111111111111";
    }

    @GetMapping("/person")
    public String getPerson() {
        return new Person("Ion", "Rusu", 23).toString();
    }


    @GetMapping("/people")
    public String getPersonList() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Ion", "Rusu", 23));
        personList.add(new Person("Ion1", "Rusu1", 25));

        return personList.toString();
    }




}
