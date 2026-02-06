/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
package bai8;

public class Main8 {
    public static void main(String[] args) {
        GeometricObject[] list = {
            new Rectangle(4, 6),
            new Square(5),
            new Circle(3)
        };

        for (GeometricObject g : list) {
            g.show();
        }
    }
}
