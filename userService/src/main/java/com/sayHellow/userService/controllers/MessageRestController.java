package com.sayHellow.userService.controllers;

import jakarta.ws.rs.Produces;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class MessageRestController {

    @Value("${message:Hello default}")
    private String message;

    @RequestMapping("/message")
    @Produces(JSON)
    String getMessage() {
        return this.message;
    }
}
