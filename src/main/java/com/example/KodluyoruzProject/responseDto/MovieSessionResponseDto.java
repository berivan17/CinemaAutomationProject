package com.example.KodluyoruzProject.responseDto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MovieSessionResponseDto {
    private Integer id;
    private LocalDateTime time;

}
