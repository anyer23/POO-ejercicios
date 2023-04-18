/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej9matematica.ServicioMA;

/**
 *
 * @author monte
 */
public class Operaciones {
    public double devolverMayor(Matematica ma){
        if (ma.getNumero1()<ma.getNumero2()) {
            return ma.getNumero2();
        }else{
            return ma.getNumero1();
        }
        
            
        
    }
    
    public double calcularPorencia(Matematica ma){
        if (ma.getNumero1()<ma.getNumero2()) {
            return Math.pow(ma.getNumero1(), 2)*100d/100d;
        }else{
            //*100d/100d
           return Math.pow(ma.getNumero2(),2)*100d/100d;
        }
    }
    
    public  double calcu7larRaiz(Matematica ma){
        if (ma.getNumero1()<ma.getNumero2()) {
            return  Math.sqrt(Math.abs(ma.getNumero1()));
        }else{
             return  Math.sqrt(Math.abs(ma.getNumero2()));
       
             
        }
        
    }
    
}
