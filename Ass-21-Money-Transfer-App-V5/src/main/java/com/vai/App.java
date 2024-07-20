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
    	        
    	        Session session = null;
    	        Transaction txn =  null;
    	        
    	        Integer senderAccNo = 101;
    	        Integer receiverAccNo =102;
    	        Double amount = 5000.0;
    	        	        
    	        try
    	        {
    	            session = sessionFactory.openSession();
    	            
    	            Account sob = session.get(Account.class, senderAccNo);
    	            
    	            if(sob==null)
    	            {
    	            	System.out.println("Invalid Senders Account Number : " +senderAccNo);
    	            	return;
    	            }
    	            
    	            if(amount >= sob.getBalance())
    	            {
    	            	System.out.println("Insufficient Balance in Senders Account Number! : " +senderAccNo);
    	            	return;
    	            }
    	            
    	            sob.setBalance(sob.getBalance() - amount);
    	            
    	            
    	            
    	            Account rob = session.get(Account.class, receiverAccNo);
    	            
    	            if(rob==null)
    	            {
    	            	System.out.println("Invalid Senders Account Number : " +receiverAccNo);
    	            	return;
    	            }
    	            
    	            rob.setBalance(rob.getBalance() + amount);
    	            
    	            txn = session.beginTransaction();
    	            session.update(sob);
    	            session.update(rob);
    	        
    	            txn.commit(); 
    	            System.out.println("Money Transfer Successful!");
    	        }
    	        catch(Exception e)
    	        {
    	        	txn.rollback();
    	        	System.out.println("Money Transfer Failed!");
    	        	e.printStackTrace();
    	        }
    	        finally
    	        {
    	             session.close();
    	             sessionFactory.close();
    	        }       
    }
}
