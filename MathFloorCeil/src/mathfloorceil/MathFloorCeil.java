
package mathfloorceil;
import java.util.Scanner;

public class MathFloorCeil {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: "); 
        float input = scan.nextFloat();
        double startNumber = (double)input;
        double lessWholeNumber = Math.floor(startNumber);
        double greaterWholeNumber = Math.ceil(startNumber);
        System.out.println(lessWholeNumber + " is the smaller number and the larger number is " + greaterWholeNumber);
    }
}
