package com.neosoft.SpringBootSorting.Services;

import com.neosoft.SpringBootSorting.Entities.Movies;

import java.util.List;

public interface MoviesService {

    //save
    public Movies saveMovies(Movies movies);

    //get
    public Movies getMovies(int id);

    //update
    public Movies updateMovies(Movies movies);

    //delete
    public void deleteMovies(int id);

    //getAll
    public List<Movies> getAllMovies();

}
