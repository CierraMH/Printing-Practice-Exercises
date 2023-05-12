package ScannerAssignment;

import java.util.Scanner;

public class Superhero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's write a story about a superhero.");
        System.out.println("Who is the hero of our story?");
        String text = scanner.nextLine();
        //guest info.
        System.out.println("What is their superpower?");
        String text1 = scanner.nextLine();
        System.out.println("Here is the story: " + "\nThere once was a superhero named " + text + ", who had the power of " + text1 + ".");
        System.out.println("As they grew older, " + text + " saw that the world needed them.");
        System.out.println(text + " used their ability to " + text1 + " to save the world.");
    }
}
