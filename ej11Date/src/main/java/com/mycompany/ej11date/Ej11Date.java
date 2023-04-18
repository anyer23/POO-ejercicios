/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej11date;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


/**
 *
 * @author monte
 */
public class Ej11Date {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        
        //System.out.println("Fecha ac "+fechaActual);
        System.out.println("Ingrese mes");
        int mes=leer.nextInt();
        System.out.println("Ingrese año");
        int ano=leer.nextInt();
        System.out.println("Ingrese dia ");
        int dia=leer.nextInt();
        
        //crea una fehca con valores introducidos
        LocalDate fecha=LocalDate.of(ano,mes,dia);
        System.out.println("La fecha ingresada es "+fecha.toString());
       
        //obtiene la fecha actual
        LocalDate fechaActual=LocalDate.now();
        //calcula diferencia de ambas fecha
        Period periodo=Period.between(fecha, fechaActual);
       //obtiene el numero en años
        int diferencia =periodo.getYears(); 
        int diferenciam=periodo.getMonths();
        System.out.println(" la diferencia  "+diferencia+ " años "+diferenciam+" meses");
       //  diferencia = fecha.getYear() - fechaActual.getYear(); //solo resta entre los años
      //  System.out.println("otro "+diferencia1);
        
    }
}
