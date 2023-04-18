/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author monte
 */
public class Curso {
    private String nombreCurso;//nombreCurso
    private int cantidadHorasPorDia;//cantidadHorasPorDia
    private int cantidadDiasPorSemana;//cantidadDiasPorSemana
    private String turno;
    private int precioHora;
    private  String[] alumnos=new String[5];


    public Curso() {
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, int precioHora) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioHora = precioHora;
    }

 


    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

 

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public long getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(int precioHora) {
        this.precioHora = precioHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

     public String toString() {
        return "Nombre del curso: " + nombreCurso + "\n" +
               "Cantidad de horas por día: " + cantidadHorasPorDia + "\n" +
               "Cantidad de días por semana: " + cantidadDiasPorSemana+ "\n" +
               "Turno: " + turno + "\n" +
               "Precio por hora: $" + precioHora + "\n" +
               "Alumnos: " + Arrays.toString(alumnos);
    }
  
}
