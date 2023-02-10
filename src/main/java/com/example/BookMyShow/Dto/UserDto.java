package com.example.BookMyShow.Dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UserDto {
    private int id;
    @NonNull
    private String name;
    @NonNull
    private String mobile;

}
