package com.xylope.springexam.service;

import com.xylope.springexam.dto.UserDto;
import com.xylope.springexam.dto.converter.UserDtoConverterEntity;
import com.xylope.springexam.entity.User;
import com.xylope.springexam.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserDtoConverterEntity dtoConverter;

    public UserDto getUserById(String id) {
        User user = userRepository.getById(id);
        return dtoConverter.convertToDto(user);

    }
}
