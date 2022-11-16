package com.example.KodluyoruzProject.mapper;


import com.example.KodluyoruzProject.entity.Movie;
import com.example.KodluyoruzProject.entity.Person;
import com.example.KodluyoruzProject.repository.PersonRepository;
import com.example.KodluyoruzProject.requestDto.PersonSaveRequestDto;
import com.example.KodluyoruzProject.responseDto.PersonResponseDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {
    @Autowired
    PersonRepository personRepository;
    @Autowired
    ModelMapper modelMapper;
    public PersonResponseDto ConverterforPerson(PersonSaveRequestDto personSaveRequestDto) {

        Person person =modelMapper.map(personSaveRequestDto,Person.class);
        person= personRepository.save(person);
        PersonResponseDto personResponseDto=modelMapper.map(person,PersonResponseDto.class);
        return personResponseDto;
    }
}