package ConditionalStatementsPractice;

import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String userInput = scanner.nextLine();
        userInput = userInput.toUpperCase();
        System.out.println("Enter another word:");
        String secondUserInput = scanner.nextLine();
        secondUserInput = secondUserInput.toUpperCase();
        if (userInput.equals(secondUserInput)){
            System.out.println("The words are the same");
        } else {
            System.out.println("The words are different");
        }
    }
}
