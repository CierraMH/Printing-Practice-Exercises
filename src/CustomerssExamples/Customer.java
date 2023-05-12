package CustomerssExamples;

public class Customer {
    private String name;
    private int age;
    // first constructor, one parameter
    public Customer(String customerName) {
        this.age = 0;
        this.name = customerName;
    }

    // second constructor, two parameters
    public Customer(String customerName, int age) {
        this.age = age;
        this.name = customerName;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void printCustomer() {
        System.out.println("The customer's name is " + this.name + " and their age is " + this.age);
    }
    public String frequentCustomer() {
        return "frequent";
    }
    public void changeAge() {
        this.age = this.age + 1;
    }

    public void changeAge(int years) {
        this.age = this.age + years;
    }
    public String nonFrequentCustomer() {
        return "non-frequent";
    }
    String typeOfCustomer = frequentCustomer();
    @Override
    public String toString(){
        return name + " is a " + age + " year old and they are a " + typeOfCustomer + " customer";
    }

//    public void howOld(int customerAge) {
//        this.age = customerAge;
//    }

}
