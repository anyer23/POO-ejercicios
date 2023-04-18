/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poolibro;

import java.util.Scanner;

/**
 *
 * @author monte
 */
public class POOLibro {

    
    public static void main(String[] args) {
        
        //Libro libro1=new Libro();
     
       Scanner leer=new Scanner(System.in);
       Libro l1=new Libro();
        
        System.out.println("ingrese el ISBN");
        l1.ISBM=leer.next();
        System.out.println("Ingres el titulo del libro");
        l1.Titulo=leer.next();
        System.out.println("Ingrese el autor");
       l1.Autor=leer.next();
        System.out.println("ingrese el numero de paginas");
        l1.numeroPaginas=leer.nextInt();
       
        System.out.println(l1.toString());
        
    }


  

    

    
    
   
    

}
