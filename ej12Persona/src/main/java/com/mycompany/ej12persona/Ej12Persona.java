/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej12persona;

import java.util.Scanner;
import servicio.Persona;

/**
 *
 * @author monte
 */
public class Ej12Persona {

    public static void main(String[] args) {
        Persona pe=new Persona();
        Scanner leer=new Scanner(System.in);
        pe.crearPersona();
        System.out.println("La edad es ");
        //pe.calcularEdad(LocalDate.MIN);
        
          System.out.println("Ingrese la edad de otra persona");
        int edadOtro=leer.nextInt();
        
       pe.menorQue(edadOtro);
        
        
        pe.mostrarPersona();
      
    }
}
