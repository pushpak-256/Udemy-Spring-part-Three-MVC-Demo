package com.pushpak.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AlphabeticConstraintValidator implements ConstraintValidator<Alphabetic, String> {

	@Override
	public void initialize(Alphabetic constraintAnnotation) {
	}

	@Override
	public boolean isValid(String input, ConstraintValidatorContext arg1) {
		
		if (input!=null) 
		{
			boolean res=true;
				for (char c : input.toCharArray())
				{
					res= Character.isAlphabetic(c);
					if (res==false) {break;}
				}
			return res;
		}
		else return false;
	}

}
