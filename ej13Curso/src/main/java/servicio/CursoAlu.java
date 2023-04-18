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
public class CursoAlu {
    Scanner leer=new Scanner(System.in);
    public void cargarAlumnos(Curso cu){
        
        String[] nombres = new String[cu.getAlumnos().length];
      
        for (int i = 0; i < cu.getAlumnos().length; i++) {
            System.out.print("Ingrese el nombre del alumno "+(i+1)+" : ");
           nombres[i]=leer.next();
        }
        
    }
    
    public void crearCurso(Curso cu){
         
        System.out.println("Ingrese el nombre del curso ");
        cu.setNombreCurso(leer.nextLine());
        System.out.println("Ingrese la cantidad de  horas por dia");
        cu.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de dias por semana ");
        cu.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese el turno (Mañana o Tarde) ");
        cu.setTurno(leer.next());
        System.out.println("Ingrese el precio ");
        cu.setPrecioHora(leer.nextInt());
        cargarAlumnos(cu);
        
    }
     public double calcularGananciaSemanal(Curso cu){
        int cantidadAlumnos=cu.getAlumnos().length;
        double cantidadHorasSemana= cu.getCantidadHorasPorDia()*cu.getCantidadDiasPorSemana();
        double gananciaSemanal=cantidadAlumnos*cantidadHorasSemana*cu.getPrecioHora();
        System.out.println("La ganancia semanal es "+ gananciaSemanal);
        return gananciaSemanal;
        
        
     }
   
}      

