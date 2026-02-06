/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
package bai5;

public class Main5 {
    public static void main(String[] args) {
        BankAccount a1 = new SavingAccount("SA01", 1000000);
        BankAccount a2 = new CheckingAccount("CA01", 500000);

        a1.deposit(200000);
        a1.withdraw(300000);

        a2.deposit(100000);

        System.out.println("Lãi tiết kiệm: " + a1.calculateInterest());
        System.out.println("Số dư cuối SA01: " + (a1.balance + a1.calculateInterest()));
        System.out.println("Số dư cuối CA01: " + a2.balance);
    }
}
