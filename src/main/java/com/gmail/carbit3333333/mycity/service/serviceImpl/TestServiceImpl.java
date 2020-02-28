package com.gmail.carbit3333333.mycity.service.serviceImpl;

import com.gmail.carbit3333333.mycity.entity.Test;
import com.gmail.carbit3333333.mycity.repository.TestRepository;
import com.gmail.carbit3333333.mycity.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestServiceImpl implements TestService {

    private TestRepository repository;
    @Autowired
    public void getTestRepository(TestRepository testRepository){
        this.repository = testRepository;
    }
    @Override
    public List<Test> findAll() {
        return repository.findAll();
    }
}
