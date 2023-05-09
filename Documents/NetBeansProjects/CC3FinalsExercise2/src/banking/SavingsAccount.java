package banking;

import javax.swing.JOptionPane;

public class SavingsAccount extends Account{

    @Override
    void getBalance() {
        JOptionPane.showMessageDialog(null, String.format("Account Number: " + accountNumber + "%nYour current balance is P%,.2f" + ".", balance));
    }

    @Override
    void withdraw(double amount) {
        balance -= amount;
                       JOptionPane.showMessageDialog(null, String.format("Withdraw is successful! %nAccount Number: " + accountNumber +"%nYour current balance is P%,.2f" + ".", balance));


    }

    @Override
    void deposit(double amount) {
        balance += amount;
        JOptionPane.showMessageDialog(null, String.format("Deposit is successful! %nAccount Number: " + accountNumber +"%nYour current balance is P%,.2f" + ".", balance));

    }

    
    
}
