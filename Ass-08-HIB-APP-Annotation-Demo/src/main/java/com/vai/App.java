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
    	        configuration.addAnnotatedClass(Student.class);
    	        
    	        SessionFactory sessionFactory = configuration.buildSessionFactory();
    	        
    	        Session session = sessionFactory.openSession();
    	        
    	        Transaction txn = session.beginTransaction();
    	        
    	        Student sob = new Student();
    	        sob.setRno(101);
    	        sob.setName("AAA");
    	        sob.setPer(70.0);
    	        
    	        session.save(sob);
    	        txn.commit();
    	        System.out.println("Record Saved Successfully !");
    	        
    	        session.close();
    	        sessionFactory.close();
    }
}
