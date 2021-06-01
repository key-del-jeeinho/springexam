package com.xylope.springexam.dto;

import lombok.*;

@Builder
@ToString
@EqualsAndHashCode
@Getter @Setter
public class UserDto {
    private String id;
    private String password;
    private String name;
    private  int age;
    private String phoneNumber;
}
