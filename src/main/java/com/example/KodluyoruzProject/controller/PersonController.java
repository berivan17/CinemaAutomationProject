package com.example.KodluyoruzProject.controller;

import com.example.KodluyoruzProject.requestDto.PersonSaveRequestDto;
import com.example.KodluyoruzProject.responseDto.PersonResponseDto;
import com.example.KodluyoruzProject.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @PostMapping("/savePerson")
    public ResponseEntity<PersonResponseDto> savePerson(@RequestBody PersonSaveRequestDto personSaveRequestDto){
        PersonResponseDto personResponseDto=personService.savePerson(personSaveRequestDto);
        return new ResponseEntity<>(personResponseDto,HttpStatus.OK);

    }
    @GetMapping("/findAllPeople")
    public ResponseEntity<List<PersonResponseDto>> findAllPeople(){
        List<PersonResponseDto> personResponseDtoList=personService.findAllPeople();
        return new ResponseEntity<>(personResponseDtoList,HttpStatus.OK);
    }
    @DeleteMapping("/deletePerson")
    public void deletePersonById(@RequestParam int id){
        personService.deletePersonById(id);
    }

}
