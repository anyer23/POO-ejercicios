/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.Scanner;

/**
 *
 * @author monte
 */
public class ManejoCuenta {
    ElemtentoCuenta cuentaN=new ElemtentoCuenta();

    Scanner leer=new Scanner(System.in);
    
    public void ingresoCuenta(){
        cuentaN.setCantidadCuenta(1000);
        System.out.println("Ingrese los datos ");
        System.out.println("Ingrese su nombre");
        cuentaN.setNombre(leer.nextLine());
        System.out.println("Ingrese su numero de cuenta");
        cuentaN.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su PIN");
        cuentaN.setNIP(leer.nextInt());
    }
            

    public void depositar(){
        
        System.out.println("Ingrese la cantidad a depositar");
        double depositarCuenta=leer.nextDouble();
        double totalSaldo=depositarCuenta+cuentaN.getCantidadCuenta();
        System.out.println("El saldo final es "+totalSaldo);
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre es "+cuentaN.getNombre());
        System.out.println("El Numero cuenta es "+cuentaN.getNumeroCuenta());
        System.out.println("Cantidad en cuenta "+cuentaN.getCantidadCuenta());
  depositar();
    }
    
    
    
}
