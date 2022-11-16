package com.example.KodluyoruzProject.responseDto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MovieSessionResponseDto {
    private int id;
    private LocalDateTime time;

}
