/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.extra3raices;

import servicio.Ecuacion;
import servicio.Raices;

/**
 *
 * @author monte
 */
public class Extra3Raices {

    public static void main(String[] args) {
        Raices raiz1=new Raices();
       // Raices valores = new Raices(1, -5, 6);
        Ecuacion ecuacion=new Ecuacion();
        
        System.out.println("Ecuancion de 2do grado");
        ecuacion.crearValores(raiz1);
        System.out.println("El valor de discriminante "+ecuacion.getDiscriminante(raiz1));
        System.out.println("Tiene dos soluciones "+ecuacion.tieneRaices(raiz1));
        System.out.println("Tiene una solucion "+ecuacion.tieneRaiz(raiz1));
        System.out.println("tiene raices " +ecuacion.tieneRaices(raiz1));
        
        ecuacion.calcular(raiz1);
    }
}
