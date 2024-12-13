package BucleWhileyDoWhile;

import java.util.Scanner;

public class ejercicioWhile35 {
    public static void main(String[] args) {
        /*35. Dada una secuencia de números enteros (que finaliza con el número 0), encuentra el elemento más grande de la secuencia. El número 0 no está incluido en la secuencia, sólo se utiliza para finalizar el programa. Los números son introducidos por teclado.
         */

        //Variables
        int mayor = 0, nroIngresado;

        //Scaner
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("Ingrese un numero: ");
            nroIngresado = entrada.nextInt();

            if (nroIngresado != 0) {
                if (nroIngresado > mayor) {
                    mayor = nroIngresado;
                }
            }
        }while (nroIngresado != 0);

        System.out.println("El mayor es " + mayor);
    }
}
