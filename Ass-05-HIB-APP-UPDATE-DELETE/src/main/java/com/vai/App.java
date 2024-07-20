package com.vai;

import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.vai.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
       Configuration configuration = new Configuration();
       configuration.configure();
       
       SessionFactory sessionFactory = configuration.buildSessionFactory();
       
       Session session = sessionFactory.openSession();
       
       Transaction transaction = session.beginTransaction();
       
       Student student = new Student(); 
       student.setRno(102);
       
       session.delete(student);
       
       transaction.commit();
       session.close();
       sessionFactory.close();
    }
}
