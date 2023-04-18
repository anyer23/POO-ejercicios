/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej13curso;

import servicio.Curso;
import servicio.CursoAlu;

/**
 *
 * @author monte
 */
public class Ej13Curso {

    public static void main(String[] args) {
        Curso cu=new Curso();
        CursoAlu cual=new CursoAlu();
        
       // System.out.println("Cargar alumos");
       // cual.cargarAlumnos(cu);
        System.out.println("Cargar curso");
        cual.crearCurso(cu);
        cual.calcularGananciaSemanal(cu);
        
    }
}
