package com.app.bookmyshow.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Setter
@Getter
@Table(name = "movies")
@Entity
public class Movie {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long MovieId;

    @Column(name = "movie_name")
    private String movieName;
    public enum Genre{
        DRAMA,
        ACTION,
        HORROR,
        THRILLER,
        COMEDY,
        SCIFI
    }

    @Column(name = "genre")
    @Enumerated(EnumType.STRING)
    private  Genre genre;

    @Column(name = "director")
    private String director;

    @ManyToMany
    @JoinTable(name = "MOVIE_MULTIPLEX",
            joinColumns = @JoinColumn(name = "movie_id", referencedColumnName = "movieId"),
            inverseJoinColumns = @JoinColumn(name = "Multiplex_id", referencedColumnName = "multiplexId"))
    private List<Multiplex> multiplex;
}
