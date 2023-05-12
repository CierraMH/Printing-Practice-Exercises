package Animals;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Animal> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // String userInput = scanner.nextLine();
        System.out.println("Animal Menu \nEntering nothing will stop the loop");

        while (true) {
            System.out.println("Please enter a name: ");
            String name = scanner.nextLine();
            if (name == "") {
                break;
            } 
            System.out.println("Is it a dog? Yes or No: " );
            Boolean isThisADog = scanner.nextLine().equals("Yes");
            
            Animal animal1 = new Animal(name, isThisADog);
            animals.add(animal1);

        }

         for (Animal Animal : animals){
            Animal.getName();
            Animal.isThisADog();
            System.out.println(Animal);
         }
    }
    
}
