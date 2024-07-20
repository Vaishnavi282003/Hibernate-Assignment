package com.vai;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
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
    	        
    	        Session session = sessionFactory.openSession();
    	        
    	        Transaction txn = session.beginTransaction();

/*    	        
    	        Query query = session.createQuery("from Student");
    	        List<Student> list = query.list();
    	        
    	        for(Student s : list)
    	        {
    	        	System.out.println(s.getRno() + " " + s.getName() + " " + s.getPer() + " " + s.getCity());
    	        }
*/
    	        
/*    	        
    	        Query query = session.createQuery("select rno,name,per,city from Student");
    	        List<Object[]> list = query.list();
    	        
    	        for(Object[] arrob : list)
    	        {
    	        	for(Object data : arrob)
    	        	{
    	        		System.out.print(data.toString() + " ");
    	        	}
    	        	System.out.println(); 	        	
    	        }
*/    	   
    	        
 /*   	        
                //ORDER BY
    	        Query query = session.createQuery("select rno,name,per,city from Student order by per desc");
    	        List<Object[]> list = query.list();
    	        
    	        for(Object[] arrob : list)
    	        {
    	        	for(Object data : arrob)
    	        	{
    	        		System.out.print(data.toString() + " ");
    	        	}
    	        	System.out.println(); 	        	
    	        }
*/  	  
    	        
/*    	        
    	        //WHERE
    	        Query query = session.createQuery("select rno,name,per,city from Student where per >= 70");
    	        List<Object[]> list = query.list();
    	        
    	        for(Object[] arrob : list)
    	        {
    	        	for(Object data : arrob)
    	        	{
    	        		System.out.print(data.toString() + " ");
    	        	}
    	        	System.out.println(); 	        	
    	        }
*/ 
    	        
/*
    	        //GROUP BY & HAVING
    	        Query query = session.createQuery("select city,count(*) from Student group by city having count(*) >=2");
    	        List<Object[]> list = query.list();
    	        
    	        for(Object[] arrob : list)
    	        {
    	        	for(Object data : arrob)
    	        	{
    	        		System.out.print(data.toString() + " ");
    	        	}
    	        	System.out.println(); 	        	
    	        }
*/
    	        //AGGREGATE FUNCTIONS
    	        
/*
                //COUNT
    	        Query query = session.createQuery("select count(*) from Student");
    	        List<Long> list = query.list();
    	        
    	        System.out.println("Number of Records : " + list.get(0));
*/ 
 
/*   	        
    	        //MAX
    	        Query query = session.createQuery("select max(per) from Student");
    	        List<Long> list = query.list();
    	        
    	        System.out.println("Maximum Percentage : " + list.get(0));
*/
 
/*    	        
    	        //MIN
    	        Query query = session.createQuery("select min(per) from Student");
    	        List<Long> list = query.list();
    	        
    	        System.out.println("Minimum Percentage : " + list.get(0));
*/
    	        
/*    	           	        
    	        //SUM
    	        Query query = session.createQuery("select sum(per) from Student");
    	        List<Long> list = query.list();
    	        
    	        System.out.println("Total Percentage : " + list.get(0));
*/
    	        
/*    	            
    	        //AVG
    	        Query query = session.createQuery("select avg(per) from Student");
    	        List<Long> list = query.list();
    	        
    	        System.out.println("Average Percentage : " + list.get(0));
*/    	        
    	        //ARITHMETIC OPERATOR
/*    	        
    	        //ADDITION
    	        Query query = session.createQuery("select per+2 from Student");
    	        List<Double> list = query.list();
    	        
    	        for(Double data : list)
    	        {
    	           System.out.println(data);
    	        }   
*/
    	        //LOGICAL OPERATOR
/*
    	        //AND OR
    	        Query query = session.createQuery("select rno, name, per, city from Student where per>=70 AND per<=80");
    	        List<Object[]> list = query.list();
    	        
    	        for(Object[] arrob : list)
    	        {
    	        	for(Object data : arrob)
    	        	{
    	        		System.out.print(data.toString() + " ");
    	        	}
    	        	System.out.println(); 	        	
    	        }
*/ 
    	        
/*    	        
    	        //BETWEEN
    	        Query query = session.createQuery("select rno, name, per, city from Student where per BETWEEN 70 AND 80");
    	        List<Object[]> list = query.list();
    	        
    	        for(Object[] arrob : list)
    	        {
    	        	for(Object data : arrob)
    	        	{
    	        		System.out.print(data.toString() + " ");
    	        	}
    	        	System.out.println(); 	        	
    	        }
*/    	        
    	       
