package com.xylope.springexam.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity @Getter
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class User {
    @Id
    private String id;
    private String password;
    private String name;
    private int age;
    private String phoneNumber;
}
