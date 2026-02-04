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
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(Student.class);
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(s1);

        transaction.commit();
        session.close();
        sf.close();
        System.out.println(s1);


    }
}