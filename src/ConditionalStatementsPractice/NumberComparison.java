package ConditionalStatementsPractice;

import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter another number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        if (num1 == num2){
            System.out.println("Numbers are the same");
        } else if (num1 > num2) {
            System.out.println("The first number was larger than the second");
        } else if (num2 > num1) {
            System.out.println("The second number was larger than the first");
        } else {
            System.out.println("Error");
        }
    }
}
