package igor.constraints;
import igor.validators.ZipCodeValidator;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

import javax.validation.Constraint;
import javax.validation.Payload;


@Constraint(validatedBy = ZipCodeValidator.class)
@Target({METHOD, FIELD, PARAMETER, CONSTRUCTOR, ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ZipCode {
	String message() default "{igor.ZipCode.message}";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
	
	@Target({METHOD, FIELD, PARAMETER, CONSTRUCTOR, ANNOTATION_TYPE})
	@Retention(RetentionPolicy.RUNTIME)
	public @interface List {
		ZipCode[] value();
	}
}
