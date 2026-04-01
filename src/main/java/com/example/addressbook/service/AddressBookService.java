package com.example.addressbook.service;

import com.example.addressbook.dto.AddressBookDTO;
import com.example.addressbook.model.AddressBook;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService {

    private List<AddressBook> list = new ArrayList<>();
    private int idCounter = 1;

    public List<AddressBook> getAll() {
        return list;
    }

    public AddressBook create(AddressBookDTO dto) {
        AddressBook obj = new AddressBook(idCounter++, dto.name, dto.city);
        list.add(obj);
        return obj;
    }
}