/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking;

/**
 *
 * @author Kenth Alexis Osila
 */
abstract public class Account {
    String accountNumber;
    double balance = 0;

    
    abstract void getBalance();

    abstract void withdraw(double amount);

    abstract void deposit(double amount);

}
