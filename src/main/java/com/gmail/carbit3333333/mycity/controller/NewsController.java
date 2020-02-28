package com.gmail.carbit3333333.mycity.controller;

import com.gmail.carbit3333333.mycity.entity.News;
import com.gmail.carbit3333333.mycity.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newsService;
@RequestMapping(value = "/list" , method = RequestMethod.GET)
    public List<News>findAll(){
        return newsService.findAll();
    }
}
