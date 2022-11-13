package com.example.KodluyoruzProject.requestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketRequestDto {
    private Integer id;
    private Integer price;
}
