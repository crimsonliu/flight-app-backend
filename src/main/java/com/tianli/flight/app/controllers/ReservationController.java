package com.tianli.flight.app.controllers;


import com.tianli.flight.app.model.Reservation;
import com.tianli.flight.app.repos.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {

    @Autowired
    ReservationRepository reservationRepository;

    public String addReservationInfo(@RequestBody Reservation reservation){
        reservationRepository.save(reservation);
        return "reservation added successfully!";
    }


}
