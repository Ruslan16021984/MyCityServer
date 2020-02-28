package com.gmail.carbit3333333.mycity.service.serviceImpl;

import com.gmail.carbit3333333.mycity.entity.News;
import com.gmail.carbit3333333.mycity.repository.NewsRepository;
import com.gmail.carbit3333333.mycity.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NewsServiceImpl implements NewsService {
    private NewsRepository repository;

    @Autowired
    public void getNewsRepository(NewsRepository repository){
        this.repository = repository;
    }
    @Override
    public List<News> findAll() {
        return repository.findAll();
    }
}
