package com.luv2code.springdemo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	
	@Coursecode(value="FCO", message="must start with FCO")
	private String firstName;
	
	@Pattern(regexp="[a-zA-Z]+", message="Use only characters")
	@NotNull(message="This field is required")
	@Size(min=1)
	private String lastName;
	
	@NotNull(message="This field is required")
	@Min(value=1, message="This fiel must be grater than or equal to 1")
	@Max(value=10, message="This fiel must be less than or equal to 10")
	private Integer freePasses;
	
	@Pattern(regexp="[a-zA-Z0-9]{5}", message="Only 5 characters/digits")
	private String zipCode;

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

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
	
	

}
