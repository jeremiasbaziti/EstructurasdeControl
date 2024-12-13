package Condicional;

import java.util.Scanner;

public class ejerciciosIf07 {
    public static void main(String[] args) {
        /* A las marmotas les gusta organizar fiestas, y en sus fiestas les gusta comer tazas de mantequilla de cacahuete.
           Una fiesta de la marmota exitosa tiene entre 10 y 20 tazas de mantequilla de cacahuete,
           ambas inclusive, a menos que sea fin de semana, en cuyo caso necesitarán de 15 a 25 tazas.

           Escribe un programa que lea dos valores:
           - El primero es el número de tazas de mantequilla de cacahuete que hay en la fiesta.
           - El segundo es un booleano que indica si es fin de semana.
           El programa debe imprimir si la fiesta tiene éxito o no (true o false).
        */

        // Variables
        int tazas;
        boolean finDeSemana, esExitosa = false;

        // Ingreso por teclado
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de tazas de mantequilla de cacahuete: ");
        tazas = entrada.nextInt();
        System.out.print("Ingrese 'true' si es fin de semana o 'false' si es día de semana (Lunes-Viernes): ");
        finDeSemana = entrada.nextBoolean();

        // Determinar si la fiesta es exitosa
        if (finDeSemana && tazas >= 15 && tazas <= 25) {
            esExitosa = true;
        } else if (!finDeSemana && tazas >= 10 && tazas <= 20) {
            esExitosa = true;
        }

        // Mostrar el resultado
        System.out.println("¿La fiesta es exitosa? " + esExitosa);
    }
}
