package com.example.springintegration.service;

import com.example.springintegration.model.MyRecord;
import com.example.springintegration.repository.MyRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyRecordService {

    @Autowired
    private MyRecordRepository repository;

    public void create( MyRecord myRecord ){
        repository.save( myRecord );
    }

}
