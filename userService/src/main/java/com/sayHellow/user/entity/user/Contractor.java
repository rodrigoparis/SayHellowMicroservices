package com.sayHellow.user.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

 @Data
 @AllArgsConstructor
 @NoArgsConstructor
public class Contractor extends User{
    private UUID serviceId;
    private List<UUID> contractorOffers;
    private List<UUID> contractorContracts;

    public Contractor(final Long id, final String name, final String lastname, final String username, final String email, final String address, final double score, final UUID serviceId) {
        super(id, name, lastname, username, email, address, score);
        this.serviceId = serviceId;
    }
}
