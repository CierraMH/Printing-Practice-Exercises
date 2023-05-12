package ArraysListsPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();
        int userInput = 0;
        do {
            userInput = Integer.valueOf(scanner.nextLine());
            list.add(userInput);
        } while (userInput != 0);
        System.out.println("The sum of that list is: " + sum(list));
    }
    public static double sum(ArrayList<Integer> list) {
        double total = 0;
        for (int i=0; i < list.size(); i++){
            //this adds the total with the list values of i (+=)
           total += list.get(i);
        }
        return total;
    }

}
