package BucleFor;

import java.util.Random;

public class ejercicioFor22 {
    public static void main(String[] args) {
        /*22. Hacer un programa que genere 10 números aleatoriamente y calcule su media.*/

        //Variable
        int nroAleatorio, suma = 0;
        double media;

        //Crear obj Random
        Random rand = new Random();

        //Generar nros aleatorio y realizar suma
        System.out.println("Nro aleatorio entre 0 y 15: ");
        for (int i = 0; i < 10; i++) {
            nroAleatorio = rand.nextInt(15);
            suma += nroAleatorio;
            System.out.print(nroAleatorio + "\t");
        }

        System.out.println("\n La suma de los numeros es: " + suma);

        //Calculo de media
        media = suma / 10;
        System.out.println("La media de los numeros es: " + media);
    }
}
