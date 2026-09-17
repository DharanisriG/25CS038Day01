package com.example.banking.service;

import com.example.banking.model.User;
import com.example.banking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void replaceUser(int userid, User newUser) {
        newUser.setId(userid);
        userRepository.save(newUser);
    }

    public void removeUser(int userid) {
        userRepository.deleteById(userid);
    }
}