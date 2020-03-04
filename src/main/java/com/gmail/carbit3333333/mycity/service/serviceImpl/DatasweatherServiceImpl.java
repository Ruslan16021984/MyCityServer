package com.gmail.carbit3333333.mycity.service.serviceImpl;

import com.gmail.carbit3333333.mycity.entity.Datasweather;
import com.gmail.carbit3333333.mycity.repository.DatasweatherRepository;
import com.gmail.carbit3333333.mycity.service.DatasweatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DatasweatherServiceImpl implements DatasweatherService {

    private DatasweatherRepository repository;
    @Autowired
    public void getDataweatherRepository(DatasweatherRepository repository){
        this.repository= repository;
    }
    @Override
    public List<Datasweather> findAll() {
        return repository.findAll();
    }

    @Override
    public Datasweather getLastId() {
        return repository.findFirstByOrderByIdDescNodeid();
    }

    @Override
    public Datasweather getNodeIdLast(String nodeid) {
        return repository.findFirstByNodeidLikeOrderByIdDesc(nodeid);
    }

}
