package com.seol.webpageHaleMaven.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.BeanWrapperImpl;

public class PasswordMatchValidator implements ConstraintValidator<PasswordMatch, Object>{
	private String firstPassword;
	private String secondPassword;
	private String message;
	
	@Override
	public void initialize(final PasswordMatch constraintAnnotation)
	{
		firstPassword = constraintAnnotation.first();
		secondPassword = constraintAnnotation.second();
		message = constraintAnnotation.message();
		
	}
	@Override 
	public boolean isValid(final Object value, ConstraintValidatorContext context) {
		
		boolean valid = true;
		try {
			final Object firstPas = new BeanWrapperImpl(value).getPropertyValue(firstPassword);
			final Object secondPas = new BeanWrapperImpl(value).getPropertyValue(secondPassword);
			
			valid = firstPas == null && secondPas == null || firstPas != null && firstPas.equals(secondPas);
			
		}catch(Exception ignore) {
			
			
		}
		if(!valid)
		{
			context.buildConstraintViolationWithTemplate(message)
			.addPropertyNode(firstPassword)
			.addConstraintViolation()
			.disableDefaultConstraintViolation();
		}
		return valid;
	}

}
