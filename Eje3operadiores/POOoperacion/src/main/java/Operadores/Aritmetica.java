/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operadores;

import com.mycompany.poooperacion.Operacion;
import java.util.Scanner;

/**
 *
 * @author monte
 */
public class Aritmetica {
    
  
    public Operacion crearOperacion(Operacion op1) {
        //Operacion crearOperacion de tipo objeto operacion
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese el valore de numero  1");
        op1.setNumero1(leer.nextDouble()); 
        System.out.println("ingrese el valore de numero  2");
        op1.setNumero2(leer.nextDouble());
    return op1;
    } 
    
    
    public  double sumar(Operacion op1){
        return op1.getNumero1()+op1.getNumero2();
    }

    public double resta(Operacion op1){
        return op1.getNumero1()-op1.getNumero2();
    }
    
    public double multiplicacion(Operacion op1){
        if (op1.getNumero1()==0 || op1.getNumero2()==0) {
            System.out.println("Error no se puede multilicar por cero");
            return 0;
        } else{
        return op1.getNumero1()*op1.getNumero2() ;
        }
    }
    
    public double dividir(Operacion op1){
        if (op1.getNumero1()==0 || op1.getNumero2()==0) {
            System.out.println("Error no se puede multipliccar por cero");
            return 0;
        }else{
            return op1.getNumero1()/op1.getNumero2();
        }
    }
}
