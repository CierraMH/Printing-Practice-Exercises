package CustomerssExamples;

import java.time.LocalDate;
import java.time.Period;


public class Customer {
    private String name;
    private LocalDate birthday;
    // private int age; = no longer used as we will verify based on BDAY
    // first constructor, one parameter

    public Customer(String customerName, LocalDate birthday) {
        // this.age = 0;
        this.birthday = birthday;
        this.name = customerName;
    }

    // second constructor, two parameters
    // public Customer(String customerName, int age) {
    //     this.age = age;
    //     this.name = customerName;
    // }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        // get today's date
        LocalDate today = LocalDate.now();
        // get the amount of time in between today and the customer's birthday
        Period period = Period.between(birthday, today);

         // set the amount of years in between the dates
         int age = period.getYears();

         // print the age and return it so the age
         System.out.println(age);
         return age;
    }

    // public void setAge(int age) {
    //     this.age = age;
    // }
    // public void printCustomer() {
    //     System.out.println("The customer's name is " + this.name + " and their age is " + this.age);
    // }
    // public String frequentCustomer() {
    //     return "frequent";
    // }
    // public void changeAge() {
    //     this.age = this.age + 1;
    // }

    // public void changeAge(int years) {
    //     this.age = this.age + years;
    // }
    // public String nonFrequentCustomer() {
    //     return "non-frequent";
    // }
    // String typeOfCustomer = frequentCustomer();


    @Override
    public String toString(){
        return "The customer's name is " + name + ". They were born on " + birthday;
    }

//    public void howOld(int customerAge) {
//        this.age = customerAge;
//    }

}
