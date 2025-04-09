package com.neosoft.SpringBootSorting.Repositories;

import com.neosoft.SpringBootSorting.Entities.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoviesRepository extends JpaRepository<Movies, Integer> {
    public Movies findById(int id);

    public Movies deleteById(int id);

    @Query(value = "select * from movies m where name=?1",nativeQuery = true)
    public List<Movies> findByName(String name);

    @Query(value = "select * from movies m where name=?1 and actor=?2",nativeQuery = true)
    public List<Movies> findByNameAndActor(String name,String actor);
}
