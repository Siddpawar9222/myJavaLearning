package G_OOPS1;

import java.util.Locale;
import java.util.ResourceBundle;


public class Internationalization {
      public static void main(String[] args) {
            // Create Locale objects
    
        Locale usLocale = new Locale("en", "US"); // English, United States
        Locale frLocale = new Locale("fr", "FR"); // French, France

        // Get default locale
        Locale defaultLocale = Locale.getDefault();

        // Display locale information
        System.out.println("Default Locale: " + defaultLocale);
        System.out.println("US Locale: " + usLocale);
        System.out.println("French Locale: " + frLocale);

        // Using Locale for formatting
        double number = 12345.6789;
        System.out.println("Formatted in Default Locale: " + number);
        System.out.println("Formatted in US Locale: " + String.format(usLocale, "%,.2f", number));
        System.out.println("Formatted in French Locale: " + String.format(frLocale, "%,.2f", number));

      }
}
