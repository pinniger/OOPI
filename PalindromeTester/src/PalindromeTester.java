
/*
 * Clair Inniger
 * PP 12.1 (page 569)
 * 07/24/2018
 */

import java.util.Scanner;

public class PalindromeTester {

    public static void main(String[] args) {
        String str, another = "y";

        Scanner scan = new Scanner(System.in);

        while (another.equalsIgnoreCase("y"))
        {
            System.out.println("Enter a potential palindrome:");
            str = scan.nextLine();
            System.out.println();

            if (isPalindrome(str)) {
                System.out.println("That string IS a palindrome.");
            } else {
                System.out.println("That string is NOT a palindrome.");
            }

            System.out.println();
            System.out.print("Test another palindrome (y/n)? ");
            another = scan.nextLine();
        }
    }

    public static boolean isPalindrome(String text) {
        if (text.length() == 0 || text.length() == 1)
        {
            return true;
        }
        
        char firstChar = text.charAt(0);
        char lastChar = text.charAt(text.length() - 1);
        if (firstChar == lastChar)
        {
            return isPalindrome(text.substring(1, text.length() - 1));
        }
        return false;
    }
}
