package com.example.BookMyShow.Converter;

import com.example.BookMyShow.Dto.TheatreDto;
import com.example.BookMyShow.Model.TheatreEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TheatreConverter {

    public static TheatreEntity dtoToEntity(TheatreDto theatreDto){

        return TheatreEntity.builder().name(theatreDto.getName()).address(theatreDto.getAddress())
                .city(theatreDto.getCity()).build();
    }
    public static TheatreDto entityToDto(TheatreEntity theatreEntity){

        return TheatreDto.builder().name(theatreEntity.getName()).address(theatreEntity.getAddress())
                .city(theatreEntity.getCity()).build();
    }
}
