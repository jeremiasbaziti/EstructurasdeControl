package BucleFor;

import java.util.Scanner;

public class ejercicioFor27 {
    public static void main(String[] args) {
        /*27. Hacer un programa que calcule el factorial de un número pedido por teclado. (Ejemplo: el factorial de 5 sería 5 * 4 * 3 * 2 * 1; el de 4 sería 4* 3 * 2 * 1, etc.)
         */

        //Variables
        int factorial = 1, nroIngresado;

        //Ingresar por teclado
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero para calcular su factorial: ");
        nroIngresado = entrada.nextInt();

        //Calcular Factorial
        for (int i = 1; i <= nroIngresado ; i++) {
            factorial *= i;
            System.out.println(factorial + " " + i);
        }

        System.out.println("El factorial de " + nroIngresado + " es: " + factorial);
    }
}
