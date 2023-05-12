package ClassObjectAndConstructorsPractice;

public class ProductMain {
    public static void main(String[] args) {
        Product product1 = new Product("Gas", 3.0, 11);
        System.out.println(product1.printProduct());
        System.out.println(product1.totalCost());

    }
}

