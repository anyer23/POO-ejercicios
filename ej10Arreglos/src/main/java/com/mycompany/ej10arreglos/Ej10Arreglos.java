/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ej10arreglos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author monte
 */
public class Ej10Arreglos {

    public static void main(String[] args) {
        double A[] = new double[50];
        double B[] = new double[20];
        Random alea = new Random();
       
        //inicializa arreglo a
        for (int i = 0; i < A.length; i++) {

            //A[i] = alea.nextDouble() * 10/10;
            A[i] = Math.round(alea.nextDouble() * 100) ;
        }

        System.out.println("Array original ");
        //moatrar arreglo a con toString
        for (int i = 0; i < A.length; i++) {
            System.out.print( A[i] +" ");
        }
        
        System.out.println("");
        System.out.println(" Array ordenado");
        Arrays.sort(A);
        
        System.out.println(Arrays.toString(A));

        for (int i = 1; i < B.length; i++) {
            // B[i]=0.5;
            if (i < 10) {
                B[i] = A[i];

            } else {
                B[i] = 0.5;
            }
        }

        System.out.println("Array B combinado " );
        
        System.out.print(Arrays.toString(B));
    }

}
