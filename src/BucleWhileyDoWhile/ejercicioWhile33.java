package BucleWhileyDoWhile;

import java.util.Scanner;

public class ejercicioWhile33 {
    public static void main(String[] args) {
        /*33. Escribe un programa que cuente la cantidad de números que vamos introduciendo por teclado. Cuando el programa lee 0, debe terminar y mostrar la longitud  de la secuencia (sin contar el 0 final).
         */
        //Variables
        int cantNros = 0, nroIngresado;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese numeros por teclado, y 0 para salir: ");
            nroIngresado = sc.nextInt();

            if (nroIngresado !=0) {//Para no contar el 0 del final
                cantNros++;
            }

        }while (nroIngresado != 0);
        System.out.println("Se han ingresado "+cantNros+" nros");
    }
}
