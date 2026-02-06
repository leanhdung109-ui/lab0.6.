package bai4;

abstract class Animal {
    String name;

    abstract void makeSound();
    abstract void move();

    void show() {
        System.out.println("Tên: " + name);
        makeSound();
        move();
        System.out.println();
    }
}

class Dog extends Animal {
    Dog() { name = "Chó"; }
    void makeSound() { System.out.println("Sủa gâu gâu"); }
    void move() { System.out.println("Chạy"); }
}

class Cat extends Animal {
    Cat() { name = "Mèo"; }
    void makeSound() { System.out.println("Meo meo"); }
    void move() { System.out.println("Đi nhẹ"); }
}

class Bird extends Animal {
    Bird() { name = "Chim"; }
    void makeSound() { System.out.println("Hót"); }
    void move() { System.out.println("Bay"); }
}
