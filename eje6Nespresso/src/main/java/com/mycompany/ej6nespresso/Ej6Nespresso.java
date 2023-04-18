/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej6nespresso;

import java.util.Scanner;

/**
 *
 * @author monte
 */
public class Ej6Nespresso {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Cafetera cafer=new Cafetera(100,50);
        
        System.out.println("Capacidad máxima de la cafetera "+cafer.getCapacidadMaxima()+" ml");
        System.out.println("Cantidad actual de la cafetera "+cafer.getCantidadActual()+" ml");
        cafer.llenarCafetera();
        System.out.println("Ingrese el tamaño de la taza que quiere servir "); 
        int tamanoTaza=leer.nextInt();
        cafer.servirTaza(tamanoTaza);
        System.out.println("Cantidad actual de la cafetera "+cafer.getCantidadActual());
        cafer.vaciarCafetera();
        System.out.println("Cantida actual de la cafetera "+cafer.getCantidadActual());
    }
}
