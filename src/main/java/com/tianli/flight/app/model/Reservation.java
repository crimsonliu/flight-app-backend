package com.tianli.flight.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity

public class Reservation {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    private Passenger passenger;
    @OneToOne
    private Flight flight;
    private boolean checkedIn;
    private String numberOfBags;
}
