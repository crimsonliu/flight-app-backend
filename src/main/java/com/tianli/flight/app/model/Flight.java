package com.tianli.flight.app.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Flight {

    @Id
    @GeneratedValue
    private Long id;
    private String flightNumber;
    private String operatingAirline;
    private String departureCity;
    private String arrivalCity;
    @Temporal(TemporalType.DATE)
    private Date dateOfDeparture;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Timestamp estimatedDepartureTime;

}
