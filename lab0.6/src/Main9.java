/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
package bai9;

public class Main9 {
    public static void main(String[] args) {
        double distance = 10;

        Transport[] list = {
            new Bus(),
            new Taxi(),
            new Train()
        };

        Transport cheapest = list[0];

        for (Transport t : list) {
            t.showInfo(distance);
            if (t.calculateCost(distance) < cheapest.calculateCost(distance)) {
                cheapest = t;
            }
        }

        System.out.println("Phương tiện rẻ nhất: " + cheapest.name);
    }
}


