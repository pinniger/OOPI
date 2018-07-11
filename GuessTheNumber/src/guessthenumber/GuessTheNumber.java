
/*
PP 5.4 
    1. Write a program that plays the Hi-Lo guessing game with numbers. 
    2. The program should pick a random number between 1 and 100 (inclusive), then repeatedly prompt the user to guess the number. 
    3. On each guess, report to the user that he or she is correct or that the guess is high or low. 
        Continue accepting guesses until the user guesses correctly or chooses to quit. 
    4. Use a sentinel value to determine whether the user wants to quit. 
    5. Count the number of guesses and report that value when the user guesses correctly. 
    6. At the end of each game (by quitting or a correct guess), prompt to determine whether the user wants to play again. 
    7. Continue playing games until the user chooses to stop.
 */
package guessthenumber;
import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

    public static void main(String[] args) {
        // TODO code application logic here
        int input, numberOfTries, secretNumber;
        Scanner scan = new Scanner(System.in);
        Random randomNumber = new Random();
        Integer ageObj = new Integer(40);
        ageObj++;
        
        while (true) {
            System.out.print("Enter an integer from 1-100 (0 to quit): ");
            input = scan.nextInt();                    
            numberOfTries = 0;            
            secretNumber = randomNumber.nextInt(100);
            
            while (input != 0) {
                numberOfTries++;
                if (input < 1 || input > 100) {
                    System.out.println("INVALID INPUT: Enter an integer from 1-100 (0 to quit):");
                } else if (input == secretNumber) {
                    System.out.println("Great job, you guessed the secret number in " + numberOfTries + " tries! ");
                    break;
                } else if (input > secretNumber) {
                    System.out.println("Your guess is too high, the secret number is lower. ");
                } else if (input < secretNumber) {
                    System.out.println("Your guess is too low, the secret number is higher. ");
                }

                System.out.print("Guess again (0 to quit): ");
                input = scan.nextInt();
            }
            System.out.println("Do you want to play again? (1:Yes/2:No)");
            if(scan.nextInt() != 1) break;
        }
    }
}
