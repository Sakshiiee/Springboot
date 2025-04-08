package com.neosoft.SpringBootSorting.Repositories;

import com.neosoft.SpringBootSorting.Entities.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository extends JpaRepository<Movies, Integer> {
    public Movies findById(int id);

    public Movies deleteById(int id);
}
