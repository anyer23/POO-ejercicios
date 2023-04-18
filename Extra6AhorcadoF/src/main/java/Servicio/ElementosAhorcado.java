/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author monte
 */
public class ElementosAhorcado {

    Ahorcado ahorca = new Ahorcado();

    Scanner leer = new Scanner(System.in);

    public void crearJuego() {

        System.out.println("Ingrese la palabra");
        String frase = leer.next().toLowerCase();
        
        
       
        System.out.println("Ingrese cantidad de jugadas permitidas");

        
        ahorca.setCanJugadasMaximas(leer.nextInt());
        ahorca.setLetrasEncontradas(0);
        ahorca.setPalabra(new String[frase.length()]);
        ahorca.setPalabraAux(new String[frase.length()]);
        
        for (int i = 0; i < frase.length(); i++) {
            ahorca.getPalabra()[i] = frase.substring(i, i + 1);
            ahorca.getPalabraAux()[i] = "_";
        }
        
    }

    public void longitud() {
        System.out.println("Longitud de la palabra :" + ahorca.getPalabra().length);
    }

    public boolean buscarletra(String letra) {
        int cont = 0;
        boolean band = false;
        for (int i = 0; i < ahorca.getPalabra().length; i++) {
            if (ahorca.getPalabraAux()[i].equals(letra)) {
                cont++;
                band = true;
            }
        }
        if (cont == 0) {
            System.out.printf("La letra no pertenece a la palabra: %s \n", letra);

        } else {

            System.out.printf("La letra  si esta en la palabra: %s veces repetidas %d  \n", letra, cont);

        }
        return band;
    }

    public void encotradas(String letra) {
        boolean band = false;
        // boolean band = buscarletra(letra);

        for (int i = 0; i < ahorca.getPalabra().length; i++) {
            if (ahorca.getPalabra()[i].equals(letra)) {
                if (ahorca.getPalabraAux()[i].equals("_")) {
                    ahorca.getPalabraAux()[i] = letra;
                    ahorca.LetrasEncontradas++;
                }

            }
            band = true;

        }
        if (band != true) {
            // ahorca.setIntentosRestantes(-1);
            ahorca.setCanJugadasMaximas(ahorca.getCanJugadasMaximas() - 1);
        }

    }

    public void intentos(String letra) {
        boolean show = buscarletra(letra);
        if (!show) {
            ahorca.setCanJugadasMaximas(ahorca.getCanJugadasMaximas() - 1);
            System.out.printf("Le quedan intentos: %d \n", ahorca.getCanJugadasMaximas());

        }

    }

    public void mostrarAhorcado() {
        for (int i = 0; i < ahorca.getPalabraAux().length; i++) {
            System.out.print(ahorca.getPalabraAux()[i] + " ");
        }
        System.out.println("");
    }

    public void dibujarAhorcado() {
        int intentosRestantes = ahorca.getCanJugadasMaximas();
        switch (intentosRestantes) {
            case 6:
                System.out.println("___________");
                System.out.println("|    |    |");
                System.out.println("|         | ");
                System.out.println("|         | ");
                System.out.println("|         | ");
                System.out.println("|         | ");
                System.out.println("|_________|");
                break;
            case 5:
                System.out.println("___________");
                System.out.println("|    |    |");
                System.out.println("|    0    | ");
                System.out.println("|         | ");
                System.out.println("|         | ");
                System.out.println("|         | ");
                System.out.println("|_________|");
                break;
            case 4:
                System.out.println("___________");
                System.out.println("|    |    |");
                System.out.println("|    0    | ");
                System.out.println("|    |    | ");
                System.out.println("|         | ");
                System.out.println("|         | ");
                System.out.println("|_________|");
                break;
            case 3:
                System.out.println("___________");
                System.out.println("|    |    |");
                System.out.println("|    0    | ");
                System.out.println("|   /|    | ");
                System.out.println("|         | ");
                System.out.println("|         | ");
                System.out.println("|_________|");
                break;
            case 2:
                System.out.println("___________");
                System.out.println("|    |    |");
                System.out.println("|    0    | ");
                System.out.println("|  / | \\  | ");
                System.out.println("|         | ");
                System.out.println("|         | ");
                System.out.println("|_________|");
                break;
            case 1:
                System.out.println("___________");
                System.out.println("|    |    |");
                System.out.println("|    0    | ");
                System.out.println("| /  | \\  | ");
                System.out.println("|    |    | ");
                System.out.println("|  /      | ");
                System.out.println("|_________|");
                break;
            case 0:
                System.out.println("___________");
                System.out.println("|    |    |");
                System.out.println("|    O    | ");
                System.out.println("|  / | \\  | ");
                System.out.println("|    |    | ");
                System.out.println("|   / \\   | ");
                System.out.println("|_________|");
                break;
            default:
                break;
        }

    }

    public void juego() {
        String letra;
        crearJuego();
        do {

            mostrarAhorcado();

            System.out.println("Ingrese una letra a buscar");
            letra = leer.next();
            mostrarAhorcado();
            intentos(letra);

            longitud();
            //buscarletra(letra);
            encotradas(letra);
            dibujarAhorcado();
            System.out.println("Numero de letras encontradas :" + ahorca.LetrasEncontradas);

            System.out.println("Numero de letras faltantes :" + (ahorca.getPalabra().length - ahorca.LetrasEncontradas));

            if (ahorca.getCanJugadasMaximas() <= 0) {
                System.out.println("palabra no encontrada");
                break;
            }
            if (ahorca.LetrasEncontradas == ahorca.getPalabra().length) {
                System.out.println("Palabra encontrada");

                break;
            }

            //
        } while (ahorca.intentosRestantes >= 0 || ahorca.LetrasEncontradas <= ahorca.getPalabra().length);

    }
}
