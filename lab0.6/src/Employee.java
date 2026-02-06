package bai2;

abstract class Employee {
    String id, name;

    abstract double calculateSalary();

    void showInfo() {
        System.out.println(id + " - " + name + " - Lương: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        monthlySalary = salary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    int workingHours;
    double hourlyRate;

    PartTimeEmployee(String id, String name, int h, double rate) {
        this.id = id;
        this.name = name;
        workingHours = h;
        hourlyRate = rate;
    }

    @Override
    double calculateSalary() {
        return workingHours * hourlyRate;
    }
}
