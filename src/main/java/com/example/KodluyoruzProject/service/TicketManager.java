package com.example.KodluyoruzProject.service;


import com.example.KodluyoruzProject.entity.Ticket;
import com.example.KodluyoruzProject.repository.MovieSessionRepository;
import com.example.KodluyoruzProject.repository.TicketRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Service
public class TicketManager implements TicketService{

    @Autowired
    TicketRepository ticketRepository;

    @Autowired
    MovieSessionRepository movieSessionRepository;

 //
   /* @Override
    public void buyTicket(MovieSession, int price,String seat) { //Yapılacak!!

    }
*/
    @Override
    public void cancelTicket(Integer id) {
        Ticket ticket =ticketRepository.findById(id).get();
        ticketRepository.delete(ticket);
    }



}
