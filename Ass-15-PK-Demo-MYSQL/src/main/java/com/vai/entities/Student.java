package com.vai.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name= "student")
public class Student 
{
	@Id
	@TableGenerator(name="tg", table="mytab", pkColumnName="myid", pkColumnValue="200", valueColumnName="next_hi",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.TABLE, generator="tg")
	private Integer rno;
/*	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer rno;
*/
/*	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer rno;
*/
	
	@Column(name= "name")
	private String name;
	
	@Column(name= "per")
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
