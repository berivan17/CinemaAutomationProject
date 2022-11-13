package com.example.KodluyoruzProject.service;

import com.example.KodluyoruzProject.entity.Movie;
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




    @Override
    public Integer saveMovie(MovieSaveRequestDto movieSaveRequestDto) {
        Movie movie =modelMapper.map(movieSaveRequestDto,Movie.class);
        movie=movieRepository.save(movie);
        return movie.getId();
    }

    @Override
    public List<MovieResponseDto> findAllMoviesById(Integer id) { //dikkat yanlış olabilir
        Movie NewMovieId=movieRepository.findById(id).get();
        List<Movie> movieByIdList=movieRepository.findAllMoviesById(NewMovieId);

        List<MovieResponseDto> movieResponseDtos=new ArrayList<>();
        for(Movie movie: movieByIdList){
            MovieResponseDto movieResponseDto=modelMapper.map(movie,MovieResponseDto.class);
           movieResponseDtos.add(movieResponseDto);
        }
        return movieResponseDtos;
    }

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
    public void deleteMovieById(Integer id) {
        Movie movie=movieRepository.findById(id).get();
        movieRepository.delete(movie);
    }

}
