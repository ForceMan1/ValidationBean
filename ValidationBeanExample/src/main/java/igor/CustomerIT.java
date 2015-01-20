package igor;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import javax.validation.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CustomerIT {
	private static ValidatorFactory factory;;
	private static Validator validator;
	
	@BeforeClass
	public static void init(){
		factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
		
	}
	
	@AfterClass
	public static void close(){
		factory.close();
	}
	
	@Test
	public void shouldRaiseNoConstraintViolation(){
		Customer customer = new Customer("John", "Smith", "john@gmail.com");
		Set<ConstraintViolation<Customer>> violations = validator.validate(customer);
		assertEquals(0, violations);
	}

}
