package com.app.bookmyshow.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

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

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name="seat_id",referencedColumnName = "seatId")
    private List<Seat> seat;
}
