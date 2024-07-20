package com.vai;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.vai.entities.Student;

public class App 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to TCA !");
		System.out.println("===================");
        
	  /*
		Student ob = new Student(101,"VAI",80.00);
		ob.display();
	  */
	
	    Class<Student> c = Student.class;
	    System.out.println("");
	    System.out.println("PARENT CLASS : " + c.getSuperclass());
	 
		Field fields[] = c.getDeclaredFields(); // f : rno name per
		System.out.println("\n----- Fields in Student Class -----");
		for(Field f : fields)
		{
			System.out.println(f);
		}
		
		Method[] methods = c.getDeclaredMethods();
		System.out.println("\n----- Methods in Student Class -----");
        for(Method m : methods)
        {
        	System.out.println(m);
        }
        
        Constructor<?>[] constructors = c.getDeclaredConstructors();
		System.out.println("\n----- Constructors in Student Class -----");
        for(Constructor<?> con : constructors)
        {
        	System.out.println(con);
        }
	}
}
