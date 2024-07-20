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
    	        
    	        Transaction txn = session.beginTransaction();
    	        
    	        Student sob = new Student();
    	        sob.setRno(102);
    	        sob.setName("BBB");
    	        sob.setPer(80.0);
    	        
    	        session.save(sob);
    	        txn.commit();
    	        System.out.println("Record Saved Successfully !");
    	        
    	        session.close();
    	        sessionFactory.close();
    }
}
