package PracticingLoops;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        System.out.println("Enter a number");
        int userInput = Integer.valueOf(scanner.nextLine());
        System.out.println(userInput + " is your input number.");
        while (i <= 10) {
            System.out.println(userInput + " * " + i + " = " + userInput * (i++) );
        }
    }
}
