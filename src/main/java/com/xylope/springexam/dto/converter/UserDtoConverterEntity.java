package com.xylope.springexam.dto.converter;

import com.xylope.springexam.dto.UserDto;
import com.xylope.springexam.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserDtoConverterEntity implements UserDtoConverter<User> {
    @Override
    public UserDto convertToDto(User target) {
        return UserDto.builder()
                .id(target.getId())
                .password(target.getPassword())
                .name(target.getName())
                .age(target.getAge())
                .phoneNumber(target.getPhoneNumber())
                .build();
    }
}
