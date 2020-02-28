package com.gmail.carbit3333333.mycity.controller;

import com.gmail.carbit3333333.mycity.entity.Users;
import com.gmail.carbit3333333.mycity.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Users> findAll(){
      return   usersService.findAll();
    }

}
