package com.example.BookMyShow.Converter;

import com.example.BookMyShow.Dto.ShowDto;
import com.example.BookMyShow.Model.ShowEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ShowConverter {

    public static ShowEntity dtoTOEntity(ShowDto showDto){

        return ShowEntity.builder().id(showDto.getId()).showDate(showDto.getShowDate()).ShowTime(showDto.getShowTime()).build();
    }

    public static ShowDto entityToDto(ShowEntity showEntity){

        return ShowDto.builder().id(showEntity.getId()).showDate(showEntity.getShowDate()).ShowTime(showEntity.getShowTime()).build();
    }
}
