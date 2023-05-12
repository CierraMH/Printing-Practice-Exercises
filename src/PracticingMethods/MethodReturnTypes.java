package PracticingMethods;

import java.util.Scanner;

public class MethodReturnTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        returnAString();
        System.out.println(returnAString());
        returnAIntger();
        System.out.println(returnAIntger());
        returnABoolean();
        System.out.println(returnABoolean());
    }
    public static String returnAString(){
        return "String of text";
    }
    public static int returnAIntger(){
        return 5;
    }
    public static boolean returnABoolean(){
        return true;
    }
}
