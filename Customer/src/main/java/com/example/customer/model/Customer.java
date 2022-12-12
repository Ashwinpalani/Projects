package com.example.customer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
//@NamedStoredProcedureQueries({
//	@NamedStoredProcedureQuery(name = "getAllEmployees",
//			procedureName = "get_Customer",
//			resultClasses = Customer.class)
//})
public class Customer {

	@Id
	private int cust_id;

	//@Column(name = "cust_name")
	private String cust_name;

	//@Column(name = "country")
	private String country;

	public Customer() {
	}

	public Customer(int cust_id, String cust_name, String country) {
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.country = country;
	}

	public int getCustNo() {
		return cust_id;
	}

	public void setCustNo(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCustName() {
		return cust_name;
	}

	public void setCustName(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getcountry() {
		return country;
	}

	public void setcountry(String country) {
		this.country = country;
	}
	
	public String toString()
	{
		return ""+ cust_id +","+cust_name+","+country;
		
	}
}
