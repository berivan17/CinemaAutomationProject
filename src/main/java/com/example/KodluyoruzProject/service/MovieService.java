package com.example.KodluyoruzProject.service;
import java.util.List;

import com.example.KodluyoruzProject.requestDto.MovieSaveRequestDto;
import com.example.KodluyoruzProject.responseDto.MovieResponseDto;

public interface MovieService {
    Integer saveMovie(MovieSaveRequestDto movieSaveRequestDto);
    List<MovieResponseDto> findAllMoviesById(Integer id);
    List<MovieResponseDto> findAllMovies();

    public void deleteMovieById(Integer id);

}
