package com.gmail.carbit3333333.mycity.service.serviceImpl;

import com.gmail.carbit3333333.mycity.entity.Deviceshub;
import com.gmail.carbit3333333.mycity.repository.DeviceshubRepository;
import com.gmail.carbit3333333.mycity.service.DeviceshubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeviceshubServiceImpl implements DeviceshubService {

    private DeviceshubRepository repository;
    @Autowired
    public void getDeviceshubRepository(DeviceshubRepository repository){
        this.repository = repository;
    }
    @Override
    public List<Deviceshub> findAll() {
        return repository.findAll();
    }
}
