package com.example.KodluyoruzProject.requestDto;

import lombok.Data;

@Data
public class PersonSaveRequestDto {
    private Integer id;
    private String fullName;
    private String password;
}
