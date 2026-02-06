/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
package bai6;

public class Main6 {
    public static void main(String[] args) {
        Device[] list = {
            new Laptop(),
            new AirConditioner(),
            new Television()
        };

        Device max = list[0];

        for (Device d : list) {
            d.showPower();
            if (d.powerConsumption() > max.powerConsumption()) {
                max = d;
            }
        }

        System.out.println("Thiết bị tiêu thụ điện nhiều nhất: " + max.deviceName);
    }
}

