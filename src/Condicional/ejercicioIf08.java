package Condicional;

import java.util.Scanner;

public class ejercicioIf08 {
    public static void main(String[] args) {
        /*Escribe un programa que lea un año e indique si es bisiesto.
        Nota: un año es bisiesto si es divisible por 4,
        y no es divisible por 100, excepto que también sea divisible por 400.
         */

        // Variables
        int año;

        // Entrada de año
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un año para determinar si es bisiesto o no: ");
        año = entrada.nextInt();

        // Determinar si es bisiesto
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("El año es bisiesto.");
        } else {
            System.out.println("No es bisiesto.");
        }
    }
}
