package com.controller;

import com.model.Event;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Events {

    @RequestMapping("/get/event")
    public Event events(@RequestParam(value="name", defaultValue="First Event!") String name) {
        return new Event(1, name, "Collapp HQ", 1L);
    }
}