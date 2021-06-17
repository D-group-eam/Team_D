package com.seol.webpageHaleMaven.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.BeanWrapperImpl;

public class FieldMatchValidator implements ConstraintValidator<FieldMatch, Object> {

	private String firstFieldName;
	private String secondFieldName;
	private String message;
	
    //final 때문에 수정이 불가능
	@Override
	public void initialize(final FieldMatch constraintAnnotation)
	{
		 firstFieldName = constraintAnnotation.first();
		 secondFieldName = constraintAnnotation.second();
		 message = constraintAnnotation.message();
		 
	}
	@Override
	public boolean isValid(final Object value, ConstraintValidatorContext context) {
		boolean valid = true;
		try
		{
			 final Object firstObj = new BeanWrapperImpl(value).getPropertyValue(firstFieldName);
	         final Object secondObj = new BeanWrapperImpl(value).getPropertyValue(secondFieldName);

	         valid =  firstObj == null && secondObj == null || firstObj != null && firstObj.equals(secondObj);
			
		}catch(final Exception ignore) {
			
		}
		if(!valid) {
			 context.buildConstraintViolationWithTemplate(message)
             .addPropertyNode(firstFieldName)
             .addConstraintViolation()
             .disableDefaultConstraintViolation();
		}
		
		return valid;
	}

}
