 package com.Spring01;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service){
        this.service=service;

    }
     @GetMapping("/getall")
    public List<User> getAll(){
        return service.findAll();
    }
    
     
    @PostMapping("/create")
    public User create(@Valid @RequestBody User user){
        return service.save(user);
    }
}