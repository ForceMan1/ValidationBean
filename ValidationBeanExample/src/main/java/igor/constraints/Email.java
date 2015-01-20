package igor.constraints;
import java.lang.annotation.ElementType;

import javax.validation.Constraint;
import javax.validation.*;
import javax.validation.constraints.*;

import java.lang.annotation.*;

@Size(min=7)
@Pattern(regexp = "[a-zA-Z0-9_-]+(?:(\\.[a-zA-Z])*)?@[a-zA-Z_-]+(\\.[a-zA-Z_-])+")
@ReportAsSingleViolation
@Constraint(validatedBy = {} )
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, 
	ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface Email {
	String message() default "{igor.Email.message}";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};  
	
	@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, 
		ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR})
	@Retention(RetentionPolicy.RUNTIME)
	public @interface List {
		Email[] value();
	}

}
