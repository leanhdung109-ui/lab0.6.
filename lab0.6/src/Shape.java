package bai1;

abstract class Shape {
    String name;

    abstract double area();

    void display() {
        System.out.println(name + " - Diện tích: " + area());
    }
}

class Rectangle extends Shape {
    double width, height;

    Rectangle(double w, double h) {
        name = "Hình chữ nhật";
        width = w;
        height = h;
    }

    @Override
    double area() {
        return width * height;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        name = "Hình tròn";
        radius = r;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
