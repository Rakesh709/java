package org.rakesh;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

    Student s1 = new Student();

    s1.setsName("Rakesh");
    s1.setRollNo(101);
    s1.setAge(25);

    Configuration cfg = new Configuration();
    cfg.configure();

    SessionFactory sf = cfg.buildSessionFactory();
    Session session = sf.openSession();

        session.beginTransaction();
        session.persist(s1);
        session.getTransaction().commit();


        System.out.println("Saved: " + s1);

        session.close();
        sf.close();
    System.out.println(s1);


    }
}