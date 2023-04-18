/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej8cadena;


import java.util.Scanner;

/**
 *
 * @author monte
 */
public class Ej8Cadena {

    public static void main(String[] args) {
       Cadena cal=new Cadena();
       
        Scanner leer =new Scanner(System.in);
      
       
        System.out.println("ingrese una palabra o frase");
        cal.setFrase(leer.nextLine());
        cal.mostrarVocal();
        
        System.out.println("la frase invertida es ");
        cal.invertirCadena();
        System.out.println("ingrese un caracter, para ver cuantas veces esta repetida");
        String letra=leer.nextLine();
        cal.vecesRepetido(letra);
        System.out.println("Ingrese otra frase");
        String frase1=leer.nextLine();
        cal.compararLongitud(frase1 );
        cal.unirFrases(frase1,cal);
        
        System.out.println("Ingrese el caracter a remplazar");
        String  reemplazo=leer.nextLine();
       // System.out.println("caracter nuevo");
       // String reCa=leer.nextLine();
        cal.reemplazar( reemplazo);
       
        System.out.println("Ingrese la letra a buscar");
        String buletra=leer.nextLine();
        System.out.println("la frase "+cal.contiene(buletra));
       
            
        
    }
}
