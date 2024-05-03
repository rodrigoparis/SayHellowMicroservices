package com.sayHellow.user.controllers;

import com.sayHellow.user.entity.offer.Offer;
import com.sayHellow.user.service.OfferService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping(path="/api/v1/users")
public class OfferController {

    private OfferService offerService;

    public OfferController(OfferService userService){
        this.offerService = userService;
    }

    @GetMapping
    public List<Offer> getUsers(){
        return offerService.getAllOffers();


    }
}
