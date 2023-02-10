package com.example.BookMyShow.Model;

import com.example.BookMyShow.enums.SeatType;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ShowSeatsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int rate;
    private String seatNo;
    private SeatType seatType;
    private boolean booked;
    private Date bookedAt;

    @ManyToOne
    TicketEntity ticketEntity;
    @ManyToOne
    ShowEntity showEntity;
}
