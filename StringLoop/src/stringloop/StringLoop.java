/*
PP 6.2 Write a program that reads a string from the user and prints it one character per line.
 */
package stringloop;
import java.util.Scanner;

public class StringLoop {

    public static void main(String[] args) {        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scan.next();
        char[] arrStr = input.toCharArray();
        for (int i = 0; i < arrStr.length; i++) {
            System.out.println(arrStr[i]);
        }                
    }    
}
