package com.neosoft.SpringBootSorting.Controller;

import com.neosoft.SpringBootSorting.Entities.Movies;
import com.neosoft.SpringBootSorting.Services.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MoviesController {

    @Autowired
    private MoviesService moviesService;

    @PostMapping("/save")
    public Movies saveMovies(@RequestBody Movies movies){
        return moviesService.saveMovies(movies);
    }

    @GetMapping("/get/{id}")
    public Movies getMovies(@PathVariable int id){
        return moviesService.getMovies(id);
    }

    @PutMapping("/update")
    public Movies updateMovies(@RequestBody Movies movies){
        return moviesService.updateMovies(movies);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMovies(@PathVariable int id){
        moviesService.deleteMovies(id);
        return "Deleted Successfully!";
    }

    @GetMapping("/getall")
    public List<Movies> getAllMovies() {
        return moviesService.getAllMovies();
    }

    @GetMapping("/getMovie/{name}")
    public List<Movies> getMoviesByName(@PathVariable("name") String name){
       return moviesService.getMoviesByName(name);
    }
    @GetMapping("/getNameActor/{name}/{actor}")
    public List<Movies> getMoviesByNameAndbyActor(@PathVariable("name") String name,
                                                 @PathVariable("actor") String actor){
       return moviesService.getMoviesByNameAndbyActor(name, actor);
    }

}
