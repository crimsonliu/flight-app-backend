package com.tianli.flight.app.controllers;

import com.tianli.flight.app.model.Passenger;
import com.tianli.flight.app.repos.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class PassengerController {

    @Autowired
    PassengerRepository passengerRepository;

    @PostMapping("/addPassenger")
    public String addPassengerInfo(@RequestBody Passenger passenger){
        passengerRepository.save(passenger);
        return "passenger info added successfully";
    }



}
