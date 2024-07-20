package com.vai.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student 
{
	@Id
	@Column
	Integer rno;
	
	@Column
	String name;
	
	@Column
	Double per;
	
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
