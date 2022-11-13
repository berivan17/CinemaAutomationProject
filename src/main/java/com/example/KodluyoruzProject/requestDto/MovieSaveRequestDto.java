package com.example.KodluyoruzProject.requestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieSaveRequestDto {
    private Integer id;
    private String title;
    private String description;


}
