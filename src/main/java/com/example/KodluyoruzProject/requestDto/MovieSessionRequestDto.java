package com.example.KodluyoruzProject.requestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieSessionRequestDto {

    private Integer id;
    private LocalDateTime time;

}
