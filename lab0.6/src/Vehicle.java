package bai3;

abstract class Vehicle {
    String brand;

    abstract int getMaxSpeed();

    void showInfo() {
        System.out.println(brand + " - Tốc độ tối đa: " + getMaxSpeed());
    }
}

class Car extends Vehicle {
    Car(String b) {
        brand = b;
    }

    @Override
    int getMaxSpeed() {
        return 180;
    }
}

class Motorbike extends Vehicle {
    Motorbike(String b) {
        brand = b;
    }

    @Override
    int getMaxSpeed() {
        return 120;
    }
}
