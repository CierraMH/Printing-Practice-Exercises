package ArraysListsPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> myUserInputArray = new ArrayList();
        System.out.println("Please enter some words!");
        String userInput = "";
        do {
            userInput = scanner.nextLine();
            myUserInputArray.add(userInput);
        } while (userInput != "");
        System.out.println("The last item in the list is: " + myUserInputArray.get(myUserInputArray.size()-2));

    }
}
