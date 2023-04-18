/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.extra4nif;

import servicio.NIF;
import servicio.SerNIF;

/**
 *
 * @author monte
 */
public class Extra4NIF {

    public static void main(String[] args) {
        NIF nif=new NIF();
        SerNIF sernif=new SerNIF();
        sernif.crearNIF();
        sernif.mostrar();
    }
}
