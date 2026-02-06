/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
package bai2;

public class Main2 {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("FT01", "An", 12000000);
        Employee e2 = new PartTimeEmployee("PT01", "Bình", 80, 50000);

        e1.showInfo();
        e2.showInfo();
    }
}

