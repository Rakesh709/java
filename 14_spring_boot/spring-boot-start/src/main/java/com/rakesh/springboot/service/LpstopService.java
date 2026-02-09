package com.rakesh.springboot.service;

import com.rakesh.springboot.repo.LaptopRepository;
import com.rakesh.springboot.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LpstopService {

    @Autowired
    private LaptopRepository repo;

    public  void  addLaptop(Laptop lap){

//        System.out.println("method called");
        repo.save();
    }

    public  boolean isGoodForProgg(Laptop lap){

        return true;
    }
}
