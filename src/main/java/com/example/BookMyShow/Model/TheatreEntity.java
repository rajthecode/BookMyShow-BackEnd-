package com.example.BookMyShow.Model;

import com.example.BookMyShow.enums.SeatType;
import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class TheatreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private SeatType seatType;
    private String address;
    private String city;

    @OneToMany
    List<ShowEntity> showEntities;

    @OneToMany
    List<TheatreSeatsEntity> theatreSeats;
}
