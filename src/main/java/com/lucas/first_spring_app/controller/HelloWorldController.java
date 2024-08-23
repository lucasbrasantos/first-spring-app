package com.lucas.first_spring_app.controller;

import com.lucas.first_spring_app.domain.User;
import com.lucas.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
    // post, get, delete, put, patch, options, head

    @Autowired
    private HelloWorldService helloWorldService;

    /*@Autowired
    private SDKAWS sdkaws; // Requires a bean of type SDKAWS*/


    @GetMapping
    public String helloWorld(){
        return helloWorldService.helloWorld("Lucas");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body) {
        return "Hello World!\nname: %s, email: %s, id: %s, filter: %s ".formatted(body.getName(), body.getEmail(), id, filter);
    }
}
