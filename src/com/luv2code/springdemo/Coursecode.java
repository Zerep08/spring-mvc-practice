package com.luv2code.springdemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Coursecode {

	//Define default value
	public String value() default "LUV";
	//Define default message
	public String message() default "must start with LUV";
	//Define default groups
	public Class<?>[]groups()default {};
	//Define default payloads
	public Class<? extends Payload>[]payload()default {};
	
	
	
}
