/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
package bai4;

public class Main4
{
    public static void main(String[] args) {
        Animal[] list = { new Dog(), new Cat(), new Bird() };

        for (Animal a : list) {
            a.show();
        }
    }
}

