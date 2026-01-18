 package com.Spring01;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Service
public class UserService{
    
	private final UserRepository repo;
    
    public UserService(UserRepository repo){

        this.repo=repo;
    }
    
  public User save(User user){
        return repo.save(user);
    }

  public List<User> findAll(){
    return repo.findAll();
  }

}