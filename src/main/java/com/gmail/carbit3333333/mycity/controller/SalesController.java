package com.gmail.carbit3333333.mycity.controller;

import com.gmail.carbit3333333.mycity.entity.Sales;
import com.gmail.carbit3333333.mycity.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SalesController {
    @Autowired
    private SalesService service;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Sales>findAll(){
        return service.findAll();
    }
}
