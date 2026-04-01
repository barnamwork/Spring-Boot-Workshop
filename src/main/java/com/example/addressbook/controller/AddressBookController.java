package com.example.addressbook.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    private List<Map<String, String>> list = new ArrayList<>();

    @GetMapping("/get")
    public List<Map<String, String>> getAll() {
        return list;
    }

    @PostMapping("/create")
    public Map<String, String> create(@RequestBody Map<String, String> data) {
        list.add(data);
        return data;
    }

    @PutMapping("/update/{id}")
    public Map<String, String> update(@PathVariable int id, @RequestBody Map<String, String> data) {
        list.set(id, data);
        return data;
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        list.remove(id);
        return "Deleted";
    }
}