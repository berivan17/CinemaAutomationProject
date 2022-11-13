package com.example.KodluyoruzProject.controller;

import com.example.KodluyoruzProject.entity.MovieSession;
import com.example.KodluyoruzProject.requestDto.MovieSessionRequestDto;
import com.example.KodluyoruzProject.responseDto.MovieResponseDto;
import com.example.KodluyoruzProject.responseDto.MovieSessionResponseDto;
import com.example.KodluyoruzProject.service.MovieSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/MovieSession")
public class MovieSessionController {

    @Autowired
    MovieSessionService movieSessionService;

    @PostMapping("/saveMovieSession")
    public ResponseEntity<Integer> saveMovieSession(@RequestBody MovieSessionRequestDto movieSessionRequestDto){
        Integer id= movieSessionService.saveMovieSession(movieSessionRequestDto);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }


    @GetMapping("/findAllMovieSessionById")
    public ResponseEntity<List<MovieSessionResponseDto>> findAllMoviesById(@RequestParam Integer id){
        List<MovieSessionResponseDto> movieSessionResponseDtoList=movieSessionService.findAllMovieSessionById(id);
        return new ResponseEntity<>(movieSessionResponseDtoList,HttpStatus.OK);
    }

    @DeleteMapping("/deleteMovieSession")
    public void removeSession(@RequestParam Integer id){
        movieSessionService.removeSession(id);
    }



}
