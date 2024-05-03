package com.sayHellow.user.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Client extends User{
    public Client(final Long id, final String name, final String lastname, final String username, final String email, final String address, final double score) {
        super(id, name, lastname, username, email, address, score);
    }
}
