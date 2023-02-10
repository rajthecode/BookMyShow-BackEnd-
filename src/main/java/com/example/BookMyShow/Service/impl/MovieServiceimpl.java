package com.example.BookMyShow.Service.impl;

import com.example.BookMyShow.Converter.MovieConverter;
import com.example.BookMyShow.Dto.MovieDto;
import com.example.BookMyShow.Dto.UserDto;
import com.example.BookMyShow.Model.MovieEntity;
import com.example.BookMyShow.Repository.MovieRepository;
import com.example.BookMyShow.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceimpl implements MovieService {
    @Autowired
    MovieRepository movieRepository;

    @Override
    public MovieDto addMovie(MovieDto movieDto){

        MovieEntity movieEntity = MovieConverter.dtoToEntity(movieDto);
        movieRepository.save(movieEntity);

        return movieDto;
    }
    @Override
    public MovieDto getMovie(int id){

        MovieEntity movieEntity = movieRepository.findById(id).get();

        MovieDto movieDto = MovieConverter.entityToDto(movieEntity);
        return movieDto;
    }

}
