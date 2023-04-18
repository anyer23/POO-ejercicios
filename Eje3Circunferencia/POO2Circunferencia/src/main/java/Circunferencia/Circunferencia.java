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
public class Circunferencia {

    private double radio;

    public Circunferencia() {

    }

    public Circunferencia(double radio) {
        this.radio = radio;
        //area=(float) (3.1416*(radio*radio));
        // perimetro=(float)(2*3.1416*radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }



    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + this.radio;
    }

}
