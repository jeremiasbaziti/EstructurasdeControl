package BucleWhileyDoWhile;

import java.util.Scanner;

public class ejercicioWhile36 {
    public static void main(String[] args) {
        /*36. Hacer un programa que imprima por pantalla los veinte primeros múltiplos de 5.*/

        //Variables
        int multiplos, contador = 1;

        while (contador <= 20){
            multiplos = 5 * contador;
            System.out.println("Multiplo nro "+ contador + ": " + multiplos);
            contador++;
        }
    }
}
