package com.app.bookmyshow.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Setter
@Getter
@Table(name = "Seat")
@Entity
public class Seat {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long seatId;

    public enum SeatType {
        BRONZE,
        PLATINUM,
        DIAMOND
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "seat_type")
    private SeatType seat;

    @Column(name = "price")
    private Integer price;

}
