package PracticingLoops;

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number: ");
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput > 0) {
                System.out.println("Number is " + userInput);
            } else if (userInput < 0) {
                System.out.println("Number must be a positive number");
            } else if (userInput == 0) {
                break;
            }
        }
    }
}