package com.Liquibase.demo.service;

import com.Liquibase.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Liquibase.demo.repository.UsersRepository;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    UsersRepository usersRepository;


    public User createUser(User user) {
        return usersRepository.save(user);
    }

    public List<User> getUsers() {
        return usersRepository.findAll();
    }

    public User updateUser(Long id, User users) {
        User data= usersRepository.findById(id).orElse(null);
        if (data == null) {
            return null;
        }
        data.setName(users.getName());
        data.setAddress(users.getAddress());
        data.setNumber(users.getNumber());
        return usersRepository.save(data);
    }


}
