package bai9;

abstract class Transport {
    String name;

    abstract double calculateCost(double distance);
    abstract int getCapacity();

    void showInfo(double d) {
        System.out.println(name +
                " | Chi phí: " + calculateCost(d) +
                " | Sức chứa: " + getCapacity());
    }
}

class Bus extends Transport {
    Bus() { name = "Xe buýt"; }

    double calculateCost(double d) { return d * 5000; }
    int getCapacity() { return 40; }
}

class Taxi extends Transport {
    Taxi() { name = "Taxi"; }

    double calculateCost(double d) { return d * 15000; }
    int getCapacity() { return 4; }
}

class Train extends Transport {
    Train() { name = "Tàu hỏa"; }

    double calculateCost(double d) { return d * 3000; }
    int getCapacity() { return 200; }
}
