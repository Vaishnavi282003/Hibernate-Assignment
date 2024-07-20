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
    	
    	        Configuration configuration = new Configuration();
    	        configuration.configure();
    	        
    	        SessionFactory sessionFactory = configuration.buildSessionFactory();
    	        
    	        Session session = null;
    	        Transaction txn =  null;
    	        
    	        try
    	        {
    	             session = sessionFactory.openSession();
    	             txn = session.beginTransaction();
    	        
    	             Student sob = new Student();
    	             sob.setRno(101);
    	             sob.setName("AAA");
    	             sob.setPer(70.0);
    	        
    	             session.save(sob);
    	             txn.commit();
    	             System.out.println("Record Saved Successfully !");
    	        }
    	        catch(Exception e)
    	        {
    	        	 txn.rollback();
    	        	 System.out.println("Unable to Save Record!");
    	        }
    	        finally
    	        {
    	             session.close();
    	        }    
    	             sessionFactory.close();     
    }
}
