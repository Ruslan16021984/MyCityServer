package com.gmail.carbit3333333.mycity.controller;

import com.gmail.carbit3333333.mycity.entity.Phonesbook;
import com.gmail.carbit3333333.mycity.service.PhonesbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/phonesbook")
public class PhonesbookController {
    @Autowired
    private PhonesbookService phonesbookService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Phonesbook> findAll(){
      return   phonesbookService.findAll();
    }
}
