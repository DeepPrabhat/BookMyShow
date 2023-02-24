package com.app.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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

    @Column(name = "seat_nos")
    private Integer NoOfSeats;
}
