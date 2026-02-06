/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
package bai1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Shape> list = new ArrayList<>();
        list.add(new Rectangle(4, 5));
        list.add(new Rectangle(3, 6));
        list.add(new Circle(2));

        for (Shape s : list) {
            s.display();
        }
    }
}
