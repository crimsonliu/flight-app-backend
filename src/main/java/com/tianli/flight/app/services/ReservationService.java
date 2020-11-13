package com.tianli.flight.app.services;

import com.tianli.flight.app.dto.ReservationRequest;
import com.tianli.flight.app.model.Reservation;

public interface ReservationService {
    public Reservation bookFlight(ReservationRequest request);
}
