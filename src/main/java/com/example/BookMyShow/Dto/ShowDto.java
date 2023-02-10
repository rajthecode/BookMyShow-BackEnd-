package com.example.BookMyShow.Dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShowDto {
    private int id;

    private LocalDate showDate;
    private LocalDate ShowTime;
    private MovieDto movieDto;
    private TheatreDto theatreDto;


}
