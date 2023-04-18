/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cuenta;

import Servicio.ElemtentoCuenta;
import Servicio.ManejoCuenta;

/**
 *
 * @author monte
 */
public class Cuenta {

    public static void main(String[] args) {
       ElemtentoCuenta eleCuenta=new ElemtentoCuenta();
       ManejoCuenta maneCuenta=new ManejoCuenta();
       
       maneCuenta.ingresoCuenta();
       maneCuenta.mostrarDatos();
       
    }
}
