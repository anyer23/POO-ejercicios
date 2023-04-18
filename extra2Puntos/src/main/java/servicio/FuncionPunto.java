/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.Scanner;

/**
 *
 * @author monte
 */
public class FuncionPunto {
    public void crearPuntos(Puntos punto){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el valor del punto X1");
        punto.setX1(leer.nextDouble());
        System.out.println("Ingrese el valor del punto Y1");
   punto.setY1(leer.nextDouble());
        System.out.println("Ingrese el valor de X2");
        punto.setX2(leer.nextDouble());
        System.out.println("Ingrese el valor de Y2");
        punto.setY2(leer.nextDouble());
    
    }
    
    public double calcularDistanciaPuntos(Puntos punto){
        double distancia=Math.sqrt(Math.pow(punto.getX2()-punto.getX1(),2)+ Math.pow(punto.getY2()-punto.getY2(),2));
        return  distancia;
    }
}
