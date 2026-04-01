package com.example.addressbook.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @GetMapping("/hello")
    public String hello() {
        return "Address Book Running";
    }
}