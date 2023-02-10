package com.example.BookMyShow.Service;

import com.example.BookMyShow.Dto.ShowDto;

    public interface ShowService {

        ShowDto addService(ShowDto showDto);

        ShowDto getservice(int id);
    }


