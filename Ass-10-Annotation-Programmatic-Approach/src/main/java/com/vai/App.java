package com.vai;

import java.io.IOException;

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
        
        //Using Programmatic Approach to set Properties in Configuration Object
        configuration.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
        configuration.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/hbdb");
        configuration.setProperty("hibernate.connection.user", "root");
        configuration.setProperty("hibernate.connection.password", "vaishu");
        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
        configuration.setProperty("hibernate.show_sql", "true");
        configuration.setProperty("hibernate.hbm2ddl.auto", "create");
        
        configuration.addAnnotatedClass(Student.class);
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Transaction txn = session.beginTransaction();
        
        Student sob = new Student();
        sob.setRno(103);
        sob.setName("CCC");
        sob.setPer(90.0);
        
        session.save(sob);
        System.out.println("Record Saved Successfully!");
        txn.commit();
        
        session.close();
        sessionFactory.close();
    }
}
