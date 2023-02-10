package com.example.BookMyShow.Service.impl;
import com.example.BookMyShow.Converter.ShowConverter;
import com.example.BookMyShow.Dto.ShowDto;
import com.example.BookMyShow.Model.*;
import com.example.BookMyShow.Repository.*;
import com.example.BookMyShow.Service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShowServiceimpl implements ShowService {


    @Autowired
    ShowRepository showRepository;
    @Autowired
    MovieRepository movieRepository;
    @Autowired
    TheatreRepository theatreRepository;
    @Autowired
    ShowSeatsRepository showSeatsRepository;

    @Override
    public ShowDto addService(ShowDto showDto) {
        ShowEntity showEntity = ShowConverter.dtoTOEntity(showDto);

        MovieEntity movieEntity = movieRepository.findById(showDto.getMovieDto().getId()).get();
        showEntity.setMovieEntity(movieEntity);

        TheatreEntity theatreEntity = theatreRepository.findById(showDto.getTheatreDto().getId()).get();
        showEntity.setTheatreEntity(theatreEntity);

        List<ShowSeatsEntity> showSeatsEntityList = createShowSeats(theatreEntity.getTheatreSeats(),showEntity);
        showEntity.setShowSeatEntities(showSeatsEntityList);

        return showDto;
    }

    public List<ShowSeatsEntity> createShowSeats(List<TheatreSeatsEntity> theatreSeats,ShowEntity showEntity){

        List<ShowSeatsEntity> showSeats = new ArrayList<>();

        for(TheatreSeatsEntity seat : theatreSeats) {

            ShowSeatsEntity showSeat = ShowSeatsEntity.builder().id(seat.getId()).seatNo(seat.getSeatNumber())
                    .seatType(seat.getSeatType()).showEntity(showEntity).build();

            showSeats.add(showSeat);
        }
        showSeatsRepository.saveAll(showSeats);
        return showSeats;
    }
    @Override
    public ShowDto getservice(int id) {

        ShowEntity showEntity = showRepository.findById(id).get();

        ShowDto showDto = ShowConverter.entityToDto(showEntity);

        return showDto;
    }
}
