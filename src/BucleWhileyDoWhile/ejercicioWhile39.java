package BucleWhileyDoWhile;

import java.util.Scanner;

public class ejercicioWhile39 {
    public static void main(String[] args) {
        /*39. Realizar un ejemplo de menú, donde podemos escoger las distintas opciones hasta que seleccionamos la opción de “Salir”.
         */

        //Variables
        int menu = -1;

        //Scanner
        Scanner sc = new Scanner(System.in);

        //Bucle menu
        while (menu != 0) {

            //Mostrar menu
            System.out.println("Menú: ");
            System.out.println("1. Menú Principal");
            System.out.println("2. Saludo de Bienvenida");
            System.out.println("3. Informacion");
            System.out.println("4. Saludo de despedida");
            System.out.println("0. Salir");
            System.out.println("Seleccione una opcion: ");

            //Leer entrada
            menu = sc.nextInt();

            switch (menu) {
                case 1 -> System.out.println("menu principal");
                case 2 -> System.out.println("Saludo bienvenida");
                case 3 -> System.out.println("Informacion");
                case 4 -> System.out.println("Saludo despedida");
                case 0 -> System.out.println("Saliendo");
                default -> System.out.println("Opcion no valida");
            }
        }

    }
}
