package com.app.bookmyshow.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Setter
@Getter
@Table(name = "BOOKING")
@Entity
public class Booking {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long bookingId;

    @Column(name = "movie_name")
    private String movieName;

    @Column(name = "booking_date")
    @Temporal(TemporalType.DATE)
    private Date bookingDate;

    @Column(name = "seat_no.")
    private Integer seatNo;
}
