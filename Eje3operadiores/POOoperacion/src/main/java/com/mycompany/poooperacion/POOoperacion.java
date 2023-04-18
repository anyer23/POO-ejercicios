/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.poooperacion;

import Operadores.Aritmetica;

/**
 *
 * @author monte
 */
public class POOoperacion {

    public static void main(String[] args) {
        Operacion op = new Operacion();

        Aritmetica ari1 = new Aritmetica();
        
        ari1.crearOperacion(op);
        double resultadoSuma = ari1.sumar(op);
        System.out.println("El resultado de la suma es: " + resultadoSuma);
        double resultadoResta = ari1.resta(op);
        System.out.println("El resultado de la resta es: " + resultadoResta);
        double resultadoMultiplicacion = ari1.multiplicacion(op);
        System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicacion);
        double resultadoDivision = ari1.dividir(op);
        System.out.println("El resultado de la division es " + resultadoDivision);
   
   }
}
