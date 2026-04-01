package com.example.addressbook.controller;

import com.example.addressbook.dto.AddressBookDTO;
import com.example.addressbook.model.AddressBook;
import com.example.addressbook.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    @Autowired
    private AddressBookService service;

    @GetMapping("/get")
    public List<AddressBook> getAll() {
        return service.getAll();
    }

    @PostMapping("/create")
    public AddressBook create(@RequestBody AddressBookDTO dto) {
        return service.create(dto);
    }

    @GetMapping("/get/{id}")
    public AddressBook getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PutMapping("/update/{id}")
    public AddressBook update(@PathVariable int id, @RequestBody AddressBookDTO dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "Deleted Successfully";
    }
}