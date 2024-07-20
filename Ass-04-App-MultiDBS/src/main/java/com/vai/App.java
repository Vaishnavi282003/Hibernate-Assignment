package com.vai;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.vai.entities.Student;
import com.vai.entities.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration mconfiguration = new Configuration();
    	mconfiguration.configure("mysql.cfg.xml");
    	
    	Configuration pconfiguration = new Configuration();
    	pconfiguration.configure("postgres.cfg.xml");
    	
    	SessionFactory msessionFactory = mconfiguration.buildSessionFactory();
    	SessionFactory psessionFactory = pconfiguration.buildSessionFactory();

    	
    	Session msession = msessionFactory.openSession();
    	Session psession = psessionFactory.openSession();

    	
    	Transaction mtxn = msession.beginTransaction();
    	Transaction ptxn = psession.beginTransaction();

    	
    	Student sob = new Student();
    	sob.setRno(101);
    	sob.setName("AAA");
    	sob.setPer(80.0);
    	
    	Teacher tob = new Teacher();
    	tob.setTno(111);
    	tob.setName("PPP");
    	tob.setSalary(70000.0);
    	
    	msession.save(sob);
    	psession.save(sob);
    	
    	msession.save(tob);
    	psession.save(tob);

    	mtxn.commit();
    	ptxn.commit();

    	msession.close();
    	psession.close();
    	
    	msessionFactory.close();
    	psessionFactory.close();
    	
    	System.out.println("MultiDatabase with Multientityclass Done Successfully!");
    }
}
