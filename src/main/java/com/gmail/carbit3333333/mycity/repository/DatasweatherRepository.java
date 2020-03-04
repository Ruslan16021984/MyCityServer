package com.gmail.carbit3333333.mycity.repository;

import com.gmail.carbit3333333.mycity.entity.Datasweather;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatasweatherRepository extends JpaRepository<Datasweather,Integer> {
    Datasweather findFirstByOrderByIdDescNodeid();
    Datasweather findFirstByNodeidLikeOrderByIdDesc(String nodeid);
}
