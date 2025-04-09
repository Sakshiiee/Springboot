package com.neosoft.SpringBootSorting.Services;

import com.neosoft.SpringBootSorting.Entities.Movies;
import com.neosoft.SpringBootSorting.Repositories.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesServiceImpl implements MoviesService{

    @Autowired
    private MoviesRepository moviesRepository;

    //SAVE
    @Override
    public Movies saveMovies(Movies movies) {
        return moviesRepository.save(movies);
    }

    @Override
    public Movies getMovies(int id) {
        Movies movies = moviesRepository.findById(id);
        return movies;
    }

    @Override
    public Movies updateMovies(Movies movies) {
        return moviesRepository.save(movies);
    }

    @Override
    public void deleteMovies(int id) {
        moviesRepository.deleteById(id);

    }

    @Override
    public List<Movies> getAllMovies() {
        return moviesRepository.findAll();
    }

    @Override
    public List<Movies> getMoviesByNameAndbyActor(String name, String actor) {
        return moviesRepository.findByNameAndActor(name, actor);
    }

    @Override
    public List<Movies> getMoviesByName(String name) {
        return moviesRepository.findByName(name);
    }


}
