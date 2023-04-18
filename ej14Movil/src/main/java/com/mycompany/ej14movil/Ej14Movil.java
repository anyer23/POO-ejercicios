/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej14movil;

import servicio.Movil;
import servicio.MovilProductos;

/**
 *
 * @author monte
 */
public class Ej14Movil {

    public static void main(String[] args) {
        Movil mo=new Movil();
        MovilProductos mopo=new MovilProductos();
        
        mopo.ingresarCodigo(mo);
        mopo.mostrarInformacion(mo);
    }
}
