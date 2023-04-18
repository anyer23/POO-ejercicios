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
public class Ecuacion {

    public void crearValores(Raices raiz) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de a");
        raiz.setA(leer.nextDouble());
        System.out.println("Ingrese el valor de b");
        raiz.setB(leer.nextDouble());
        System.out.println("Ingrese el valor de c");
        raiz.setC(leer.nextDouble());
    }

    public double getDiscriminante(Raices raiz) {
        return Math.pow(raiz.getB(), 2) - 4 * raiz.getA() * raiz.getC();

    }

    public boolean tieneRaices(Raices raiz) {

        return getDiscriminante(raiz) >= 0;

    }

    public boolean tieneRaiz(Raices raiz) {
        return getDiscriminante(raiz) == 0;
    }

    public boolean obtenerRaices(Raices raiz) {
        boolean ora=tieneRaices(raiz);
        if (ora==true) {
            double x1 = (-raiz.getB() + Math.sqrt(getDiscriminante(raiz))) / (2 * raiz.getA());
            double x2 = (-raiz.getB() - Math.sqrt(getDiscriminante(raiz))) / (2 * raiz.getA());
            System.out.println("las raices de la ecuacion son ");
            System.out.println("x1 " + x1);
            System.out.println("x2 " + x2);
        } else {
            System.out.println("La eacucion no tiene raices");
        }
        return ora;
    }

    public boolean obtenerRaiz(Raices raiz){
       boolean teraiz= tieneRaiz(raiz);
        if (teraiz==true) {
            System.out.println("La unica solucion es ");
            System.out.println("X= "+teraiz);
        }
        return  teraiz;
    }
    
    public void calcular(Raices raiz){
        if (tieneRaices(raiz)) {
            obtenerRaices(raiz);
        }else if (tieneRaiz(raiz)){
            obtenerRaiz(raiz);
        }
    }
}
