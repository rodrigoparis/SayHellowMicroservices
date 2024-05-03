package com.sayHellow.user.entity.offer;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@AllArgsConstructor
public class Offer {

    private UUID id;
    private BigDecimal hourlyRate;
    private UUID serviceId;
    private UUID contractorId;
    private UUID clientId;
    private String address;
    private Float score;


}
