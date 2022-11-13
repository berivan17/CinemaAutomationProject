package com.example.KodluyoruzProject.repository;

import com.example.KodluyoruzProject.entity.MovieSession;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MovieSessionRepository extends CrudRepository<MovieSession,Integer> {

    List<MovieSession> findAllMovieSessionById(MovieSession movieSession);



}
