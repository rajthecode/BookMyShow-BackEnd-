package com.example.BookMyShow.Dto;

import com.example.BookMyShow.Model.ShowEntity;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MovieDto {
    private int id;
    private String name;
    private LocalDate releaseDate;
    List<ShowEntity> showEntities;
}
