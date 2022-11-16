package com.example.KodluyoruzProject.controller;

import com.example.KodluyoruzProject.requestDto.MovieSaveRequestDto;
import com.example.KodluyoruzProject.requestDto.PersonSaveRequestDto;
import com.example.KodluyoruzProject.responseDto.MovieResponseDto;
import com.example.KodluyoruzProject.responseDto.PersonResponseDto;
import com.example.KodluyoruzProject.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService){
        this.movieService=movieService;
    }

    @PostMapping("/saveMovie")
    public ResponseEntity<MovieResponseDto> saveMovie(@RequestBody MovieSaveRequestDto movieSaveRequestDto){
        MovieResponseDto movieResponseDto=movieService.saveMovie(movieSaveRequestDto);
        return new ResponseEntity<>(movieResponseDto,HttpStatus.OK);

    }

    @GetMapping("/findAllMovies")
    public ResponseEntity<List<MovieResponseDto>> findAllMovies(){
        List<MovieResponseDto> movieResponseDtoList=movieService.findAllMovies();
        return new ResponseEntity<>(movieResponseDtoList, HttpStatus.OK);
    }

  /*  @GetMapping("/findAllMoviesById")
    public ResponseEntity<List<MovieResponseDto>> findAllMoviesById(@RequestParam int id){
        List<MovieResponseDto> movieResponseDtoList=movieService.findAllMoviesById(id);
        return new ResponseEntity<>(movieResponseDtoList,HttpStatus.OK);
    }
*/

}
