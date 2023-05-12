package PracticingMethods;
public class AverageMethod {
    public static void main(String[] args) {
        System.out.println( "The average is: " + average(2, 8, 5));
    }
    public static int sum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    public static double average(int num1, int num2, int num3){
        double totalNumber = (double)3.0;
        double totalAverage = sum(num1, num2, num3)/totalNumber;
        return totalAverage;
    }
}
