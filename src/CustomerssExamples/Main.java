package CustomerssExamples;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        Customer kay = new Customer("Kay", 29);
        System.out.println(kay);

        kay.changeAge();
        System.out.println(kay);
        kay.changeAge(5);
        System.out.println(kay);
//        Customer customer2 = new Customer("Wanda");
//        Customer customer3 = new Customer("Larry");

//        customer.howOld(21);
//        customer.printCustomer();
//        customer2.howOld(56);
//        customer2.printCustomer();
//        customer3.howOld(33);
//        customer3.printCustomer();
//        System.out.println(kay.toString());

        ArrayList<Customer> customers = new ArrayList<>();
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
