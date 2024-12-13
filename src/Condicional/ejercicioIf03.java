package Condicional;

import java.util.Scanner;

public class ejercicioIf03 {
    public static void main(String[] args) {
        /*Escribe un programa que pide 5 números por teclado y al concluir escribe el mayor y menor de ellos (sin utilizar for).*/

        // Declarar variables
        int nro1, nro2, nro3, nro4, nro5, mayorTemp, minTemp;

        // Ingresar números
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer número entero: ");
        nro1 = entrada.nextInt();

        System.out.println("Ingrese el segundo número entero: ");
        nro2 = entrada.nextInt();

        System.out.println("Ingrese el tercer número entero: ");
        nro3 = entrada.nextInt();

        System.out.println("Ingrese el cuarto número entero: ");
        nro4 = entrada.nextInt();

        System.out.println("Ingrese el quinto número entero: ");
        nro5 = entrada.nextInt();

        // Asignamos el primer número como punto de partida
        mayorTemp = nro1;
        minTemp = nro1;

        // Comparar mayores
        if (nro2 > mayorTemp) {
            mayorTemp = nro2;
        }
        if (nro3 > mayorTemp) {
            mayorTemp = nro3;
        }
        if (nro4 > mayorTemp) {
            mayorTemp = nro4;
        }
        if (nro5 > mayorTemp) {
            mayorTemp = nro5;
        }

        // Comparar menores
        if (nro2 < minTemp) {
            minTemp = nro2;
        }
        if (nro3 < minTemp) {
            minTemp = nro3;
        }
        if (nro4 < minTemp) {
            minTemp = nro4;
        }
        if (nro5 < minTemp) {
            minTemp = nro5;
        }

        // Mostrar el mayor y el menor
        System.out.println("El mayor número ingresado es: " + mayorTemp);
        System.out.println("El menor número ingresado es: " + minTemp);
    }
}