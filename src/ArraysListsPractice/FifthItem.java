package ArraysListsPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> myUserInputArray = new ArrayList();
        String userInput = "";

        do {
           userInput = scanner.nextLine();
           myUserInputArray.add(userInput);
       } while (userInput != "");

        System.out.println("The fifth word in the list is: " + myUserInputArray.get(4));
    }
}
