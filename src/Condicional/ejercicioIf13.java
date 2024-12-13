package Condicional;

import java.util.Scanner;

public class ejercicioIf13 {
    public static void main(String[] args) {
        /*13.  Escribe un programa que lea el número de dirección (1 - arriba, 2 - abajo, 3 - izquierda, 4 - derecha, 0 – no mover) y muestre el texto « subir », o «bajar», o « mover a la izquierda », o« mover a la derecha », o« no mover », según el número introducido). Si es un número que no pertenece a ninguna de las direcciones enumeradas, el programa debería generar: « ¡error! »
         */

        //Declarar variables
        int nroIngresado;

        //Pedir el nro
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número (1 - arriba, 2 - abajo, 3 - izquierda, 4 - derecha, 0 – no mover): ");
        nroIngresado = entrada.nextInt();

        //Condicional
        if (nroIngresado == 1){
            System.out.println("<< subir >>");
        }else if (nroIngresado == 2){
            System.out.println("<< bajar >>");
        }else if (nroIngresado == 3){
            System.out.println("<<mover a la izquierda>>");
        } else if (nroIngresado == 4) {
            System.out.println("<<mover a la derecha>>");
        }else if (nroIngresado == 0){
            System.out.println("<< no mover >>");
        } else {
            System.out.println("<< error >>");
        }
    }
}
