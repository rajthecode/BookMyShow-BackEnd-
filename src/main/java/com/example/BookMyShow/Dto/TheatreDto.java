package com.example.BookMyShow.Dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TheatreDto {
    private int id;
    private String name;
    private String address;
    private String city;

    ShowDto showDto;
}
