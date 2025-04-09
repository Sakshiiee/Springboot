package com.neosoft.SpringBootSorting.Services;

import com.neosoft.SpringBootSorting.Entities.Movies;

import java.util.List;

public interface MoviesService {

    //
    public Movies saveMovies(Movies movies);

    //get
    public Movies getMovies(int id);

    //update
    public Movies updateMovies(Movies movies);

    //delete
    public void deleteMovies(int id);

    //getAll
    public List<Movies> getAllMovies();

    //get movie
    public List<Movies> getMoviesByName(String name);

    //get a list of movie based on name
    public List<Movies> getMoviesByNameAndbyActor(String name, String actor);

    //get actors
}
