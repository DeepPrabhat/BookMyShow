package com.app.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Table(name = "Screen")
@Entity
public class Screen {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long screenId;

    @Column(name = "Movie_playing")
    private String moviePlaying;

    @OneToMany
    @JoinColumn(name = "Seat_id" , referencedColumnName = "seatId")
    private List<Seat> NoOfSeats;

}
