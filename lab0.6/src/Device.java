
package bai6;

abstract class Device {
    String deviceName;

    abstract double powerConsumption();

    void showPower() {
        System.out.println(deviceName + " - Công suất: " + powerConsumption() + " W");
    }
}

class Laptop extends Device {
    Laptop() { deviceName = "Laptop"; }

    double powerConsumption() { return 65; }
}

class AirConditioner extends Device {
    AirConditioner() { deviceName = "Máy lạnh"; }

    double powerConsumption() { return 1500; }
}

class Television extends Device {
    Television() { deviceName = "TV"; }

    double powerConsumption() { return 120; }
}
