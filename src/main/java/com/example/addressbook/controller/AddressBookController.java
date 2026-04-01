package com.example.addressbook.controller;

import com.example.addressbook.dto.AddressBookDTO;
import com.example.addressbook.model.AddressBook;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    private List<AddressBook> list = new ArrayList<>();
    private int idCounter = 1;

    @GetMapping("/get")
    public List<AddressBook> getAll() {
        return list;
    }

    @PostMapping("/create")
    public AddressBook create(@RequestBody AddressBookDTO dto) {
        AddressBook obj = new AddressBook(idCounter++, dto.name, dto.city);
        list.add(obj);
        return obj;
    }
}