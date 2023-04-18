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
public class NueCancion {
    Scanner leer =new Scanner(System.in);
    public void ingreseCancion(Cancion can){
        
        System.out.println("ingrese el nombre la cancion ");
        can.setTitulo(leer.nextLine());
        System.out.println("Ingrese el autor de la cancion "+can.getTitulo());
        can.setAutor(leer.nextLine());
    }
    
    public void mostarCancion(Cancion can){
        System.out.println("El titulo de la cancion es '"+can.getTitulo()+"' y el autor es "+can.getAutor());
    }
}
