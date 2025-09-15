package com.example.demo.Models;

public class Product {

	 private int id;
	    private String name;
	    private float price;
	    public Product (int id,String name,float price)
	    {
	    	this.id=id;
	    	this.name=name;
	    	this.price=price;
	    	
	    }
	    
	    public int getId()
	    {
	    	return id;
	    }
	    public String getName()
	    {
	    	return name;
	    }
	    public float getPrice()
	    {
	    	return price;
	    }
	    
	    public void setId(int id)
	    {
	    	this.id=id;
	    }
	    public void setName(String name)
	    {
	    	this.name=name;
	    }
	    public void setPricd(float price)
	    {
	    	this.price=price;
	    }
}
