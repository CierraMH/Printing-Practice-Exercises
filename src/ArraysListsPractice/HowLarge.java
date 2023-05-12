package ArraysListsPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> myUserInputArray = new ArrayList();
        String userInput = "";
        do {
            userInput = scanner.nextLine();
            myUserInputArray.add(userInput);
        } while (userInput != "");
        myUserInputArray.remove(myUserInputArray.size()-1);

        System.out.println("The total amount of items in the list are: " + myUserInputArray.size());
    }
}
