package igor.validators;

import java.lang.annotation.Annotation;
import java.util.regex.Pattern;

import javax.inject.Inject;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import igor.constraints.*;
import igor.qualifiers.USA;

public class ZipCodeValidator implements ConstraintValidator<ZipCode, String> {
	@Inject @USA
	private ZipCodeChecker zipCodeChecker; 
	public void initialize(ZipCode zipCode) {
	}

	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value == null)
			return true;
		
		return zipCodeChecker.isZipCodeValid(value);
	}

}
