/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poooperacion;

import java.util.Scanner;

/**
 *
 * @author monte
 */
public class Operacion {

    private double numero1;
    private double numero2;

    public Operacion() {
    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
/*
        // Method to create the operation by asking the user for the numbers
    public void crearOperacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        double numero1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double numero2 = scanner.nextDouble();
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Method to sum the numbers and return the result
    public double sumar() {
        return numero1 + numero2;
    }

    // Method to subtract the numbers and return the result
    public double restar() {
        return numero1 - numero2;
    }

    // Method to multiply the numbers and return the result
    public double multiplicar() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error: No se puede multiplicar por cero.");
            return 0;
        } else {
            return numero1 * numero2;
        }
    }

    // Method to divide the numbers and return the result
    public double dividir() {
        if (numero2 == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        } else {
            return numero1 / numero2;
        }
    }
 

    
    */
}
