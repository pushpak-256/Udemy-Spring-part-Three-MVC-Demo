package com.pushpak.springdemo.mvc.Entities.pojo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

	private String firstName;
	
	@NotNull(message=" is required")
	@Size(min=4, message="Minumum length should be 4 ")
	private String lastName;

	@Min(value=0, message="must be greater than or equal to 0")
	@Max(value=10,message="can get 10 pass max")
	private int freePasses;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}

	
}
