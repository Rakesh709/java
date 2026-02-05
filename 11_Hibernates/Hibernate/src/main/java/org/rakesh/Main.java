package org.rakesh;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {

        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
//
//        Student s1 = new Student();
////        s1.setRollNo(106);
////        s1.setsName("avng");
////        s1.setAge(40);
//
//        //Student s2= null;
//
//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(Student.class);
//        cfg.configure("hibernate.cfg.xml");
//
//
//        SessionFactory sf = cfg.buildSessionFactory();
//        Session session = sf.openSession();
//
//        //delete
//        s1 = session.find(Student.class, 106);
//
//        Transaction transaction = session.beginTransaction();
//        //no need transaction need when do some update and all
//
//        //session.persist(s1);
//
//        //s2 = session.find(Student.class, 101);
//
//        //to update
//        //session.merge(s1);
//
//        //to delete
//        session.remove(s1);
//
//        transaction.commit();
//        session.close();
//        sf.close();
//        //System.out.println(s1);
//        System.out.println(s1);



        //second table

        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Rakesh");
        a1.setTech("Java");


        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Alien.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(a1);

        transaction.commit();
        session.close();
        sf.close();
        System.out.println(a1);
        System.out.println(a1);

    }
}