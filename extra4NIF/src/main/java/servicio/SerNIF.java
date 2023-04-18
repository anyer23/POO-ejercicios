/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.Scanner;

/**
 *
 * @author monte
 */
public class SerNIF {

    private final char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    NIF nif0 = new NIF();
    Scanner leer = new Scanner(System.in);

    //Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
    //corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
    //resultado del calculo.
    public void crearNIF(){
        System.out.println("Ingrese su numero de DNI");
        nif0.setDNI(leer.nextLong());
        nif0.setLetra(calcularLetra(nif0.getDNI()));
        System.out.println("NIF creado correctamente "+nif0.getDNI()+" - "+nif0.getLetra());
    }
    
    public char calcularLetra(long dni){
        int division=(int)(dni%23);
        return letras[division];
    }
    
    public void mostrar(){
        //String.format() es "%08d", que indica que el número del DNI debe tener 8 dígitos y rellenarse con ceros a la izquierda en caso de tener menos dígitos.
        System.out.println(String.format("%08d", nif0.getDNI()) + "-" + nif0.getLetra());
    }
}
