/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej8cadena;

import java.util.Stack;

/**
 *
 * @author monte
 */
public class Cadena {
    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }
    

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud=frase.length();
    }

     public int getLongitud() {
        return longitud;
    }
     
    public void setLongitud(int longitud) {
        this.longitud = frase.length();
    }
    
        public void mostrarVocal(){
        //String spalabra=ca1.getFrase();
        int contador=0;
        String vocales="aeiouAEIOU"; //cadena de vocales en ingles
        for (int i = 0; i < getFrase().length(); i++) {
            char fa=getFrase().charAt(i);
            if (vocales.indexOf(fa)!=-1) {
                contador++;
            }  
        }      
        System.out.println("le frase tiene "+contador+" de vocales");
        
    }
    
    public void invertirCadena(){
        //funcion para invertir 
       String cadenaInvertida="";
       StringBuilder dest = new StringBuilder();
       
        for (int i = frase.length()-1; i >= 0; i--) {
            //1/ invertir cadena usando append()
            //1/ charAt() y append() dentro del bucle for para recuperar 
           //1/y almacenar los caracteres en el objeto StringBuilder.
           dest.append( cadenaInvertida+=frase.charAt(i));
         
          //uso con for/  cadenaInvertida+=frase.charAt(i);    
          
          //2
          
        }
        System.out.println(cadenaInvertida);
 
        /*3
        StringBuilder dest = new StringBuilder(frase);
        dest.reverse();
        System.out.println(dest.toString());
*/
    }
    
    public void vecesRepetido(String letra ){
        int cont=0,pos=0;
        pos=frase.indexOf(letra);
        while (pos!=-1) {
            cont++;
            pos=frase.indexOf(letra,pos+1);
            
        }
        System.out.println("La letra "+ letra+" se repite "+cont);
            
       
               
    }
    
    public void compararLongitud(String frase){
        if (longitud==frase.length()) {
            System.out.println("Tienen la misma longitud");
        }if (longitud<frase.length()) {
            System.out.println("la frase nueva es mas larga");
        }else{
            System.out.println("la frase  nueva es mas corta "+frase);
        }
        
    }
    
    public String  unirFrases(String nfrase,Cadena c1){
        String unir=this.frase+" "+frase;
        
       // System.out.println("La frase resultante es "+unir);
     // return frase.concat(" ").concat(nfrase);
     //String nuvafrase=nfrase.concat(" ").concat();
     return unir;
    }
    
    public String reemplazar(String nletra){
      //String reemplazo = frase.replace(letra.charAt(0), nletra.charAt(0));        String remplaza;
        //System.out.println("la frase reemplazada es "+reemplazo);
     //  return frase.replace("a",nletra);
       String reemplazo=frase.replace("a", nletra);
        System.out.println("La frase resultado es "+reemplazo);
       return reemplazo;
        
    }
    
    public boolean contiene(String letra) {
       // return frase.indexOf(letra.charAt(0)) != -1;
//devuelve el índice, dentro del objeto String que realiza la llamada, de la primera ocurrencia del valor especificado, comenzando la búsqueda desde indiceDesde ; o -1 si no se encuentra dicho valor.
    boolean contle=false;
        for (int i = 0; i < getLongitud(); i++) {
            if (getFrase().subSequence(i, i+1).equals(contle)) {
                contle=true;
            }
        }
        return contle;
    }
}
