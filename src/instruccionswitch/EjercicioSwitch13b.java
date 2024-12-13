package instruccionswitch;

import java.util.Scanner;

public class EjercicioSwitch13b {
    public static void main(String[] args) {
        /*13.  Escribe un programa que lea el número de dirección (1 - arriba, 2 - abajo, 3 - izquierda, 4 - derecha, 0 – no mover) y muestre el texto « subir », o «bajar», o « mover a la izquierda », o« mover a la derecha », o« no mover », según el número introducido). Si es un número que no pertenece a ninguna de las direcciones enumeradas, el programa debería generar: « ¡error! »
         */

        //Variable
        int nroIngresado;

        //Ingresar por teclado
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un nro : ");
        nroIngresado = entrada.nextInt();

        switch (nroIngresado){
            case 1 -> System.out.println("<<subir>>");
            case 2 -> System.out.println("<<bajar>>");
            case 3 -> System.out.println("<<Mover a la Izquierda>>");
            case 4 -> System.out.println("<<Mover a la Derecha>>");
            case 0 -> System.out.println("<<No mover>>");
            default -> System.out.println("<<Error>>");
        }
    }
}
