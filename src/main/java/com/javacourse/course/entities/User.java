package com.javacourse.course.entities;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class User implements Serializable {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;
}
