package com.example.KodluyoruzProject.mapper;

import com.example.KodluyoruzProject.entity.Movie;
import com.example.KodluyoruzProject.entity.Ticket;
import com.example.KodluyoruzProject.repository.TicketRepository;
import com.example.KodluyoruzProject.requestDto.MovieSaveRequestDto;
import com.example.KodluyoruzProject.requestDto.TicketRequestDto;
import com.example.KodluyoruzProject.responseDto.MovieResponseDto;
import com.example.KodluyoruzProject.responseDto.TicketResponseDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TicketMapper {



    @Autowired
    ModelMapper modelMapper;
    @Autowired
    TicketRepository ticketRepository;



    public TicketResponseDto ConverterforSaveTicket(TicketRequestDto ticketRequestDto) {

        Ticket ticket =modelMapper.map(ticketRequestDto,Ticket.class);
        ticket= ticketRepository.save(ticket);
        TicketResponseDto ticketResponseDto=modelMapper.map(ticket,TicketResponseDto.class);
        return ticketResponseDto;

    }
    public TicketResponseDto getTicketDto(TicketRequestDto ticketRequestDto){
       TicketResponseDto ticketResponseDto=new TicketResponseDto();
       ticketResponseDto.setId(ticketRequestDto.getId());
       ticketResponseDto.setSeat(ticketRequestDto.getSeat());
       ticketResponseDto.setPrice(ticketRequestDto.getPrice());

       return ticketResponseDto;
    }
}
