package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //below one will create a container in spring.xml -> create a object as well
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj1 = (Alien) context.getBean("alien");
//        obj1.setAge(25);
        System.out.println(obj1.getAge());
        obj1.code();

//        Alien obj2 = (Alien) context.getBean("alien");
//        obj2.age=25;
//        System.out.println(obj2.age);
        //obj2.code();

    }
}

//scope in beans
//1. singleton
//2. prototype

// if you created object multiple time always it will call to one bean only

// singleton: create a object only one time
//prototype : it will create object multiple time