package com.vai;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vai.entities.Student;

public class App 
{
    public static void main( String[] args )
    {  
    	Configuration configuration = null;
    	SessionFactory  sessionFactory = null;
    	Session session = null;
    	Transaction txn = null;
    	
    	try
    	{
           configuration = new Configuration();
           configuration.configure();
        
           sessionFactory = configuration.buildSessionFactory();
        
           session = sessionFactory.openSession();
        
           txn = session.beginTransaction();
           
           Student s = new Student();
           s.setRno(101);
           s.setName("AAA");
           s.setPer(70.0);
           session.save(s);
           txn.commit();
    	}  
    	catch(Exception e)
    	{
    		e.printStackTrace();
    		txn.rollback();
    	}
    	finally
    	{
    		session.close();
    		sessionFactory.close();
    	}        
    }
}
