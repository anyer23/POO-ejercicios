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
public class MesSecreto {
    String mes[]={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
   Scanner leer=new Scanner(System.in);
    //primera forma
    /*
    String mesSecreto=mes[6-1];
    String mesTeclado;
    public void adivinaMes(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un mes del año");
        while (mesSecreto==mes[6-1]) {
            mesTeclado=leer.nextLine();
            if (mesTeclado.equals(mesSecreto)) {//se ve si son iguales
                System.out.println("¡Ha acertado!");
                break;
            }else{
                System.out.println("No acerto. Intente de nuevo");
            }
        }
    }
*/
    public void adivinaMes(){
        int randonMes=(int)(Math.random()*12);
        String mesSecreto=mes[randonMes];
        String mesTeclado="";
        while (!mesTeclado.equals(mesSecreto)) {
            System.out.println("Adivine el mes ");
            mesTeclado=leer.nextLine();
            if (mesTeclado.equals(mesSecreto)) {
                System.out.println("¡Ha acertado!");
            }else{
                System.out.println("No ha acertado. Intente otra vez");
            }
        }
    }
    
}
