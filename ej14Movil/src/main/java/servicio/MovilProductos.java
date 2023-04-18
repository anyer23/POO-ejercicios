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
public class MovilProductos {

    Scanner leer = new Scanner(System.in);

    public void cargarCelular(Movil mo) {

        System.out.println("Ingrese la marca del moviel");
        mo.setMarca(leer.nextLine());
        System.out.println("Ingrese el modelo del moviel");
        mo.setModelo(leer.next());
        System.out.println("Ingrese la cantidad de  memoria RAM");
        mo.setMemoriaRam(leer.nextInt());
        System.out.println("Ingrese la cantidad de alamcenamiento");
        mo.setAlmacenamiento(leer.nextInt());
        System.out.println("Ingrese el precio");
        mo.setPrecio(leer.nextInt());
    }

    public void ingresarCodigo(Movil mo) {
        cargarCelular(mo);
        
        int[] ingresaCodigo = new int[mo.getCodigo().length];
        for (int i = 0; i < mo.getCodigo().length; i++) {
            System.out.println("ingrese el codigo " + (i + 1) + " :");
            ingresaCodigo[i] = leer.nextInt();
        }
    }
     
    public void mostrarInformacion(Movil mo){
        System.out.println("La marca es "+mo.getMarca());
        System.out.println("El modelo es "+mo.getModelo());
        System.out.println("Tiene una RAM de "+mo.getMemoriaRam());
        System.out.println("Capacidad de almacenamiento de "+mo.getAlmacenamiento());
        System.out.println("Su precio es de "+mo.getPrecio());
    }

}
