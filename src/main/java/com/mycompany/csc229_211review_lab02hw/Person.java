package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
public abstract class Person {
	//protected variables to give access to child class
	protected String name;
	protected String address; 
	protected short age;
	
	// constructor that takes only two paras
	public Person(String name, short age) {
		super();
		this.name = name;
		this.age = age;
	}
	
        //get and set methods for name
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract String getAddress() ;
	
	public abstract void setAddress(String address);
	
	
	public short getAge() {
		return age;
	}
	
	public void setAge(short age) {
		this.age = age;
	}
	
}
