package com.example.springintegration.controller;

import com.example.springintegration.model.MyRecord;
import com.example.springintegration.service.MyRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.net.Authenticator;

@Controller
public class MyRecordController {

    @Autowired
    private MyRecordService service;

    @PostMapping( value = "/myRecords" )
    public void create( @RequestBody MyRecord myRecord ){
        service.create( myRecord );
    }

}
