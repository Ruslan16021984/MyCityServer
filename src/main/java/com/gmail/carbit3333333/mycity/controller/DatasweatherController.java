package com.gmail.carbit3333333.mycity.controller;

import com.gmail.carbit3333333.mycity.entity.Datasweather;
import com.gmail.carbit3333333.mycity.service.DatasweatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/datasweather")
public class DatasweatherController {
    @Autowired
    private DatasweatherService service;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Datasweather>getAll(){
        return service.findAll();
    }
    @RequestMapping(value = "/lastId", method = RequestMethod.GET)
    public Datasweather getLastId(){
        return service.getLastId();
    }
    @RequestMapping(value = "/lastNodeId/{node}", method = RequestMethod.GET)
    public Datasweather getLastNodeId(@PathVariable("node")String node){
        return service.getNodeIdLast(node);
    }
}
