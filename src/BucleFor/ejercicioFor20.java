package BucleFor;

import java.util.Scanner;

public class ejercicioFor20 {
    public static void main(String[] args) {
        /*20. Hacer un programa que pida dos números a y b, enteros, por teclado (se asume que a es menor que b siempre), e imprima la suma de todos los números enteros desde a hasta b, ambos inclusive.*/

        //Variables
        int a, b, sumatoria = 0;

        //Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        a = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        b = sc.nextInt();

        //Bucle
        for (int i = a; i <= b ; i++) {
            sumatoria += i;
            System.out.println(i + "-" + sumatoria);
        }

        System.out.println("El total de la suma es de: " + sumatoria);
    }
}
