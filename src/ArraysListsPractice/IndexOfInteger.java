package ArraysListsPractice;

import java.util.Scanner;
import java.util.ArrayList;


public class IndexOfInteger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();
        int userInput = 0;
        do {
            userInput = Integer.valueOf(scanner.nextLine());
            list.add(userInput);
        } while (userInput != 0);
        System.out.println("Done entering integers into the list");
        System.out.println("What number are you looking for in the list?");
        int userLookingInput = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < list.size(); i++ ) {
            if (list.get(i) == userLookingInput) {
                System.out.println(userLookingInput + " is at index " + i);
            }
        }
    }
}
