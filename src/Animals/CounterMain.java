package Animals;

public class CounterMain {
    public static void main(String[] args) {
        Counter counter1 = new Counter(0, 0);
        Counter counter2 = new Counter(5, 0);

        System.out.println(counter1.value());
        System.out.println(counter2.value());

        counter1.increase(7);
        counter2.decrease(2);

        System.out.println(counter1.value());
        System.out.println(counter2.value());

    }
    
}
