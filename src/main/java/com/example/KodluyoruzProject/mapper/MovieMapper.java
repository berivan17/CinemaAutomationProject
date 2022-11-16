package com.example.KodluyoruzProject.mapper;

import com.example.KodluyoruzProject.entity.Movie;
import com.example.KodluyoruzProject.repository.MovieRepository;
import com.example.KodluyoruzProject.requestDto.MovieSaveRequestDto;
import com.example.KodluyoruzProject.responseDto.MovieResponseDto;
import com.example.KodluyoruzProject.responseDto.PersonResponseDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MovieMapper {
    @Autowired
    MovieRepository movieRepository;
    @Autowired
    ModelMapper modelMapper;
    public MovieResponseDto ConverterforSaveMovie(MovieSaveRequestDto movieSaveRequestDto) {

        Movie movie =modelMapper.map(movieSaveRequestDto,Movie.class);
        movie= movieRepository.save(movie);
        MovieResponseDto movieResponseDto=modelMapper.map(movie,MovieResponseDto.class);
        return movieResponseDto;
    }

}
