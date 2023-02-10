package com.example.BookMyShow.Service;

import com.example.BookMyShow.Dto.UserDto;

public interface UserService {

    void addUser(UserDto userDto);

    UserDto getUser(int id);
}
