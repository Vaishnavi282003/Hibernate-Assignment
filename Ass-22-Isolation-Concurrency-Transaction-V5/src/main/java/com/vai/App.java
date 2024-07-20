package com.vai;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vai.entities.Account;

public class App 
{
    public static void main( String[] args )
    {
    	
    	        Configuration configuration = new Configuration();
    	        configuration.configure();
    	        
    	        SessionFactory sessionFactory = configuration.buildSessionFactory();
    	        
    	        Session session1 = null;
    	        Transaction txn1 =  null;
    	        
    	        Session session2 = null;
    	        Transaction txn2 =  null;
    	        	        
    	        try
    	        {
    	        	session1 = sessionFactory.openSession();
    	        	txn1 = session1.beginTransaction();
    	        	Account a1 = session1.get(Account.class, 101);
    	        	a1.setBalance(a1.getBalance() + 15);
    	        	
    	        	session2 = sessionFactory.openSession();
    	        	txn2 = session2.beginTransaction();  	        	
    	        	Account a2 = session2.get(Account.class, 101);
    	        	a2.setBalance(a2.getBalance() - 25);
    	        	
    	        	session1.update(a1);
    	        	session2.update(a2);
    	        	
    	        	txn2.commit();
    	        	txn1.commit();
    	            
    	            System.out.println("Successful!");
    	        }
    	        catch(Exception e)
    	        {
    	        	txn1.rollback();
    	        	txn2.rollback();
    	        	System.out.println("Failed!");
    	        	e.printStackTrace();
    	        }
    	        finally
    	        {
    	             session1.close();
    	             session2.close();
    	             sessionFactory.close();
    	        }       
    }
}
