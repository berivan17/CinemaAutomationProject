package com.example.KodluyoruzProject.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.KodluyoruzProject.entity.Movie;

import java.util.List;

@Repository
public interface MovieRepository extends CrudRepository<Movie,Integer> {

    List<Movie> findAllMoviesById(Movie movie);





}
