package com.sayHellow.user.service;

import com.sayHellow.user.entity.offer.Offer;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class OfferService {
    public List<Offer> getAllOffers() {
        //TODO Implement real logic accesing Repository
       return Collections.emptyList();
    }
}
