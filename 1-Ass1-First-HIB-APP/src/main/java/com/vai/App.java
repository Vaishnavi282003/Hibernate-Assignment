package com.vai;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.vai.entities.Student;

class App 
{
    public static void main( String[] args )
    {
       Configuration configuration = new Configuration();
       configuration.configure();
       
       SessionFactory sessionFactory = configuration.buildSessionFactory();
       
       Session session = sessionFactory.openSession();
       
       Transaction txn = session.beginTransaction();
       
       Student sob = new Student();
       sob.setRno(101);
       sob.setName("Vai");
       sob.setPer(70);
       
       session.save(sob);
       txn.commit();
       
       session.close();
       sessionFactory.close();
       
       System.out.println("Hurrayyy!...I done My First Hibernate Application!");
     }
}
