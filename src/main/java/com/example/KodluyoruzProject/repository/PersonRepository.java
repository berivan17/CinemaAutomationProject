package com.example.KodluyoruzProject.repository;

import com.example.KodluyoruzProject.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person,Integer> {

}
