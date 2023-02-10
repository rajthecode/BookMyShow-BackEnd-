package com.example.BookMyShow.Model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public String name;
    private String mobile;

    @OneToMany(cascade = CascadeType.ALL)
    List<TicketEntity> ticketEntities;
}
