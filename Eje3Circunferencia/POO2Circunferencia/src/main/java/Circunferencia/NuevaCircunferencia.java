/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Circunferencia;

import java.util.Scanner;

/**
 *
 * @author monte
 */
public class NuevaCircunferencia {
        public void crearCircunferencia(Circunferencia cir) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio de la circunferencia:");
        //this.radio = sc.nextDouble();
        cir.setRadio(sc.nextDouble());
        
    }

    public double area(Circunferencia cir) {
        return Math.PI * Math.pow(cir.getRadio(), cir.getRadio());
    }

    public double perimetro(Circunferencia cir) {
        return 2 * Math.PI * cir.getRadio();
    }
}
