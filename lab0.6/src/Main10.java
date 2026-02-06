/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
package bai10;

public class Main10 {
    public static void main(String[] args) {
        double amount = 2000000;

        PaymentMethod[] list = {
            new CashPayment(),
            new CreditCardPayment(),
            new EwalletPayment()
        };

        for (PaymentMethod p : list) {
            if (p.pay(amount)) {
                System.out.println(p.methodName + ": Thanh toán thành công");
                p.printReceipt(amount);
            } else {
                System.out.println(p.methodName + ": Thanh toán thất bại");
            }
        }
    }
}
