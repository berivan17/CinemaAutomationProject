package com.example.KodluyoruzProject.entity;
import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="movieSession")
@Data
@NoArgsConstructor
public class MovieSession {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @ManyToOne
    private Movie movie;

}
