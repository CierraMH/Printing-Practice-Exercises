package CustomerssExamples;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args){

        ArrayList<Customer> customers = new ArrayList<>();
        Customer kay = new Customer("Kay", LocalDate.of(2000, 4, 15));
        Customer charlie = new Customer("Charlie", LocalDate.of(2005, 3, 11));
        // System.out.println(kay);
          // create store for customer to enter
        Store abc = new Store("ABC Store", 21);

          // logic to print if the customer is allowed to enter or not
          if (abc.allowedToEnter(charlie)) {
                System.out.println(charlie.getName() + " may enter the store");
            } else {
                System.out.println(charlie.getName() + " may not enter the store");
            }
              // logic to print if the customer is allowed to enter or not
        if (abc.allowedToEnter(kay)) {
                System.out.println(kay.getName() + " may enter the store");
            } else {
                System.out.println(kay.getName() + " may not enter the store");
            }

         // print the store's default text output to console via toString() method
         System.out.println(abc);


         //----------- The first day details --------------
        // kay.changeAge();
        // System.out.println(kay);
        // kay.changeAge(5);
        // System.out.println(kay);
//        Customer customer2 = new Customer("Wanda");
//        Customer customer3 = new Customer("Larry");

//        customer.howOld(21);
//        customer.printCustomer();
//        customer2.howOld(56);
//        customer2.printCustomer();
//        customer3.howOld(33);
//        customer3.printCustomer();
//        System.out.println(kay.toString());

      
//        Customer hector = new Customer("Hector");
//        // adding the customer object to the list
//        customers.add(hector);

//        for (Customer custom: customers) {
//            System.out.println(customers);
//        }

        //THIS BELOW DID NOT WORK WITH .name...
//        System.out.println(customer.name + " is a " + typeOfCustomer + " customer.");
//        System.out.println(customer2.name + " is a " + typeOfCustomer2 + " customer.");
//        System.out.println(customer3.name + " is a " + typeOfCustomer3 + " customer.");


        //A clock --- this made a infinite loop of time...
//        int hours = 0;
//        int minutes = 0;
//        int seconds = 0;
//
//        while (true) {
//            // 1. Printing the time
//            if (hours < 10) {
//                System.out.print("0");
//            }
//            System.out.print(hours);
//
//            System.out.print(":");
//
//            if (minutes < 10) {
//                System.out.print("0");
//            }
//            System.out.print(minutes);
//
//            System.out.print(":");
//
//            if (seconds < 10) {
//                System.out.print("0");
//            }
//            System.out.print(seconds);
//            System.out.println();
//
//            // 2. The second hand's progress
//            seconds = seconds + 1;
//
//            // 3. The other hand's progress when necessary
//            if (seconds > 59) {
//                minutes = minutes + 1;
//                seconds = 0;
//
//                if (minutes > 59) {
//                    hours = hours + 1;
//                    minutes = 0;
//
//                    if (hours > 23) {
//                        hours = 0;
//                    }
//                }
//            }
//        }
    }
}
