package com.vai.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student 
{
	@Id
	@Column(name="RNO")
	private Integer rno;

	@Column(name="NAME")
	private String name;

	@Column(name="PER")
	private Double per;

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
