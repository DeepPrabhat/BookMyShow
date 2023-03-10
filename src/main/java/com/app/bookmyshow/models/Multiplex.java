package com.app.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Table(name = "Multiplex")
@Entity
public class Multiplex {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long multiplexId;

    @Column(name = "Screen_nos")
    private Integer noOfScreen;

    @Embedded
    @Column(name = "Address")
    private Address address;

    @ManyToMany
    @Column(name = "movieList")
    private List<Movie> movies;

    @OneToMany()
    @JoinColumn(name="screen_id", referencedColumnName = "screenId")
    private List<Screen> screen;
}
