package PracticingMethods;

import java.util.Scanner;

public class DivideMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double firstNum = Double.valueOf(scanner.nextLine());
        System.out.println("Enter the second number: ");
        double secondNum = Double.valueOf(scanner.nextLine());
//        divide(firstNum, secondNum);
        System.out.println(firstNum + " / " + secondNum + " = " + divide(firstNum, secondNum));

    }
    public static double divide(double firstNum, double secondNum){
        return firstNum / secondNum;
    }
}
