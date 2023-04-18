/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.extra1cancion;

import servicio.Cancion;
import servicio.NueCancion;

/**
 *
 * @author monte
 */
public class Extra1Cancion {

    public static void main(String[] args) {
        Cancion can=new Cancion();
        NueCancion nuCan=new NueCancion();
        nuCan.ingreseCancion(can);
        
        nuCan.mostarCancion(can);
    }
}
