package BucleFor;

import java.util.Scanner;

public class ejercicioFor28 {
    public static void main(String[] args) {
        /*28. Hacer un programa que imprima todos los números múltiplos de 5 entre 1 y n, siendo n un número introducido por el usuario.*/

        //Variables
        int nroIntroducido;

        //Ingreso por teclado
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        nroIntroducido = entrada.nextInt();

        System.out.println("Múltiplos de 5 entre 1 y " + nroIntroducido + ":");
        for (int i = 1; i <= nroIntroducido; i++) {
            if (i % 5 == 0) { // Verificar si el número es múltiplo de 5
                System.out.println(i); // Imprimir el múltiplo de 5
            }
        }
    }
}
