package banking;

abstract public class Account {
    String accountNumber;
    double balance = 0;

    
    abstract void getBalance();

    abstract void withdraw(double amount);

    abstract void deposit(double amount);

}
