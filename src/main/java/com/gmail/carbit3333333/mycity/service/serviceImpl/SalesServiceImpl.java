package com.gmail.carbit3333333.mycity.service.serviceImpl;

import com.gmail.carbit3333333.mycity.entity.Sales;
import com.gmail.carbit3333333.mycity.repository.SalesRepository;
import com.gmail.carbit3333333.mycity.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesServiceImpl implements SalesService {

    private SalesRepository repository;

    @Autowired
    public void getSalesRepository(SalesRepository salesRepository) {
        this.repository = salesRepository;
    }

    @Override
    public List<Sales> findAll() {
        return repository.findAll();
    }
}
