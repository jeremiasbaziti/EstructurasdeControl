package Condicional;

import java.util.Random;
import java.util.Scanner;

public class ejercicioIf14 {
    public static void main(String[] args) {
        //14.  Realiza un programa que genere letras aleatoriamente y determine si son vocales o consonantes.

        //variables
        String consonantes = "bcdfghjklmnñpqrstvwxyz";
        String vocales = "aeiou";
        String todasLasLetras = vocales + consonantes;
        char letraAleatoria;

        //Crear el objeto random
        Random rand = new Random();

        //Generar indice aleatorio
        int indiceAleatorio = rand.nextInt(todasLasLetras.length());

        //Obtener la letra aleatoria
        letraAleatoria = todasLasLetras.charAt(indiceAleatorio);
        //Determinar que tipo de letra es
        if (vocales.indexOf(letraAleatoria) != -1) {
            System.out.println("La letra ingresada es: " + letraAleatoria + ", y es una vocal");
        }else {
            System.out.println("La letra ingresada es: " + letraAleatoria + ", y es una consonante");
        }

    }
}
