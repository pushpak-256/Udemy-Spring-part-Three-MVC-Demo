package com.pushpak.springdemo.mvc.Entities.pojo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {

	
	private String firstName;
	
	@NotNull(message=" is required")
	@Size(min=4, message="Minumum length should be 4 ")
	private String lastName;

	@NotNull(message="is required")
	@Min(value=0, message="must be greater than or equal to 0")
	@Max(value=10,message="can get 10 pass max")
	private Integer freePasses;
	
	//regex for Indian PinCode.
	@Pattern(regexp="^[1-9][0-9]{5}$",message="Enter Valid PIN-CODE")
	private String pinCode;
	
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


	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	

	
}
