package com.example.KodluyoruzProject.service;

import com.example.KodluyoruzProject.entity.Movie;
import com.example.KodluyoruzProject.mapper.MovieMapper;
import com.example.KodluyoruzProject.repository.MovieRepository;
import com.example.KodluyoruzProject.requestDto.MovieSaveRequestDto;
import com.example.KodluyoruzProject.responseDto.MovieResponseDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieManager implements MovieService {
    @Autowired
    MovieRepository movieRepository;

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    MovieMapper movieMapper;


    @Override
    public MovieResponseDto saveMovie(MovieSaveRequestDto movieSaveRequestDto) {
        return movieMapper.ConverterforSaveMovie(movieSaveRequestDto);
    }

  /*  @Override
    public List<MovieResponseDto> findAllMoviesById(int id) {
        Movie NewMovieId=movieRepository.findById(id).get();
        List<Movie> movieByIdList=movieRepository.findAllMoviesById(NewMovieId);

        List<MovieResponseDto> movieResponseDtos=new ArrayList<>();
        for(Movie movie: movieByIdList){
            MovieResponseDto movieResponseDto=modelMapper.map(movie,MovieResponseDto.class);
           movieResponseDtos.add(movieResponseDto);
        }
        return movieResponseDtos;
    }*/

    @Override
    public List<MovieResponseDto> findAllMovies() {
        Iterable<Movie> movieList= movieRepository.findAll();
        List<MovieResponseDto> movieResponseDtos=new ArrayList<>();
        for(Movie movie: movieList){
            MovieResponseDto movieResponseDto=modelMapper.map(movie,MovieResponseDto.class);
            movieResponseDtos.add(movieResponseDto);
        }
        return movieResponseDtos;
    }

    @Override
    public void deleteMovieById(int Id) {
        Movie movie=movieRepository.findById(Id).get();
        movieRepository.delete(movie);
    }

}
