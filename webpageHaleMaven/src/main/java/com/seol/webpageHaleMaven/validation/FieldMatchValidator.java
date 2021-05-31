package com.seol.webpageHaleMaven.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

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
	public boolean isValid(Object value, ConstraintValidatorContext context) {

		boolean valid = true;
		try
		{
			
		}catch(final Exception ignore) {
			
		}
		
		return false;
	}

}
