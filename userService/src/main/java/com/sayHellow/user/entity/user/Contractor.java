package com.sayHellow.user.entity.user;

import com.sayHellow.user.utils.Service;

public class Contractor extends User{

    private Service service;


    public Contractor(final Long id, final String name, final String lastname, final String username, final String email, final String address, final double score, final Service service) {
        super(id, name, lastname, username, email, address, score);
        this.service = service;
    }
}
