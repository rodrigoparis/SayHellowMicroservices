package com.sayHellow.user.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private Long id;
    private String name;
    private String lastname;
    private String username;
    private String email;
    private String address;
    private double score;


}
