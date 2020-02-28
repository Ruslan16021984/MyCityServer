package com.gmail.carbit3333333.mycity.service.serviceImpl;

import com.gmail.carbit3333333.mycity.entity.Users;
import com.gmail.carbit3333333.mycity.repository.UsersRepository;
import com.gmail.carbit3333333.mycity.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsersServiceImpl implements UsersService {

    private UsersRepository repository;
    @Autowired
    private void getUsersRepository(UsersRepository usersRepository) {
        this.repository = usersRepository;
    }

    @Override
    public List<Users> findAll() {
        return repository.findAll();
    }
}
