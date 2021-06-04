package com.seol.webpageHaleMaven.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.seol.webpageHaleMaven.validation.FieldMatchValidator;

@Constraint(validatedBy = FieldMatchValidator.class)
//유효성 검사 로직은 FieldMatchValidator로 한다.
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE   })
//타겟의 기능은 어노테이션을 붙일 수 있는 대상을 지정하는 것이다.
//type 은 클래스, 인터페이스, 열거타임에 어노테이션을 붙일 수 있다는 뜻이고
//어노테이션 타입 선언 시에 어노테이션을 붙일 수 있다는 뜻이다.
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FieldMatch {
	String message() default "";
	Class<?>[] groups() default {};
//페이로드 : 보안레벨, 에러 코드 등 유효성 실패에 따른 세부사항 제공
	Class<? extends Payload>[] payload() default {};
	
	String first();
    String second();
    
	
    @Target({ ElementType.TYPE, ElementType.ANNOTATION_TYPE })
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List
    {
    	FieldMatch[] value();
    }

}
