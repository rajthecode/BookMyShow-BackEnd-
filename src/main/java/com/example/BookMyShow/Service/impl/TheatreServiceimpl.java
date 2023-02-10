package com.example.BookMyShow.Service.impl;

import com.example.BookMyShow.Converter.TheatreConverter;
import com.example.BookMyShow.Dto.TheatreDto;
import com.example.BookMyShow.Model.TheatreEntity;
import com.example.BookMyShow.Model.TheatreSeatsEntity;
import com.example.BookMyShow.Repository.TheatreRepository;
import com.example.BookMyShow.Repository.TheatreSeatsRepository;
import com.example.BookMyShow.Service.TheatreService;
import com.example.BookMyShow.enums.SeatType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TheatreServiceimpl implements TheatreService {

    @Autowired
    TheatreRepository theatreRepository;
    @Autowired
    TheatreSeatsRepository theatreSeatsRepository;
    @Override
    public void addTheatre(TheatreDto theatreDto) {

        TheatreEntity theatreEntity = TheatreConverter.dtoToEntity(theatreDto);
        List<TheatreSeatsEntity> seats = createTheatreSeats();
        for(TheatreSeatsEntity theatreSeats : seats){
            theatreSeats.setTheatreEntity(theatreEntity);

            theatreRepository.save(theatreEntity);


        }
    }
    public List<TheatreSeatsEntity> createTheatreSeats(){

        List<TheatreSeatsEntity> seats = new ArrayList<>();
        //CLASSIC
        seats.add(getTheatreSeats("A1",100,SeatType.CLASSIC));
        seats.add(getTheatreSeats("A2",100,SeatType.CLASSIC));
        seats.add(getTheatreSeats("A3",100,SeatType.CLASSIC));
        seats.add(getTheatreSeats("A4",100,SeatType.CLASSIC));
        //PREMIUM
        seats.add(getTheatreSeats("B1",150,SeatType.PREMIUM));
        seats.add(getTheatreSeats("B2",150,SeatType.PREMIUM));
        seats.add(getTheatreSeats("B3",150,SeatType.PREMIUM));
        seats.add(getTheatreSeats("B4",150,SeatType.PREMIUM));

        return seats;
    }
    public TheatreSeatsEntity getTheatreSeats(String seatNo, int rate, SeatType seatType){

        return TheatreSeatsEntity.builder().seatNumber(seatNo).rate(rate).seatType(seatType).build();
    }

    @Override
    public TheatreDto getUser(int id){

        TheatreEntity theatreEntity = theatreRepository.findById(id).get();

        TheatreDto theatreDto = TheatreConverter.entityToDto(theatreEntity);

        return theatreDto;
    }
}
