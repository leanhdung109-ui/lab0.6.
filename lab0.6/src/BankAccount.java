package bai5;

abstract class BankAccount {
    String accountNumber;
    double balance;

    abstract double calculateInterest();

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Không đủ số dư!");
        }
    }
}

class SavingAccount extends BankAccount {
    double interestRate = 0.05;

    SavingAccount(String acc, double bal) {
        accountNumber = acc;
        balance = bal;
    }

    @Override
    double calculateInterest() {
        return balance * interestRate;
    }
}

class CheckingAccount extends BankAccount {
    CheckingAccount(String acc, double bal) {
        accountNumber = acc;
        balance = bal;
    }

    @Override
    double calculateInterest() {
        return 0;
    }
}
