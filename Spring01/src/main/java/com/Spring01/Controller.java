 package com.Spring01;
@RestController
@RequesMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service){
        this.service=service;

    }
     @GetMapping
    public List<User> getAll(){
        return service.findAll();
    }
        @PostMapping
    public User create(@Valid @RequestBody User user){
        return service.save(User);
    }
}