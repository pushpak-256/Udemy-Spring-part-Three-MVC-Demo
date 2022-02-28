package com.pushpak.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{

	//in our case we will pass value=LUV 
	// so LUV is prefix   @CourseCode(value="LUV",message="should start with LUV")
	private String prefix;
	
	@Override
	public void initialize(CourseCode constraintAnnotation) {
		this.prefix=constraintAnnotation.value();
	}

	//arg0 is actual value entered by user on form
	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		
		if(arg0!=null)
		return arg0.startsWith(prefix);
		
		// if its empty @NotNull will executed
		else return true;
	}

}
