package com.example.KodluyoruzProject.service;


import com.example.KodluyoruzProject.entity.Movie;
import com.example.KodluyoruzProject.entity.Ticket;
import com.example.KodluyoruzProject.mapper.TicketMapper;
import com.example.KodluyoruzProject.repository.TicketRepository;

import com.example.KodluyoruzProject.requestDto.TicketRequestDto;
import com.example.KodluyoruzProject.responseDto.MovieResponseDto;
import com.example.KodluyoruzProject.responseDto.TicketResponseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Service
public class TicketManager implements TicketService{

    @Autowired
    TicketRepository ticketRepository;

    @Autowired
    TicketMapper ticketMapper;
    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<TicketResponseDto> getAllTicket() {
        Iterable<Ticket> ticketList= ticketRepository.findAll();
        List<TicketResponseDto> ticketResponseDtos=new ArrayList<>();
        for(Ticket ticket: ticketList){
            TicketResponseDto ticketResponseDto=modelMapper.map(ticket,TicketResponseDto.class);
            ticketResponseDtos.add(ticketResponseDto);
        }
        return ticketResponseDtos;

    }

    @Override
    public TicketResponseDto saveTicket(TicketRequestDto ticketRequestDto) {
        return ticketMapper.ConverterforSaveTicket(ticketRequestDto);
    }



    //
   /* @Override
    public void buyTicket(MovieSession, int price,String seat) { //Yapılacak!!

    }
*/
    @Override
    public void cancelTicket(int id) {
        Ticket ticket =ticketRepository.findById(id).get();
        ticketRepository.delete(ticket);
    }



}
