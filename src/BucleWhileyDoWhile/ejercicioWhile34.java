package BucleWhileyDoWhile;

import java.util.Scanner;

public class ejercicioWhile34 {
    public static void main(String[] args) {
        /*34. Escribe un programa que pida números hasta que se introduzca un cero.
        Debe imprimir la suma y la media de todos los números introducidos
        (sin contar el 0 con que finaliza el programa).*/

        // Variables
        int nroIngresado, suma = 0, contador = 0;
        double media;

        Scanner entrada = new Scanner(System.in);

        // Bucle para pedir números hasta que se ingrese un 0
        do {
            System.out.println("Ingrese un número (0 para salir): ");
            nroIngresado = entrada.nextInt();

            if (nroIngresado != 0) {
                contador++;
                suma += nroIngresado;  // Se suma el número ingresado a la variable 'suma'
            }
        } while (nroIngresado != 0);

        // Calcular la media si se ingresaron números
        if (contador != 0) {
            media = (double) suma / contador;  // Convertimos suma a double para precisión
            System.out.println("La suma de los números es: " + suma);
            System.out.println("La media de los números es: " + media);
        } else {
            System.out.println("No se ingresaron números.");
        }
    }
}
