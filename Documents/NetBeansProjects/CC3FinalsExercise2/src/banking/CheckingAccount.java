/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking;

import javax.swing.JOptionPane;

/**
 *
 * @author Kenth Alexis Osila
 */
public class CheckingAccount extends Account {

    @Override
    void getBalance() {
        JOptionPane.showMessageDialog(null, String.format("Account Number: " + accountNumber + "%nYour current balance is P%,.2f" + ".", balance));
    }

    @Override
    void withdraw(double amount) {
        balance -= amount;
        JOptionPane.showMessageDialog(null, String.format("Withdraw is successful! %nAccount Number: " + accountNumber + "%nYour current balance is P%,.2f" + ".", balance));

    }

    @Override
    void deposit(double amount) {
        balance += amount;
        JOptionPane.showMessageDialog(null, String.format("Deposit is successful! %nAccount Number: " + accountNumber + "%nYour current balance is P%,.2f" + ".", balance));

    }

}
