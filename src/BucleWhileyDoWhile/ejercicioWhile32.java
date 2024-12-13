package BucleWhileyDoWhile;

import java.util.Scanner;

public class ejercicioWhile32 {
    public static void main(String[] args) {
        /*32. Escribe un programa que solicite al usuario un número entre 1 y 100, ambos inclusive.
        Si se introduce un número fuera del intervalo debe indicarlo mediante un error y seguir pidiendo
        el número hasta que se introduzca el número en el rango indicado.
        Al terminar debe imprimir por pantalla el número introducido.*/

        // Variable
        int nroIntroducido;

        // Leer
        Scanner entrada = new Scanner(System.in);

        // Bucle
        do {
            System.out.println("Introduzca un nro entero entre 1 y 100 (Ambos inclusive): ");
            nroIntroducido = entrada.nextInt();

            if (nroIntroducido < 1 || nroIntroducido > 100) {
                System.out.println("Error: El número debe estar entre 1 y 100. Intente nuevamente.");
            }

        } while (nroIntroducido < 1 || nroIntroducido > 100);  // Repite mientras esté fuera del rango

        // Imprimir el número introducido válido
        System.out.println("El número introducido es: " + nroIntroducido);
    }
}
