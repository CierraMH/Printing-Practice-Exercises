package CustomerssExamples;

public class Store {
    private String name;
    private int requiredAge;
    private int numOfCustomers;

    public Store(String name, int requiredAge) {
        this.name = name;
        this.requiredAge = requiredAge;
        this.numOfCustomers = 0;
    }

    public boolean allowedToEnter(Customer customer) {
        if (customer.getAge() < this.requiredAge) {
            return false;
        }
        // using the increment operator to increase the numOfCustomers by one each time someone is permitted to enter
      this.numOfCustomers++;
      return true;
    }
      
    public String toString() {
        return this.name + ", required age: " + this.requiredAge + ", number of customers: " + this.numOfCustomers;
    }
}  

