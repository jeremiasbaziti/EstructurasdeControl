package Condicional;

import java.util.Scanner;

public class ejerciciosIf06 {
    public static void main(String[] args) {
        /*Escribe un programa que pida tres números y los muestre ordenados (de menor a mayor).
         */

        //Variables
        int nro1, nro2, nro3;
        int mayor, menor, intermedio;

        //Ingresar por pantalla
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer nro: ");
        nro1 = sc.nextInt();
        System.out.println("Ingrese el segundo nro: ");
        nro2 = sc.nextInt();
        System.out.println("Ingrese el tercer nro: ");
        nro3 = sc.nextInt();

        //Determinar el mayor
        mayor = nro1;
        menor = nro1;

        //identificar el numero mayor
        if (nro1 > nro2 && nro1 > nro3) {
            mayor = nro1;
        } else if (nro2 > nro2 && nro2 > nro3) {
            mayor = nro2;
        }else{
            mayor = nro3;
        }

        //identificar el numero menor
        if (nro1 < nro2 && nro1 < nro3) {
            menor = nro1;
        } else if (nro2<nro1 && nro2 < nro3) {
            menor = nro2;
        }else{
            menor = nro3;
        }

        //Identificar intermedio
        if (nro1>menor && nro1<mayor) {
            intermedio = nro1;
        } else if (nro2>menor && nro2<mayor) {
            intermedio = nro2;
        }else {
            intermedio = nro3;
        }

        System.out.println("Los numeros ordenados de menor a mayor son: " + menor + "," + intermedio + "," + mayor);
    }
}