/*    	        
    	        Query query = session.createQuery("select rno, lower(name), per, lower(city) from Student where per>=70 AND per<=80");
    	        List<Object[]> list = query.list();
    	        
    	        for(Object[] arrob : list)
    	        {
    	        	for(Object data : arrob)
    	        	{
    	        		System.out.print(data.toString() + " ");
    	        	}
    	        	System.out.println(); 	        	
    	        }
*/    	
    	        
/*    	        
    	        //LIKE,NOT LIKE,%,_
    	        Query query = session.createQuery("select rno, name, per, city from Student where city LIKE 'P%' ");
    	        List<Object[]> list = query.list();
    	        
    	        for(Object[] arrob : list)
    	        {
    	        	for(Object data : arrob)
    	        	{
    	        		System.out.print(data.toString() + " ");
    	        	}
    	        	System.out.println(); 	        	
    	        }
*/
    	        
/*    	        
    	        //IS NOT NULL,IS NULL
    	        Query query = session.createQuery("select rno, name, per, city from Student where name IS NOT NULL");
    	        List<Object[]> list = query.list();
    	        
    	        for(Object[] arrob : list)
    	        {
    	        	for(Object data : arrob)
    	        	{
    	        		System.out.print(data.toString() + " ");
    	        	}
    	        	System.out.println(); 	        	
    	        }
*/
    	        
/*   	        
    	        //SUBQUERY
    	        Query query = session.createQuery("select rno, name, per, city from Student where per = (select max(per) from Student)");
    	        List<Object[]> list = query.list();
    	        
    	        for(Object[] arrob : list)
    	        {
    	        	for(Object data : arrob)
    	        	{
    	        		System.out.print(data.toString() + " ");
    	        	}
    	        	System.out.println(); 	        	
    	        }
*/
    	        
/*    	        
    	        //Positional Parameters - To provide Dynamic Values in HQL
    	        Query query = session.createQuery("select rno, name, per, city from Student where per>=? AND per<=?");
    	        query.setParameter(0, 70.0); 
    	        query.setParameter(1, 80.0);
    	        List<Object[]> list = query.list();
    	        
    	        for(Object[] arrob : list)
    	        {
    	        	for(Object data : arrob)
    	        	{
    	        		System.out.print(data.toString() + " ");
    	        	}
    	        	System.out.println(); 	        	
    	        }
*/
    	        
/*    	        
    	      //Named Parameters - To provide Dynamic Values in HQL
    	        Query query = session.createQuery("select rno, name, per, city from Student where per>=:vai AND per<=:tca");
    	        query.setParameter("vai", 70.0); 
    	        query.setParameter("tca", 80.0);
    	        List<Object[]> list = query.list();
    	        
    	        for(Object[] arrob : list)
    	        {
    	        	for(Object data : arrob)
    	        	{
    	        		System.out.print(data.toString() + " ");
    	        	}
    	        	System.out.println(); 	        	
    	        }
*/
    	        
/*    	        
    	        //UPDATE
    	        Query query = session.createQuery("update Student set per = per+2 where city = 'PUNE'");
    	        int rowCount = query.executeUpdate();
    	        System.out.println("No. of Records Affected : " + rowCount);
*/
    	        
/*    	        
    	        //DELETE
    	        Query query = session.createQuery("delete from Student where city = 'PUNE'");
    	        int rowCount = query.executeUpdate();
    	        System.out.println("No. of Records Affected : " + rowCount);
*/
    	        //Pagination
    	        //PAGINATION using setMaxResults(3), setFirstResult(i)
    	        Scanner sc = new Scanner(System.in);
    	        
    	        Query query = session.createQuery("select rno, name, per, city from Student");
    	        query.setMaxResults(3);
    	        
    	        for(int i=0; i<8; i=i+3)
    	        {
    	           query.setFirstResult(i);
    	           
    	           List<Object[]> list = query.list();
    	        
    	           for(Object[] arrob : list)
    	           {
    	        	  for(Object data : arrob)
    	        	  {
    	        		 System.out.print(data.toString() + " ");
    	        	  }
    	        	  System.out.println(); 	        	
    	           }
    	           System.out.println("Press any key to Continue...");
    	           sc.next();
    	        }
    	        
    	        txn.commit();
    	        session.close();
    	        System.out.println("Done!");
    	        sessionFactory.close();
    }
}
