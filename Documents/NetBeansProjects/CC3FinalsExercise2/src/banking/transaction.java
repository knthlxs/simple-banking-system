package banking;

import javax.swing.JOptionPane;

public class transaction {

    public static void main(String[] args) {
        int accType = Integer.parseInt(JOptionPane.showInputDialog(null, "Welcome to PLV Banking System! Let's create your acount.\nChoose from the account type:\n1. Savings Account\n2. Checking Account"));

        Account acc;

        switch (accType) {
            case 1 ->
                acc = new SavingsAccount();
            case 2 ->
                acc = new CheckingAccount();
            default ->
                throw new AssertionError();
        }

        acc.accountNumber = JOptionPane.showInputDialog(null, "Enter your account number");

        acc.balance = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter initial balance"));
        double amount;
        boolean again = true;

        while (again) {
            int process = Integer.parseInt(JOptionPane.showInputDialog(null, "What would you like to do?\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit"));
            switch (process) {
                case 1 ->
                    acc.getBalance();
                case 2 -> {
                    amount = Double.parseDouble(JOptionPane.showInputDialog(null, String.format("Your current balance is P%,.2f" + ".", acc.balance) + "\nEnter the amount that you want to deposit."));
                    acc.deposit(amount);
                }
                case 3 -> {
                    boolean invalidAmount = true;
                    while (invalidAmount) {
                        amount = Double.parseDouble(JOptionPane.showInputDialog(null, String.format("Your current balance is P%,.2f" + ".", acc.balance) + "\nEnter the amount that you want to withdraw."));
                        if (amount > acc.balance) {
                            JOptionPane.showMessageDialog(null, "Invalid amount. Please try again." + String.format("%nYour current balance is P%,.2f" + ".", acc.balance));
                        } else {
                            invalidAmount = false;
                            acc.withdraw(amount);
                        }
                    }
                }
                case 4 ->
                    again = false;
                default ->
                    throw new AssertionError();
            }
        }
    }

}
