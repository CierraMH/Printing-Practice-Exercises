package ScannerAssignment;

import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of text: ");
        String text = scanner.nextLine();
        System.out.println("Enter an integer: ");
        int text2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter a double: ");
        double text3 = Double.valueOf(scanner.nextLine());
        System.out.println("Enter a boolean value: ");
        boolean text4 = Boolean.valueOf(scanner.nextLine());
        System.out.println("Your string is " + text + "\nYour integer is " + text2 + "\nYour double is " + text3 + "\nYour boolean is " + text4);

    }
}
