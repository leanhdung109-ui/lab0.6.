package bai8;

abstract class GeometricObject {
    abstract double getArea();
    abstract double getPerimeter();

    void show() {
        System.out.println("Diện tích: " + getArea());
        System.out.println("Chu vi: " + getPerimeter());
        System.out.println();
    }
}

class Rectangle extends GeometricObject {
    double w, h;

    Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    double getArea() { return w * h; }
    double getPerimeter() { return 2 * (w + h); }
}

class Square extends GeometricObject {
    double side;

    Square(double s) { side = s; }

    double getArea() { return side * side; }
    double getPerimeter() { return 4 * side; }
}

class Circle extends GeometricObject {
    double r;

    Circle(double r) { this.r = r; }

    double getArea() { return Math.PI * r * r; }
    double getPerimeter() { return 2 * Math.PI * r; }
}
