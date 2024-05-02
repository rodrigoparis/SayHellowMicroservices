package com.sayHellow.user.service;

import com.sayHellow.user.entity.user.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public List<User> getAllUsers() {
        //TODO Implement real logic accesing Repository
       return List.of(new User(1L,"Rod","Paris","rparis","rpari@mailcom","Direccion",4.3));
    }
}
