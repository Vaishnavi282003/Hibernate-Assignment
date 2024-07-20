package com.vai;

import java.io.BufferedReader;
import java.io.FileReader;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.vai.entities.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration configuration = null;
    	SessionFactory sessionFactory = null;
    	Session session = null;
    	Transaction txn = null;
    	
    	FileReader fr = null;
    	BufferedReader br = null;
    	try
    	{
    		fr = new FileReader("E:\\Employee.csv");
    		br = new BufferedReader(fr);
    	   configuration = new Configuration();
     	   configuration.configure();
     	
     	   sessionFactory = configuration.buildSessionFactory();
     	
     	   session = sessionFactory.openSession();
     	
     	   txn = session.beginTransaction();
     	   
     	   while(true)
     	   {
     		   String line = br.readLine();
     		   if(line==null)
     		   {
     			   break;
     		   }
     		   String tok[] = line.split(",");
     		   Employee eob = new Employee();
       	       eob.setEno(Integer.parseInt(tok[0]));
       	       eob.setName(tok[1]);
       	       eob.setSalary(Double.parseDouble(tok[2]));
        	   session.save(eob);
        	   System.out.println(tok[0] + " is added !");
     	   }
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
    	System.out.println("Records are Added Successfully!");
   	}
}
