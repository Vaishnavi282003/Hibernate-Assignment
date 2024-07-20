package com.vai;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.vai.entities.Student;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        Configuration configuration = new Configuration();
        
        //You are collecting property values
        FileInputStream fis = new FileInputStream("src/main/resources/myconfig.properties");
        Properties prop = new Properties();
        prop.load(fis);
        configuration.setProperties(prop);
        
        configuration.addAnnotatedClass(Student.class);
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Transaction txn = session.beginTransaction();
        
        Student sob = new Student();
        sob.setRno(102);
        sob.setName("BBB");
        sob.setPer(80.0);
        
        session.save(sob);
        System.out.println("Record Saved Successfully!");
        txn.commit();
        
        session.close();
        sessionFactory.close();
    }
}
