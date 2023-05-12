package ChatBox;
import ScannerAssignment.Greeting;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class ChatBox {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = Greeting(scanner);
        SecondGreetingCheck(scanner);
        GuessYourAge(scanner, name);
        Counting(scanner);
        ProgrammingKnowledge(scanner);
    }

    public static String Greeting(Scanner scanner) {
        System.out.println("HELLO WELCOME TO OUR CHAT-BOT! \nWhat's your first and last name?");
        String text = scanner.nextLine();
        return text;

    }
    public static void SecondGreetingCheck(Scanner scanner){
        System.out.println("Please verify your first and last name one more time?");
        String text = scanner.nextLine();
        System.out.println("Thank you " + text + "!" );
    }
    public static void GuessYourAge(Scanner scanner, String name){
        System.out.println("Let's play a game where I try to guess your age " + name + "!");
        System.out.println("Have you had a birthday this year?");
        String text = scanner.nextLine();
        System.out.println("What year were you born? (Ex: 1994) ");
        int text1 = Integer.valueOf(scanner.nextLine());
        System.out.println("What month were you born? (Ex: 8 OR 12) ");
        int text2 = Integer.valueOf(scanner.nextLine());
        System.out.println("What day were you born upon? (Ex: 10)");
        int text3 = Integer.valueOf(scanner.nextLine());

        LocalDate today = LocalDate.now();
        LocalDate yourBirthDate = LocalDate.of(text1, text2, text3);
        int years = Period.between(yourBirthDate, today).getYears();
        System.out.println("You are " + years + " years old!");

    }
    public static void Counting(Scanner scanner){
        System.out.println("Let's count to any number you would like!");
        int userInput = Integer.valueOf(scanner.nextLine());

        for (int i=0; i <= userInput; i++){
            System.out.println(i);
        }
    }
    public static void ProgrammingKnowledge(Scanner scanner){
        System.out.println("Please answer the following question to test your knowledge. \nWhich is the correct control structure for a (FOR LOOP)?");
        System.out.println("A. A conditional structure that allows you to execute a block of code if a certain condition is true, and another block if it's false. \nB. A multi-branch conditional structure that allows you to execute different blocks of code based on the value of an expression. \nC. A loop structure that repeats a block of code for a specific number of iterations. \nD. A loop structure that repeats a block of code as long as a certain condition is true. \nPlease enter either (A)(B)(C) or (D)");
        String userInput = "";
        do {
            userInput = scanner.nextLine();
            if (userInput.equals("A")){
                System.out.println("Please try again");
            } else if (userInput.equals("B")){
                System.out.println("Please try again");
            } else if (userInput.equals("C")){
                System.out.println("Correct! Great Job");
                break;
            } else if (userInput.equals("D")){
                System.out.println("Please try again");
            }
        } while (true);
    }
}
