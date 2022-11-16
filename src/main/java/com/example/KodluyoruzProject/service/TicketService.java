package com.example.KodluyoruzProject.service;

import com.example.KodluyoruzProject.entity.MovieSession;
import com.example.KodluyoruzProject.entity.Ticket;
import com.example.KodluyoruzProject.repository.TicketRepository;
import com.example.KodluyoruzProject.requestDto.MovieSaveRequestDto;
import com.example.KodluyoruzProject.requestDto.TicketRequestDto;
import com.example.KodluyoruzProject.responseDto.MovieResponseDto;
import com.example.KodluyoruzProject.responseDto.MovieSessionResponseDto;
import com.example.KodluyoruzProject.responseDto.TicketResponseDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface TicketService {


   List<TicketResponseDto> getAllTicket();

   TicketResponseDto saveTicket(TicketRequestDto ticketRequestDto);

   void cancelTicket(int id);
}
