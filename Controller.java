package com.example.demo.ProjectAha.Controller;

import com.example.demo.ProjectAha.*;
import com.example.demo.ProjectAha.Models.Model1;
import com.example.demo.ProjectAha.Repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:3005/")

@RestController
public class Controller {

    @Autowired
    private userRepository userRepository;
    @PostMapping("/adduser")
    Model1 newUser(@RequestBody Model1 newUser){

        return userRepository.save(newUser);
    }
    @GetMapping("/getUsers")
    List<Model1> getUser(){

        return userRepository.findAll();
    }
    @PutMapping("/update/{id}")
    Model1 updateUser(@RequestBody Model1 newUser, @PathVariable Long id){
        return userRepository.findById(id).map(user -> {
            user.setEventName(newUser.getEventName());
            user.setPlace(newUser.getPlace());
            user.setDate(newUser.getDate());
            return userRepository.save(user);
        }).orElseThrow(()->new UserNotFoundException(id));
    }
    @GetMapping("/finduser/{id}")
    Model1 getUserById(@PathVariable Long id){
        return userRepository.findById(id)

                .orElseThrow(()->new UserNotFoundException(id));
    }
    @DeleteMapping("/deleteUser/{id}")
    String deleteUser(@PathVariable Long id) {
        if (!userRepository.existsById(id)) {
            throw new UserNotFoundException(id);
        }
        userRepository.deleteById(id);
        return "deleted user";
    }
}
                  