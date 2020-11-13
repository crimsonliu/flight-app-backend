package com.tianli.flight.app.services;


import com.tianli.flight.app.dto.ReservationRequest;
import com.tianli.flight.app.model.Flight;
import com.tianli.flight.app.model.Passenger;
import com.tianli.flight.app.model.Reservation;
import com.tianli.flight.app.repos.FlightRepository;
import com.tianli.flight.app.repos.PassengerRepository;
import com.tianli.flight.app.repos.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ReservationServiceImpl implements ReservationService{

    @Autowired
    FlightRepository flightRepository;
    @Autowired
    PassengerRepository passengerRepository;
    @Autowired
    ReservationRepository reservationRepository;

    @Override
    public Reservation bookFlight(ReservationRequest request) {

        Long flightId = request.getFlightId();
        Flight flight = flightRepository.findById(flightId).get();

        Passenger passenger = new Passenger();
        passenger.setFirstName(request.getPassengerFirstName());
        passenger.setLastName(request.getPassengerLastName());
        passenger.setEmail(request.getPassengerEmail());
        passenger.setPhoneNumber(request.getPassengerPhone());
        passengerRepository.save(passenger);

        Reservation reservation = new Reservation();
        reservation.setFlight(flight);
        reservation.setPassenger(passenger);
        reservation.setCheckedIn(false);
        reservationRepository.save(reservation);

        return reservation;
    }
}
