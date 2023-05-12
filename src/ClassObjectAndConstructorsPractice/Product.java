package ClassObjectAndConstructorsPractice;

public class Product {
    String productName;
    double cost;
    int quantity;
    
    Product(String productName, double cost, int quantity){
        this.productName = productName;
        this.cost = cost;
        this.quantity = quantity;
    }
    String totalCost(){
        return "Total cost is " + this.quantity * this.cost;
    }
    String printProduct(){
        return this.productName + " costs $" + this.cost + " and " + this.quantity + " units were purchased.";
    }
    // @Override
    // public String toString() {
    //     return productName + " costs $" + cost + " and " + quantity + " units were purchased.";
    // }
}
