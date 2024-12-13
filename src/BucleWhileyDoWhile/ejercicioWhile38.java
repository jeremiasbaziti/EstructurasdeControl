package BucleWhileyDoWhile;

import java.util.Scanner;

public class ejercicioWhile38 {
    public static void main(String[] args) {
        /*38. Hacer un programa que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso contrario, el programa termina cuando se introduce un espacio.
         */

        //Variables
        char letras;
        String vocales = "aeiouAEIOU";

        //Scanner
        Scanner sc = new Scanner(System.in);

        //Bucle
            do{
                System.out.println("Digite un caracter, o espacio para salir: ");
                letras = sc.next().charAt(0);//Lee el primer caracter de entrada
        
                //Verificar si el caracter ingresado es un espacio
                if (letras == ' ') {
                    break;
                }

                //Verificar si es vocal
                if(vocales.indexOf(letras) != -1){
                    System.out.println("Es vocal");
                }else {
                    System.out.println("No es vocal");
                }
            }while (letras != ' ');
    }
}
