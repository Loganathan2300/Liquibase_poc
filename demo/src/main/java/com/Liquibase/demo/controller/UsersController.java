package com.Liquibase.demo.controller;


import com.Liquibase.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.Liquibase.demo.service.UsersService;


import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UsersController {

    @Autowired
    UsersService usersService;

    @PostMapping("/user")
    public User createUser(@RequestBody User user){
        return usersService.createUser(user);
    }

    @GetMapping("/user")
    public List<User> getUsers(){
        return usersService.getUsers();
    }

    @PutMapping("/user/{id}")
    public User updateUser(@PathVariable("id")Long id,@RequestBody User users){
        return usersService.updateUser(id,users);
    }
}
