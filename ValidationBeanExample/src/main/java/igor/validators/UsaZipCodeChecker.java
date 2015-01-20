package igor.validators;

import java.util.regex.Pattern;

public class UsaZipCodeChecker implements ZipCodeChecker{

	public boolean isZipCodeValid(String code) {
		Pattern pattern = Pattern.compile("");
		return pattern.matches("^$\\d{5}-\\d{4}$", code);
		
	}

}
