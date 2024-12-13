package Condicional;

import java.util.Scanner;

public class ejercicioIf02 {
    public static void main(String[] args) {
        /*Escribe un programa que pida dos números e indique si el primero es mayor que el segundo o no.*/

        //Declarar variables
        int nro1, nro2;

        //Pedie que los ingrese
        Scanner leerNro = new Scanner(System.in);
        System.out.println("Ingrese el primer nro: ");
        nro1 = leerNro.nextInt();

        Scanner leerNro2 = new Scanner(System.in);
        System.out.println("Ingrese el segundo nro: ");
        nro2 = leerNro2.nextInt();

        if (nro1 > nro2) {
            System.out.println("El primer nro es mayor");
        } else {
            System.out.println("El primer numero no es mayor");
        }
    }
}
