package com.example.BookMyShow.Service;

import com.example.BookMyShow.Dto.TheatreDto;

public interface TheatreService {

    void addTheatre(TheatreDto theatreDto);

    TheatreDto getUser(int id);
}
