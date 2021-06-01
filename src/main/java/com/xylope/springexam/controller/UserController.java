package com.xylope.springexam.controller;

import com.xylope.springexam.dto.UserDto;
import com.xylope.springexam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/get-by-name/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.getUserById(id));

    }

    @ExceptionHandler(EntityNotFoundException.class)
    public Object handling() {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
}
