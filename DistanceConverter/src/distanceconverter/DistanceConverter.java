/*
PP 2.6 Write a program that converts miles to kilometers. 
(One mile equals 1.60935 kilometers.) 
Read the miles value from the user as a floating point value.
 */
package distanceconverter;
import java.util.Scanner;
public class DistanceConverter {
    public static void main(String[] args) {
        float miles;
        float kilometers;
        float conversion = 1.60935F;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter miles");
        
        miles = scan.nextFloat();        
        kilometers = miles * conversion;
        
        System.out.println(miles + " converts to " + kilometers + " kilometers");        
    }    
}
