package Condicional;

import java.util.Scanner;

public class ejercicioIf01 {
    public static void main(String[] args) {
        /*Escribe un programa que pida un número e indique si es par o impar (un número es par si al dividirlo entre 2 el resto es 0).
         */

        //Declarar variables
        int nro,resultado;

        //Proceso de ingreso por teclado
        Scanner nroLeido = new Scanner(System.in);
        System.out.println("Ingrese un nro entero: ");
        nro = nroLeido.nextInt();

        //Calcular el resultado
        resultado = nro%2;

        //Condicional If
        if(resultado==0){
            System.out.println("El numero ingresado es par");
        }else {
            System.out.println("El numero ingresado es impar");
        }
    }
}
