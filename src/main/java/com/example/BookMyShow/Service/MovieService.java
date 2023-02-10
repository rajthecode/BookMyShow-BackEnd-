package com.example.BookMyShow.Service;

import com.example.BookMyShow.Dto.MovieDto;

public interface MovieService {

    //add
    MovieDto addMovie(MovieDto movieDto);

    //get
    MovieDto getMovie(int id);
}
