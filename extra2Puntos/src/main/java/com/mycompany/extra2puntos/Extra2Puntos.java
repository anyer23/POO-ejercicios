/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.extra2puntos;

import servicio.FuncionPunto;
import servicio.Puntos;

/**
 *
 * @author monte
 */
public class Extra2Puntos {

    public static void main(String[] args) {
       Puntos npunto=new Puntos();
       FuncionPunto fpunto=new FuncionPunto();
       
       
       fpunto.crearPuntos(npunto);
        System.out.println("La distancia entre los puntos es "+fpunto.calcularDistanciaPuntos(npunto));
    }
}
