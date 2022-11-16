package com.example.KodluyoruzProject.service;

import com.example.KodluyoruzProject.requestDto.PersonSaveRequestDto;
import com.example.KodluyoruzProject.responseDto.PersonResponseDto;

import java.util.List;

public interface PersonService {
    PersonResponseDto savePerson(PersonSaveRequestDto personSaveRequestDto);
    List<PersonResponseDto> findAllPeople();
    void deletePersonById(int id);
}
