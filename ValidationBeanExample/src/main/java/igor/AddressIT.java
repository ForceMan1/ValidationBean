package igor;

import static org.junit.Assert.*;

import java.util.Set;

import javax.validation.*;

import org.junit.Test;

public class AddressIT {
	@Test
	public void shouldRaiseConstraintViolationCauseInvalidZipCode(){
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Address address = new Address("233 Spring Street", "New York", "NY", "DummyZip", 
										"USA");
		Set<ConstraintViolation<Address>> violations = validator.validate(address);
		
		assertEquals(1, violations.size());
		validatorFactory.close();
		System.out.println(violations.size());
	}

}
