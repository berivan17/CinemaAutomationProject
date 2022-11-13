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
    private Integer id;
    private Integer price;
    private String seat;

    public Ticket(Integer id,String seat,Integer price){
        this.id=id;
        this.seat=seat;
        this.price=price;
    }

    @ManyToOne
    private MovieSession movieSession;

    @ManyToOne
    private Person person;






}
