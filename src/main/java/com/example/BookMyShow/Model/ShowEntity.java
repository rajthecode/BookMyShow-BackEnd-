package com.example.BookMyShow.Model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ShowEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDate showDate;
    private LocalDate ShowTime;
    private Date createdAt;
    private Date updatedAt;

    @OneToMany
    List<TicketEntity> ticketEntities;

    @OneToMany
    List<ShowSeatsEntity> showSeatEntities;

    @ManyToOne
    MovieEntity movieEntity;

    @ManyToOne
    TheatreEntity theatreEntity;
}
