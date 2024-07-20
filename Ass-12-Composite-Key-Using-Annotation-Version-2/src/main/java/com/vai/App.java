package com.vai;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.vai.entities.Student;
import com.vai.entities.StudentCompositeKey;

public class App 
{
    public static void main( String[] args )
    {
       Configuration configuration = new Configuration();
       configuration.configure();
       
       SessionFactory sessionFactory = configuration.buildSessionFactory();
       
       Session session = sessionFactory.openSession();
       
       Transaction txn = session.beginTransaction();
        
       /* CODE TO ADD RECORD */
       
//       Student sob = new Student();
//       sob.setFname("Vaishnavi");
//       sob.setLname("Jadhav");
//       sob.setCity("Pune");
//       
//       session.save(sob);
       
       
       /* CODE TO DISPLAY RECORD */
     
       StudentCompositeKey ck = new StudentCompositeKey();
       ck.setFname("Vaishnavi");
       ck.setLname("Jadhav");
       
       Student sob =  (Student)session.get(Student.class, ck);
       System.out.println("CITY : " +sob.getCity());
       
       txn.commit();
       System.out.println("Record Saved Successfully !");
       
       session.close();
       sessionFactory.close();
    }
}
