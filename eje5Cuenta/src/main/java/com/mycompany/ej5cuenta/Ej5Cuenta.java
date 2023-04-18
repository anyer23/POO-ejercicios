/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej5cuenta;

/**
 *
 * @author monte
 */
public class Ej5Cuenta {

    public static void main(String[] args) {
        Account cue1=new Account();
        cue1.crearCuento();
        cue1.ingreso();
        cue1.retirar();
        cue1.extraccionRapida();
        cue1.consultarSaldo();
        cue1.consultarDatos();
    }
}
