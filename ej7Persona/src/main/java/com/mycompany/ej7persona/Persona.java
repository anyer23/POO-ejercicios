/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej7persona;

import java.util.Scanner;

/**
 *
 * @author monte
 */
public class Persona {
    public String nombre;
    public int edad;
    public char sexo;
    public double peso;
    public double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void crearPersona(Persona pe){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre=leer.nextLine();
        System.out.println("Ingrese su edad");
        edad=leer.nextInt();
      
         

                   
            System.out.println("Ingrese su sexo H/M/O");
           sexo=leer.next().charAt(0);
             while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("Sexo incorrecto, ingrese  (H,M,O)");
            sexo = leer.next().charAt(0);
             }
           /*
            if ((se.toLowerCase().equals("H")) || (se.toLowerCase().equals("M"))||(se.toLowerCase().equals("O"))) {
                se+=se;
                break;
            }else{
                System.out.println("Informacion incorrecta, debe de ingresar H(hombre), m(mujer), o(otro)");
            }*/
       
        System.out.println("Ingrese su peso");
        peso=leer.nextDouble();
        System.out.println("Ingrese su altura");
        altura=leer.nextDouble();
    }
    
    public double calcularIMC(){
        double idial=peso/Math.pow(altura, 2);
        if (idial<20) {
           // System.out.println(idial);
            return -1;
            
        }if (idial>20 && idial<25) {
          // System.out.println(idial);
            return 0;
        }
     //  System.out.println(idial);
        return 1;
    }
    
    public double esMayorDeEdad(){
        double mayor=edad;
        if (mayor<18) {
            System.out.println("Es menor de edad");
        }
        System.out.println("Es mayor de edad");
        return mayor;
    }
}
