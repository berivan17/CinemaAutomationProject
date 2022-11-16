package com.example.KodluyoruzProject.controller;

import com.example.KodluyoruzProject.requestDto.MovieSaveRequestDto;
import com.example.KodluyoruzProject.requestDto.TicketRequestDto;
import com.example.KodluyoruzProject.responseDto.MovieResponseDto;
import com.example.KodluyoruzProject.responseDto.TicketResponseDto;
import com.example.KodluyoruzProject.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @PostMapping("/saveTicket")
    public ResponseEntity<TicketResponseDto> saveTicket(@RequestBody TicketRequestDto ticketRequestDto){
        TicketResponseDto ticketResponseDto=ticketService.saveTicket(ticketRequestDto);
        return new ResponseEntity<>(ticketResponseDto, HttpStatus.OK);

    }
    @GetMapping("/getAllTicket")
    public ResponseEntity<List<TicketResponseDto>> getAllTicket(){
        List<TicketResponseDto> ticketResponseDtoList=ticketService.getAllTicket();
        return new ResponseEntity<>(ticketResponseDtoList, HttpStatus.OK);
    }
}
