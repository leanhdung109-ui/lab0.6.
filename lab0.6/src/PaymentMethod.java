package bai10;

abstract class PaymentMethod {
    String methodName;

    abstract boolean pay(double amount);

    void printReceipt(double amount) {
        System.out.println("Thanh toán " + amount + " bằng " + methodName);
    }
}

class CashPayment extends PaymentMethod {
    CashPayment() { methodName = "Tiền mặt"; }

    boolean pay(double amount) {
        return true;
    }
}

class CreditCardPayment extends PaymentMethod {
    CreditCardPayment() { methodName = "Thẻ tín dụng"; }

    boolean pay(double amount) {
        return amount <= 5000000;
    }
}

class EwalletPayment extends PaymentMethod {
    EwalletPayment() { methodName = "Ví điện tử"; }

    boolean pay(double amount) {
        return amount <= 3000000;
    }
}
