package bai7;

abstract class Staff {
    String name;

    abstract double getIncome();

    void showIncome() {
        System.out.println(name + " - Thu nhập: " + getIncome());
    }
}

class OfficeStaff extends Staff {
    double fixedSalary;

    OfficeStaff(String n, double s) {
        name = n;
        fixedSalary = s;
    }

    double getIncome() {
        return fixedSalary;
    }
}

class SalesStaff extends Staff {
    double baseSalary, sales, commissionRate;

    SalesStaff(String n, double base, double s, double rate) {
        name = n;
        baseSalary = base;
        sales = s;
        commissionRate = rate;
    }

    double getIncome() {
        return baseSalary + sales * commissionRate;
    }
}
