package BucleWhileyDoWhile;

import java.util.Scanner;

public class ejercicioWhile40 {
    public static void main(String[] args) {
        /*40. Escribe un programa que pida números al usuario entre 1 al 100 hasta que éste adivine un número que el programa ha elegido al azar. El programa debe ir dando pistas sobre si el número que tiene que adivinar es mayor o es menor que el introducido. El juego termina cuando te rindes (pulsando 0) o adivinas el número. Si se introduce un número fuera del intervalo debe dar un mensaje de error.
         */

        // Variables
        int nroAlazar, nroIngresado;

        // Generar número aleatorio entre 1 y 100
        nroAlazar = (int) (Math.random() * 100 + 1);

        System.out.println("Adivine el número entre 1 y 100: ");
        Scanner sc = new Scanner(System.in);

        // Bucle principal
        do {
            nroIngresado = sc.nextInt();

            // Verificar si el número ingresado está en el rango válido
            if (nroIngresado < 0 || nroIngresado > 100) {
                System.out.println("Error: el número debe estar entre 1 y 100.");
            } else if (nroIngresado == 0) {
                System.out.println("Te has rendido. El número era: " + nroAlazar);
                break; // Terminar si se rinde
            } else if (nroIngresado > nroAlazar) {
                System.out.println("El número a adivinar es menor, prueba con uno más pequeño.");
            } else if (nroIngresado < nroAlazar) {
                System.out.println("El número a adivinar es mayor, prueba con uno más grande.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número.");
            }

            System.out.println("Si te rindes, ingresa 0.");
        } while (nroIngresado != nroAlazar && nroIngresado != 0);
    }
}
