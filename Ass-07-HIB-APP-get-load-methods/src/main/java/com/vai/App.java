package com.vai;

import org.hibernate.ObjectNotFoundException;
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
        
        int rid = 103;
        
        try
        {
            Student ob = (Student) session.load(Student.class, rid);
            System.out.println("Roll Number : " +ob.getRno());
            System.out.println("Name        : " +ob.getName());
            System.out.println("Percentage  : " +ob.getPer());
        }
        catch(ObjectNotFoundException oe)
        {
        	System.out.println("No Record Found for Roll Number : " + rid);

        }
        
/*        
        //Story of get()
        
        int rid = 103;
        
        Student ob = (Student) session.get(Student.class, rid);
        System.out.println(ob);
        
        if(ob==null)
        {
        	System.out.println("No Record Found for Roll Number : " + rid);
        }
        else
        {
           System.out.println("Roll Number : " +ob.getRno());
           System.out.println("Name        : " +ob.getName());
           System.out.println("Percentage  : " +ob.getPer());
        } 
 
*/          
        
        session.close();
        sessionFactory.close();
    }
}
