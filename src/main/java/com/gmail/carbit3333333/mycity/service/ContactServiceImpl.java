package com.gmail.carbit3333333.mycity.service;

import com.gmail.carbit3333333.mycity.entity.Contact;
import com.gmail.carbit3333333.mycity.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContactServiceImpl implements ContactService {
    private ContactRepository repository;
    @Autowired
    public void setContactRepository(ContactRepository theRepository){
        this.repository = theRepository;
    }
    @Override
    public List<Contact> findAll() {
        return repository.findAll();
    }



}
