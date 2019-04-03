package com.luv2code.springdemo;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<Coursecode, String> {

	private String coursePrefix;
	
	public void initialize(Coursecode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}
	
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext context) {
		boolean result; 
		
		if (theCode != null) {
			result = theCode.startsWith(coursePrefix);
		} else {
			result = true;
		}
		
		return result;
	}

}
