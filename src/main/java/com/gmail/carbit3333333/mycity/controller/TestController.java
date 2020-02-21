package com.gmail.carbit3333333.mycity.controller;

import com.gmail.carbit3333333.mycity.entity.Test;
import com.gmail.carbit3333333.mycity.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tests")
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Test> getAlltests() {
        return testService.findAll();
    }
}
