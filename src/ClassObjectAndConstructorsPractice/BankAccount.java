package ClassObjectAndConstructorsPractice;

public class BankAccount {
    double accountBalance;
    String holderName;
    //the constructors
    BankAccount(double accountBalance, String holderName){
        this.accountBalance = accountBalance;
        this.holderName = holderName;
    }
    //deposit method
    double deposit(double amountDeposited){
        return this.accountBalance += amountDeposited;
    }
    double withdrawal(double amountWithdrawn){
        return this.accountBalance -= amountWithdrawn;
    }
    @Override
    public String toString() {
        return this.holderName + " Account Balance: " + this.accountBalance;
    }
}