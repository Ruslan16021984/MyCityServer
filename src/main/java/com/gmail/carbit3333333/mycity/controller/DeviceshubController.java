package com.gmail.carbit3333333.mycity.controller;

import com.gmail.carbit3333333.mycity.entity.Deviceshub;
import com.gmail.carbit3333333.mycity.service.DeviceshubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/deviceshub")
public class DeviceshubController {
    @Autowired
    private DeviceshubService deviceshubService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Deviceshub> findAll() {
        return deviceshubService.findAll();
    }

    @RequestMapping(value = "/deleteAll", method = RequestMethod.DELETE)
    public List<Deviceshub> deleteAll() {
        return deviceshubService.deleteAll();
    }
}
