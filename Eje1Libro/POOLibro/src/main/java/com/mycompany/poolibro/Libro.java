/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poolibro;

import java.util.Scanner;

/**
 *
 * @author monte
 */
public class Libro {

    /**
     *
     */
   public String ISBM;
    public String Titulo;
    public String Autor;
    public int numeroPaginas;

    public Libro() {
    }

    public Libro(String ISBM, String Titulo, String Autor, int NumeroDePaginas) {
        this.ISBM = ISBM;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.numeroPaginas = NumeroDePaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBM=" + ISBM + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NumeroDePaginas=" + numeroPaginas + '}';
    }
    
    
}
