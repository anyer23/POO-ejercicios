/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ej7persona;

/**
 *
 * @author monte
 */
public class Ej7Persona {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.crearPersona(persona1);
        // Persona persona1 = new Persona("juan", 34, 'H', 70, 1.75);
        Persona persona2 = new Persona();
        persona2.crearPersona(persona1);
         //Persona persona2=new Persona("julian", 14, 'H', 60, 1.55);
       Persona persona3 = new Persona();
       persona3.crearPersona(persona1);
         // Persona persona3=new Persona("ana", 36, 'M', 63, 1.56);
        Persona persona4 = new Persona();
        persona4.crearPersona(persona1);
        // Persona persona4=new Persona("maria", 16, 'M', 56, 1.96);

        
        System.out.println(" la persona 1 " + persona1.getNombre()+" su peso " +persona1.getPeso());
        if (persona1.calcularIMC() == -1) {
            System.out.println( persona1.calcularIMC());
            System.out.println("Esta por debajo de su peso ideal");
        }
        if (persona1.calcularIMC() == 0) {
            
            System.out.println("Esta en su peso ideal");
        } else {
            System.out.println("Esta en sobre peso");
        }

       
        
        
        
    }
    
    
    
    
}
