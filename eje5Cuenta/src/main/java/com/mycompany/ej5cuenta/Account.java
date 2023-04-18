/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej5cuenta;

import java.util.Scanner;

/**
 *
 * @author monte
 */
public class Account {
   Cuenta cu1=new Cuenta();
   Scanner leer=new Scanner(System.in);
    public void crearCuento(){
       // 
        
        System.out.println("Ingrese numero de cuenta");
        cu1.setNumeroCuenta(leer.nextInt());        
        System.out.println("Ingrese numero de DNI del cliente");
        cu1.setDniCliente(leer.nextLong());
        System.out.println("Ingrese el saldo");
        cu1.getSaldoActual();leer.nextDouble();
        
       
    }
    
    public void ingreso(){
        System.out.println("Ingrese la cantidad a ingresar");
        cu1.setSaldoActual((int)(cu1.getSaldoActual()+leer.nextDouble()));
        
    }
    
    public void retirar(){
        
        System.out.println("Ingrese la cantidad a retirar");
        double Retiro=leer.nextDouble();
        if (Retiro<=cu1.getSaldoActual()) {
            cu1.setSaldoActual((int) (cu1.getSaldoActual()-Retiro));

        }else{
            cu1.setSaldoActual(0);
        }

    }
    
    public void extraccionRapida(){
        System.out.println("Ingrese una cantidad a retirar ");
        double retiro=leer.nextDouble();
        if (retiro<=.2 * (cu1.getSaldoActual() - retiro)) {
            cu1.setSaldoActual((int) (cu1.getSaldoActual()-retiro));
        }else{
            System.out.println("El retiro supera el 20%");
        }
    }
    
    public void consultarSaldo(){

        System.out.println("Su saldo actual es de "+cu1.getSaldoActual()+" dolares ");
    }
    
    public void consultarDatos() {
        System.out.println("Su DNI de cliente "+cu1.getDniCliente());
        System.out.println("Su numero de cuenta es "+cu1.getNumeroCuenta());
        System.out.println("Su saldo es "+cu1.getSaldoActual());
    }
}
