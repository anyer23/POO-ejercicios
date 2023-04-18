/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej9matematica;

import com.mycompany.ej9matematica.ServicioMA.Matematica;
import com.mycompany.ej9matematica.ServicioMA.Operaciones;

/**
 *
 * @author monte
 */
public class Ej9Matematica {

    public static void main(String[] args) {
        Operaciones ope=new Operaciones();
        
        Matematica mt=new Matematica();
        
        mt.setNumero1(Math.random()*10);
        mt.setNumero2(Math.random()*10);
        System.out.println("el numero mayor es "+ope.devolverMayor(mt));
        System.out.println("La potencia es "+ope.calcularPorencia(mt));
        System.out.println("La raiz  es "+ope.calcu7larRaiz(mt));
    }
}
