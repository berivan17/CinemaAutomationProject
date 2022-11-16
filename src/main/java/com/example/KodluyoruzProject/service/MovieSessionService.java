package com.example.KodluyoruzProject.service;

import com.example.KodluyoruzProject.requestDto.MovieSessionRequestDto;

import com.example.KodluyoruzProject.responseDto.MovieSessionResponseDto;


import java.util.List;


public interface MovieSessionService {
    List<MovieSessionResponseDto> findAllMovieSessions();
    Integer saveMovieSession(MovieSessionRequestDto movieSessionRequestDto);

    List<MovieSessionResponseDto> findAllMovieSessionById(int id);



    void removeSession(int id);


}
