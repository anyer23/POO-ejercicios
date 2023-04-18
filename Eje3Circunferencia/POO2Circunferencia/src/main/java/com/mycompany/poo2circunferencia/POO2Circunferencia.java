/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo2circunferencia;

import Circunferencia.Circunferencia;
import Circunferencia.NuevaCircunferencia;
import java.util.Scanner;

/**
 *
 * @author monte
 */
public class POO2Circunferencia {

    public static void main(String[] args) {
      
       
        Circunferencia c1= new Circunferencia();
        NuevaCircunferencia nci=new NuevaCircunferencia();
        nci.crearCircunferencia(c1);
        System.out.println( "El area es "+String.format("%.2f", nci.area(c1)) );
        System.out.println("El perimetro "+String.format("%.2f",  nci.perimetro(c1)));
        
        

    
    }
}

