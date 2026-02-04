package org.rakesh;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {

        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));

        Student s1 = new Student();
        s1.setRollNo(103);
        s1.setsName("Galaxy");
        s1.setAge(33);

        Student s2= null;

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(Student.class);
        cfg.configure("hibernate.cfg.xml");


        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        //Transaction transaction = session.beginTransaction();
        //no need transaction need when do some update and all

        //session.persist(s1);

        s2 = session.find(Student.class, 101);


        //transaction.commit();
        session.close();
        sf.close();
        //System.out.println(s1);
        System.out.println(s1);


    }
}