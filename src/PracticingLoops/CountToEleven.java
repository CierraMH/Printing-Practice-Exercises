package PracticingLoops;

import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number less than 11");
        int userInput = Integer.valueOf(scanner.nextLine());
        while (userInput <= 11) {
                System.out.println(userInput);
                userInput++;
        }
    }
}
