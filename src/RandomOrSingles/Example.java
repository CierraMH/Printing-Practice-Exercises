package RandomOrSingles;

import java.util.Scanner;
// import the list class from the java.util package
import java.util.ArrayList;
public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Hello custom method!");
//        hello(1);
////        System.out.println("Hello again!");
//        hello(2);
//
//        //adding
//        sum(6, 8);
////        int num1 = 4;
//        int num2 = 15;
////        sum(num1, num2);

        //new int add
//        int num = returnThree();
//        System.out.println("Method returns the number " + num);
//
//        //A Double using returnThree RandomOrSingles.Example
//        double number = 3.14 * returnThree() + (returnThree() / 1.5) - 5.04;
//        System.out.println("The result of the calculation is " + number);

        //new
//        divideNumbers(6, 8); // prints the math/number
//        divideNumbers(6, 0); // prints the Do not divide the number by 0!
//
//        //new gather average
////        averageOfNums(3,5,8); works, but does nothing as it only returns and does not println()
//        System.out.println("Enter the first number: ");
//        int firstNum = Integer.valueOf(scanner.nextLine());
//
//        System.out.println("Enter the second number: ");
//        int secondNum = Integer.valueOf(scanner.nextLine());
//
//        System.out.println("Enter the third number: ");
//        int thirdNum = Integer.valueOf(scanner.nextLine());

//        double average = averageOfNums(firstNum, secondNum, thirdNum);
//        System.out.println("The average of the numbers you have entered is: " + average);
        //ANOTHER way to run it
//                System.out.println("The average of the numbers you have entered is: " + averageOfNums(firstNum, secondNum, thirdNum));
        // new Arraylist
        // create a list - this is a list of Strings
//        ArrayList list = new ArrayList<>();
//
//        // list isn't being used here but this is the steps necessary to create one within your program
//        ArrayList list1 = new ArrayList<>();
//        list1.add(11);
//
//        ArrayList list2 = new ArrayList<>();
//        list2.add(58.92);
//
//        ArrayList list3 = new ArrayList<>();
//        list3.add(false);
//
//        ArrayList list4 = new ArrayList<>();
//        list4.add("Strings are reference type variables");
//        System.out.println(new ArrayList<>(list1));
//        System.out.println(new ArrayList<>(list2));
//        System.out.println(new ArrayList<>(list3));
//
//        //new
//        // create a list that stores Strings
//        ArrayList<String> listOfStrings = new ArrayList<String>();
//
//        // add two values to the list
//        listOfStrings.add("First");
//        listOfStrings.add("Second");
//
//        // retrieve the value from position 0 of the list and print it
//        System.out.println(listOfStrings.get(0)); // prints "First"
//        System.out.println(listOfStrings.get(2)); // provides an error message as we do not have 3 things within the array

        //new
        ArrayList<String> people = new ArrayList<>();

        people.add("Jane");
        people.add("John");
        people.add("Jill");
        people.add("Jack");
        people.add("Janet");
// gather the full array list details with the for loop
//        for (int i = 0; i < people.size(); i++) {
//            System.out.println(people.get(i));
//        }
        //array of numbers -NEW
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(11);
        numbers.add(22);
        numbers.add(33);
        numbers.add(44);
        numbers.add(55);
        for (int i = 0; i < numbers.size(); i++) {
//            System.out.println(numbers.get(i));
         int number = numbers.get(i);
           System.out.println(number);
        }
        //enhanced FOR LOOP
        for (Integer number: numbers) {
            System.out.println(number);
        }
    }
    ///how to say hello more than one way
//    public static void hello() {
//        System.out.println("Hello!");
//    }
//    public static void hello(int number) {
//        int i = 0;
//        while (i < number) {
//            System.out.println("Hello!");
//            i++;
//        }
//    }
//    public static void sum(int numOne, int numTwo) {
//        System.out.println("" + numOne + " + " + numTwo + " = " + (numOne + numTwo));
//    }
//    public static int returnThree() {
//        return 3;
//    }
//    public static void divideNumbers(int num1, int num2) {
//        if (num2 == 0) {
//            System.out.println("Do not divide the number by 0!");
//            return;
//        }
//
//        // multiple num1 by 1.0 so it will display the decimals of the number
//        System.out.println(num1 + " / " + num2 + " = " + (num1 * 1.0 / num2));
//    }
//    public static double averageOfNums(int num1, int num2, int num3) {
//        int sum = num1 + num2 + num3;
//        double average = sum / 3.0;
////        return average;
//        return (num1 + num2 + num3) / 3.0;
//    }

}
