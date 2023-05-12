package ConditionalStatementsPractice;

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 100");
        int userInput = Integer.valueOf(scanner.nextLine());
        if (userInput <= 59){
            System.out.println("Your grade is an F");
        } else if (userInput >= 60 && userInput <= 69) {
            System.out.println("Your grade is an D");
        } else if (userInput >= 70 && userInput <= 79) {
            System.out.println("Your grade is an C");
        } else if (userInput >= 80 && userInput <= 89) {
            System.out.println("Your grade is an B");
        } else if (userInput >= 90 && userInput <= 100) {
            System.out.println("Your grade is an A");
        }
    }
}
