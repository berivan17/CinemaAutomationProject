package com.example.KodluyoruzProject.service;
import com.example.KodluyoruzProject.entity.Person;
import com.example.KodluyoruzProject.mapper.PersonMapper;
import com.example.KodluyoruzProject.repository.PersonRepository;
import com.example.KodluyoruzProject.requestDto.PersonSaveRequestDto;
import com.example.KodluyoruzProject.responseDto.PersonResponseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class PersonManager implements PersonService{

   @Autowired
   private PersonRepository personRepository;
   @Autowired
   private ModelMapper modelMapper;

   @Autowired
   PersonMapper personMapper;


    @Override
    public PersonResponseDto savePerson(PersonSaveRequestDto personSaveRequestDto) {
       return personMapper.ConverterforPerson(personSaveRequestDto);

    }


    @Override
    public List<PersonResponseDto> findAllPeople() {
        Iterable<Person> personList=personRepository.findAll();
        List<PersonResponseDto> personResponseDtos=new ArrayList<>();
        for(Person person: personList){
            PersonResponseDto personResponseDto=modelMapper.map(person,PersonResponseDto.class);
            personResponseDtos.add(personResponseDto);
        }
        return personResponseDtos;
    }

    @Override
    public void deletePersonById(int id) {
        Person person=personRepository.findById(id).get();
        personRepository.delete(person);
    }
}
