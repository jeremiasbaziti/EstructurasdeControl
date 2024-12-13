package instruccionswitch;

import java.util.Scanner;

public class EjercicioSwitch15 {
    public static void main(String[] args) {

        //Variable
        int nroIngresado;

        //Ingreso por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero entre 1 y 7: ");
        nroIngresado = sc.nextInt();

        //Switch
        switch (nroIngresado) {
            case 1-> System.out.println("Lunes");
            case 2-> System.out.println("Martes");
            case 3-> System.out.println("Miercoles");
            case 4-> System.out.println("Jueves");
            case 5-> System.out.println("Viernes");
            case 6-> System.out.println("Sabado");
            case 7-> System.out.println("Domingo");
            default -> System.out.println("Error");
        }
    }
}
