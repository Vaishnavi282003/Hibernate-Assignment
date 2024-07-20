package com.vai;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.vai.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
/*    	
    	        Configuration configuration = new Configuration();
    	        configuration.configure();
    	        
    	        SessionFactory sessionFactory = configuration.buildSessionFactory();
    	        
    	        //buildSessionFactory() method is deprecated in Hibernate-Version 4.X.X.
*/    	        
    	        Configuration configuration = new Configuration();
    	        configuration.configure();
    	        
    	        Properties prop = configuration.getProperties();
    	        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
    	        
    	        builder.applySettings(prop);
    	        StandardServiceRegistry registry = builder.build();
    	        
    	        SessionFactory sessionFactory = configuration.buildSessionFactory(registry);
    	        
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
