package org.example;

public class Alien {


    private int age;
    private  Laptop lap;

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {

        this.lap = lap;
    }



    public int getAge() {

        return age;
    }

    public Alien(Laptop lap, int age) {
        this.lap = lap;
        this.age = age;
    }

    public void setAge(int age) {

        this.age = age;
    }


    //constructor
    public Alien(){
        System.out.println("Object created");
    }

    public Alien(int age){
        System.out.println("para constructor called");
        this.age= age;
    }

    public  void code(){

        System.out.println("coding...");
        lap.compile();
    }


}
