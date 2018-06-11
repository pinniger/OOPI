/*
* PP 2.5 Create a version of the TempConverter 
* application to convert from Fahrenheit to Celsius. 
* Read the Fahrenheit temperature from the user.
 */
package tempconverterdegrees;

import java.util.Scanner;

public class TempConverter {

    public static void main(String[] args) {
        final int BASE = 32;
        final double CONVERSION_FACTOR = 5.0 / 9.0;
        double fahrenheitTemp;
        double celsiusTemp;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter degrees in Fahrenheit");
        
        fahrenheitTemp = scan.nextDouble();
        celsiusTemp = (fahrenheitTemp - BASE)*(CONVERSION_FACTOR);
        System.out.println("Celsius Temperature: " + celsiusTemp);
        System.out.println("Fahrenheit Equivalent: " + fahrenheitTemp);
    }

}
}
