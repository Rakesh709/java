package com.rakesh.springboot.repo;


import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public  void  save(){
        System.out.println("Save in database.....");
    }
}
