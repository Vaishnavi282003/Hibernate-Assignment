package com.vai;

import java.lang.reflect.Field;

import com.vai.entities.Student;

public class App {

	public static void main(String[] args) 
	{
		try
		{
		   Student sob = new Student(101, "Vaishnavi", 70.00, 21);
		
           Class<Student> c = Student.class;
        
           Field fields[] = c.getDeclaredFields();
       
           System.out.println("~~~ Private Data Members's Info ~~~");
		   System.out.println("-----------------------------------------");
           for(Field f : fields)
           {
			  f.setAccessible(true);
			  System.out.println(f.get(sob));
           }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
