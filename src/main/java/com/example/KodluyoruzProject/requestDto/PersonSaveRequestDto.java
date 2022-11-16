package com.example.KodluyoruzProject.requestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonSaveRequestDto {
    private int id;
    private String firstName;
    private String lastName;
    private String password;
}
