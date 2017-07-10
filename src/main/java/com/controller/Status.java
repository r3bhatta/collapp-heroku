package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class Status {

    @RequestMapping("/status")
    public String status() {
        return String.format("Collapp is up and running at %s", LocalDate.now().toString());
    }
}