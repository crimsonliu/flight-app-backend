package com.tianli.flight.app.controllers;

import com.tianli.flight.app.model.Flight;
import com.tianli.flight.app.repos.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class FlightController {

    @Autowired
    FlightRepository flightRepository;

    @PostMapping("addFlight")
    public String insertFlightInfo(@RequestBody Flight flight){
        flightRepository.save(flight);
        return "flight info is successfully added";
    }


    @GetMapping("findAllFlights")
    public List<Flight> getAllFlights(){
        return flightRepository.findAll();
    }

    @PostMapping("findFlightByCityAndDate")
    public List<Flight> searchFlightByCityAndDate(@RequestBody Flight flight){
        String from = flight.getDepartureCity();
        String to = flight.getArrivalCity();
        Date time = flight.getDateOfDeparture();
        List<Flight> flights = flightRepository.findFlights(from,to,time);
        return flights;
    }

    @GetMapping("findFlightById/{id}")
    public Flight searchFlightById(@PathVariable("id") Long id){
        Flight myFlight = flightRepository.findById(id).get();
        return myFlight;
    }
}
