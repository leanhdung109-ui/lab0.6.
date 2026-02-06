/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
package bai7;

public class Main7 {
    public static void main(String[] args) {
        Staff[] list = {
            new OfficeStaff("An", 8000000),
            new SalesStaff("Bình", 5000000, 20000000, 0.05)
        };

        double total = 0;

        for (Staff s : list) {
            s.showIncome();
            total += s.getIncome();
        }

        System.out.println("Tổng thu nhập công ty: " + total);
    }
}

    

