package com.vai.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account 
{
    @Id
    private Integer accno;
    
    private String accholdername;
    private String acctype;
    private Double Balance;
    
	public Integer getAccno() 
	{
		return accno;
	}
	public void setAccno(Integer accno)
	{
		this.accno = accno;
	}
	public String getAccholdername() 
	{
		return accholdername;
	}
	public void setAccholdername(String accholdername) 
	{
		this.accholdername = accholdername;
	}
	public String getAcctype() 
	{
		return acctype;
	}
	public void setAcctype(String acctype)
	{
		this.acctype = acctype;
	}
	public Double getBalance() 
	{
		return Balance;
	}
	public void setBalance(Double balance)
	{
		Balance = balance;
	}
}
