package com.vai.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
	Integer rno;
	String name;
	Double per;
	
/*	
	@Column(name="rno")
	Integer rno;
	
	@Column(nullable=false, length=50, unique=true)
	String name;
	
	@Column(nullable=false)
	Double per;
	
	@Transient
	private Integer age;

	
	public Integer getAge() 
	{
		return age;
	}
	public void setAge(Integer age)
	{
		this.age = age;
	}
*/	
	
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
}
