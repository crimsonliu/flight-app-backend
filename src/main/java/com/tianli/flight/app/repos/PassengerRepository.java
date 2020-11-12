package com.tianli.flight.app.repos;

import com.tianli.flight.app.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger,Long> {
}
