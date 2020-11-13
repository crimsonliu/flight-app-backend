package com.tianli.flight.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ReservationRequest {

    Long flightId;
    private String passengerFirstName;
    private String passengerLastName;
    private String passengerEmail;
    private String passengerPhone;



}
