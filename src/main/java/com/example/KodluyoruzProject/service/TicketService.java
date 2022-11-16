package com.example.KodluyoruzProject.service;

import com.example.KodluyoruzProject.entity.MovieSession;
import com.example.KodluyoruzProject.entity.Ticket;
import com.example.KodluyoruzProject.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface TicketService {

   /* void buyTicket

  /*  List<Ticket> getAllTicketForMovieSession(Integer id); */
   void cancelTicket(Integer id);
}
