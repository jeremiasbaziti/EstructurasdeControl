package BucleFor;

import java.util.Scanner;

public class ejercicioFor30 {
    public static void main(String[] args) {
        /*30. Realizar un programa que pida números (al arrancar el programa pedirá por teclado la cantidad de números a introducir). El programa debe informar de cuántos números introducidos son mayores que 0, menores que 0 e iguales a 0.*/

        //Variables
        int cantNro, nroActual, nroPos = 0, nroNeg = 0, nroCero = 0;

        //Pedir cantidad de numeros
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantos numeros va a ingresar por teclado");
        cantNro = entrada.nextInt();

        //Pedir numeros
        for (int i = 0; i < cantNro; i++) {
            Scanner entradaNro = new Scanner(System.in);
            System.out.println("Ingresa un numero: ");
            nroActual = entradaNro.nextInt();
            if (nroActual<0) {
                nroNeg += 1;
            } else if (nroActual>0) {
                nroPos += 1;
            }else {
                nroCero += 1;
            }
        }
        System.out.println("Numeros Positivos: " + nroPos + "\nNumeros negativos: " + nroNeg + "\nNumeros iguales a cero: " + nroCero);
    }
}
