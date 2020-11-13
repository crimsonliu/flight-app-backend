package com.tianli.flight.app.controllers;

import com.tianli.flight.app.model.User;
import com.tianli.flight.app.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/registerUser")
    public String registerUser(@RequestBody User user){
        userRepository.save(user);
        return "you have registered successfully!";
    }

    @PostMapping("/signinUser")
    public Boolean signinUser(@RequestBody User user){
        User signedUser = userRepository.findByEmail(user.getEmail());
        if(signedUser!=null){
            if(signedUser.getPassword().equals(user.getPassword())) {
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }



}
