package com.vai.entities;

public class Student 
{
    private Integer rno;
    private String name;
    private Double per;
    
    public Student()
    {
    	rno=null;
    	name=null;
    	per=null;
    }
    
	public Student(Integer rno, String name, Double per) {
		super();
		this.rno = rno;
		this.name = name;
		this.per = per;
	}

	public Integer getRno()
	{
		return rno;
	}
	public void setRno(Integer rno)
	{
		this.rno = rno;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Double getPer() 
	{
		return per;
	}
	public void setPer(Double per) 
	{
		this.per = per;
	}
	
	public void display()
	{
		System.out.println("Student Information");
		System.out.println("-------------------");
	    System.out.println("RNO : " + rno);
	    System.out.println("NAME : " + name);
	    System.out.println("PER : " + per);
	}
}
