package E_Strings.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example03 {

	public static void main(String[] args) {
		String cardNumber = "1234-2222-3333-4343";
		// "xxxx-xxxx-xxxx-4343"

		Pattern pattern = Pattern.compile("^\\d{4}-\\d{4}-\\d{4}-");
		Matcher matcher = pattern.matcher(cardNumber);
		String maskedCardNumber = matcher.replaceAll("xxxx-xxxx-xxxx-");
		System.out.println(maskedCardNumber);

	}

}
