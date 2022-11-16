package com.example.KodluyoruzProject.entity;
import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ticket")
@NoArgsConstructor
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    private int price;
    private String seat;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "MOVIE_ID", referencedColumnName = "MOVIE_ID")
    private Movie movie;








}
