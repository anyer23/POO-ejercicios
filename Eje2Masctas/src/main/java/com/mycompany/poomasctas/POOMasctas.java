/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poomasctas;

import java.util.Scanner;

/**
 *
 * @author monte
 */
public class POOMasctas {

    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        //hacer un objeto
        Mascota m1=new Mascota();
        m1.apodo="Chiquito";
        m1.nombre=leer.next();
        
        m1.tipo="perro";
        m1.edad=14;
        m1.raza="Beagle";
        m1.cola=true;
        m1.color="tricolor";
        
        //imprimir objeto
        System.out.println(m1.apodo+" "+m1.edad);
    }
    
}
