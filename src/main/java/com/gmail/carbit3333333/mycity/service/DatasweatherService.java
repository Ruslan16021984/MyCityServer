package com.gmail.carbit3333333.mycity.service;

import com.gmail.carbit3333333.mycity.entity.Datasweather;

import java.util.List;

public interface DatasweatherService {
    List<Datasweather>findAll();
    Datasweather getLastId();
    Datasweather getNodeIdLast(String nodeId);
}
