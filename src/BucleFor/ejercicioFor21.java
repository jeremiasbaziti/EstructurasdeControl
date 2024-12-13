package BucleFor;

import java.util.Scanner;

public class ejercicioFor21 {
    public static void main(String[] args) {
        /*21. Hacer el ejercicio anterior, pero sin asumir que el primer número es menor que el segundo. Es decir, pedir dos números enteros por teclado e imprimir la suma de todos los números enteros desde el menor hasta el mayor, ambos inclusive.*/

        //Variables
        int a, b, nroMayo, nroMenor, sumatoria = 0;

        //Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        a = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        b = sc.nextInt();

        //Bucle
        if (a > b) {
            for (int i = b; i <= a ; i++) {
                sumatoria += i;
                System.out.println(i + "-" + sumatoria);
            }
        }else{
            for (int i = a; i <= b ; i++) {
                sumatoria += i;
                System.out.println(i + "-" + sumatoria);
            }
        }

        System.out.println("El total de la suma es de: " + sumatoria);
    }
}
