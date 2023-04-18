/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

/**
 *
 * @author monte
 */
public class Ahorcado {

    private String palabra[];//vector con la palabra a busca
   private String[] palabraAux;
    int LetrasEncontradas;//cantEncontradas letras encontradas
    private int CanJugadasMaximas;//cantidad de jugadas maximas 
    int intentosRestantes;//cantEJugadas oportunidades restantes
   

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int LetrasEncontradas, int CanJugadasMaximas, int intentosRestantes, String[] palabraAux) {
        this.palabra = palabra;
        this.LetrasEncontradas = LetrasEncontradas;
        this.CanJugadasMaximas = CanJugadasMaximas;
        this.intentosRestantes = intentosRestantes;
        this.palabraAux = palabraAux;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return LetrasEncontradas;
    }

    public void setLetrasEncontradas(int LetrasEncontradas) {
        this.LetrasEncontradas = LetrasEncontradas;
    }

    public int getCanJugadasMaximas() {
        return CanJugadasMaximas;
    }

    public void setCanJugadasMaximas(int CanJugadasMaximas) {
        this.CanJugadasMaximas = CanJugadasMaximas;
    }

    public int getIntentosRestantes() {
        return intentosRestantes;
    }

    public void setIntentosRestantes(int intentosRestantes) {
        this.intentosRestantes = intentosRestantes;
    }

    public String[] getPalabraAux() {
        return palabraAux;
    }

    public void setPalabraAux(String[] palabraAux) {
        this.palabraAux = palabraAux;
    }


    

}
