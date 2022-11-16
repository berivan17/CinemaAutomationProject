package com.example.KodluyoruzProject.requestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieSaveRequestDto {

    private int Id;
    private String title;
    private String description;


}
