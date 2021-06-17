package com.seol.webpageHaleMaven.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.seol.webpageHaleMaven.validation.PasswordMatchValidator;

@Constraint(validatedBy = PasswordMatchValidator.class)
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE   })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PasswordMatch {
	String message() default "";
	Class<?>[] groups() default {};
	
Class<? extends Payload>[] payload() default {};
	
	String first();
    String second();
    
	
    @Target({ ElementType.TYPE, ElementType.ANNOTATION_TYPE })
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List
    {
    	PasswordMatch[] value();
    }
}
