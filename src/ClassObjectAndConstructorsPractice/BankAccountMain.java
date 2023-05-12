package ClassObjectAndConstructorsPractice;


public class BankAccountMain {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount(500, "Kate");
        account1.deposit(100);
        System.out.println(account1.toString());
        BankAccount account2 = new BankAccount(5000, "Larry");
        account2.withdrawal(100);
        System.out.println(account2.toString());
        BankAccount account3 = new BankAccount(300, "Mary");
        account3.deposit(100);
        System.out.println(account3.toString());
    }
}
