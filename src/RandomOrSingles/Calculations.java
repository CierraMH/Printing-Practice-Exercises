package RandomOrSingles;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        float num1 = Float.valueOf(scanner.nextLine());
        int value = (int)num1;
        System.out.println("Enter another number:");
        float num2 = Float.valueOf(scanner.nextLine());
        int value2 = (int)num2;
//        double division = Double.valueOf(num1 / num2);
        System.out.println(num1 + " + " + num2 + " = " + (value+value2));
        System.out.println(num1 + " - " + num2 + " = " + (value-value2));
        System.out.println(num1 + " * " + num2 + " = " + (value*value2));
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        System.out.println(num1 + " % " + num2 + " = " + (value%value2));
    }
}
