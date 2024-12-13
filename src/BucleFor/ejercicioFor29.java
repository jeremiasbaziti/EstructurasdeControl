package BucleFor;

import java.util.Scanner;

public class ejercicioFor29 {
    public static void main(String[] args) {
        /*29. Escribe un programa que, dados dos números, uno real (base) y un entero positivo (exponente), saque por pantalla el resultado de la potencia. No se puede utilizar el método  Math.pow().*/

        //Variables
        int exp, resultado = 1;
        float base;

        //Ingreso por teclado
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Ingrese un nro para el Exponente: ");
        exp = entrada1.nextInt();
        System.out.println("Ingrese un nro para el Base: ");
        base = entrada1.nextFloat();


        //Calculo
        for (int i = 1; i <= exp; i++) {
            resultado *= base;
        }

        System.out.println("La potencia es: " + resultado);
    }
}
