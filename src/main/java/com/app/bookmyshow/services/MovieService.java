package com.app.bookmyshow.services;

import com.app.bookmyshow.models.Movie;

import java.util.List;

public interface MovieService {
    Movie addMovies(Movie movie);
    List<Movie> getAllMovies();
    Movie getMovieById(Long movieId);
    Movie deleteMovie(Long movieId);
}
