package instruccionswitch;

import java.util.Scanner;

public class EjercicioSwitch16 {
    public static void main(String[] args) {
        /*16. Escribe un programa que pida dos números enteros, y pida la operación que quiere realizar con estos (+, -, *, /). El programa debe realizar la operación pedida y visualizar el resultado. En caso de que el símbolo introducido no sea correcto, visualizar: operación incorrecta.
         */

        //Variables
        int nro1, nro2, resultado;
        char operacion;

        //Ingreso por teclado
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        nro1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        nro2 = entrada.nextInt();
        System.out.println("Ingrese el tipo de operacion (+,-,*,/): ");
        operacion = entrada.next().charAt(0);//Lee el primer caracter ingresado

        switch(operacion) {
            case '+':
                resultado = nro1 + nro2;
                System.out.println("El resultado de " + nro1 + " + " + nro2 + " = " + resultado);
                break;
            case '-':
                resultado = nro1 - nro2;
                System.out.println("El resultado de " + nro1 + "-" + nro2 + " = " + resultado);
                break;
            case '*':
                resultado = nro1 * nro2;
                System.out.println("El resultado de " + nro1 + " * " + nro2 + " = " + resultado);
                break;
            case '/':
                resultado = nro1 / nro2;
                System.out.println("El resultado de " + nro1 + "/" + nro2 + " = " + resultado);
                break;
            default:
                System.out.println("Operacion incorrecta");

        }
    }
}
