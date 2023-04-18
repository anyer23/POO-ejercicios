/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej6nespresso;

/**
 *
 * @author monte
 */
public class Cafetera {
    public int capacidadMaxima;
    public int cantidadActual;
    
    

    public Cafetera() {
        //capacidadMaxima = 1000;
        //cantidadActual = 0;
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    
    public void llenarCafetera(){
        cantidadActual=capacidadMaxima;
        System.out.println("Se lleno la cafetera al maximo "+cantidadActual);
    }
    
    public void servirTaza(int tamanoTaza){
        if (cantidadActual>=tamanoTaza) {
            cantidadActual-=tamanoTaza;
            System.out.println("Se ha servido una taza de "+tamanoTaza);
        }else{
            int cantidadServida=0;
            System.out.println("NO se ha podido llenar la taza . Se han servido "+cantidadServida +" ml de cafe");
        }
    }
    
    public void vaciarCafetera() {
        cantidadActual=0;
        System.out.println("La cafetera ha sido vaciada");
    }
    
    public void agregarCafe(int cantidad){
        cantidadActual+=cantidad;
        if (cantidadActual>capacidadMaxima) {
            cantidadActual=capacidadMaxima;
            
        }
        System.out.println("Se han agregado "+cantidad+" ml de café en la cafetera");
    }
    
}
