package com.example.KodluyoruzProject.service;

import com.example.KodluyoruzProject.entity.MovieSession;
import com.example.KodluyoruzProject.repository.MovieSessionRepository;
import com.example.KodluyoruzProject.requestDto.MovieSessionRequestDto;

import com.example.KodluyoruzProject.responseDto.MovieSessionResponseDto;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;


@Service
@AllArgsConstructor
public class MovieSessionManager implements MovieSessionService {

    @Autowired
    MovieSessionRepository movieSessionRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<MovieSessionResponseDto> findAllMovieSessions() { //şimdilik kalsın ama mantıklı olmayabilir!
        Iterable<MovieSession> movieSessionsList=movieSessionRepository.findAll();

        List<MovieSessionResponseDto> movieSessionResponseDtos=new ArrayList<>();

        for(MovieSession movieSession:movieSessionsList){
            MovieSessionResponseDto movieSessionResponseDto=modelMapper.map(movieSession,MovieSessionResponseDto.class);
            movieSessionResponseDtos.add(movieSessionResponseDto);
        }
        return movieSessionResponseDtos;
    }

    @Override
    public Integer saveMovieSession(MovieSessionRequestDto movieSessionRequestDto) {
        MovieSession movieSession=modelMapper.map(movieSessionRequestDto,MovieSession.class);
        movieSession=movieSessionRepository.save(movieSession);
        return movieSession.getId();
    }

    @Override
    public List<MovieSessionResponseDto> findAllMovieSessionById(int id) { //dikkat yanlış olabilir
        MovieSession NewMovieSessionId=movieSessionRepository.findById(id).get();
        List<MovieSession> movieSessionByIdList=movieSessionRepository.findAllMovieSessionById(NewMovieSessionId);

        List<MovieSessionResponseDto> movieResponseDtos=new ArrayList<>();
        for(MovieSession movieSession : movieSessionByIdList){
            MovieSessionResponseDto movieSessionResponseDto=modelMapper.map(movieSession,MovieSessionResponseDto.class);
            movieResponseDtos.add(movieSessionResponseDto);
        }
        return movieResponseDtos;
    }


    @Override
    public void removeSession(int id) {
        MovieSession movieSession=movieSessionRepository.findById(id).get();
        movieSessionRepository.delete(movieSession);
    }

}
