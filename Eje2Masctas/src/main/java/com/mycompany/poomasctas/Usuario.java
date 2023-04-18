/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poomasctas;

import java.util.Date;

/**
 *
 * @author monte
 */
public class Usuario {
   public  String nombre;
   public String appellido;
   public int dni;
   public Date nacimiento;
   public String pais;

    public Usuario(String nombre, String appellido, int dni, Date nacimiento, String pais) {
        this.nombre = nombre;
        this.appellido = appellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.pais = pais;
    }
   
   
   
}
