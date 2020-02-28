package com.gmail.carbit3333333.mycity.service.serviceImpl;

import com.gmail.carbit3333333.mycity.entity.Phonesbook;
import com.gmail.carbit3333333.mycity.repository.PhonesbookRepository;
import com.gmail.carbit3333333.mycity.service.PhonesbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhonesbookServiceImpl implements PhonesbookService {
    private PhonesbookRepository repository;
    @Autowired
    public void getPhonesbookService(PhonesbookRepository serRepositoryvice){
        this.repository = serRepositoryvice;
    }
    @Override
    public List<Phonesbook> findAll() {
        return repository.findAll();
    }
}
