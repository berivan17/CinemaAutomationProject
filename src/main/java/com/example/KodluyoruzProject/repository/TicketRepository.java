package com.example.KodluyoruzProject.repository;


import com.example.KodluyoruzProject.entity.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends CrudRepository<Ticket,Integer> {


}
