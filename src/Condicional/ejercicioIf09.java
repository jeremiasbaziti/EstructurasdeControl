package Condicional;

import java.util.Scanner;

public class ejercicioIf09 {
    public static void main(String[] args) {
        /*Escribe un programa que pida una fecha (día, mes y año) y diga si es correcta o no. Suponemos que el año no es bisiesto. Ejemplo: 1-1-2001. Para que sea correcta, el año tiene que ser mayor que 0, el mes debe estar entre 1 y 12. Y el día según el mes que sea estará entre 1 y 31, o entre 1 y  30, o entre 1 y 28.*/

        //Variables
        int dia, mes, año;
        boolean fechaValida = true; //Indica si una fechas valida o no


        //Scanner para la entrada de datos
        Scanner entrada = new Scanner(System.in);

        //Ingreso de datos por teclado
        System.out.print("Ingrese un dia: ");
        dia = entrada.nextInt();

        System.out.print("Ingrese un mes: ");
        mes = entrada.nextInt();

        System.out.print("Ingrese un año: ");
        año = entrada.nextInt();

        //Comprobar si la fecha es valida
        if (año <= 0) {
            fechaValida = false;
        }

        if (mes < 1 || mes > 12) {
            fechaValida = false;
        }

        if (fechaValida) {
            if (mes == 2) {//febrero, 28 dias (no bisiesto)
                if (dia < 1 || dia > 28) {
                    fechaValida = false;
                } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {//Meses de 30 dias
                    if (dia< 1 || dia > 30) {
                        fechaValida = false;
                    }
                }else {//meses de 31 dias
                    if (dia < 1 || dia > 31) {
                        fechaValida = false;
                    }
                }

            }
        }

        //Imprimir  si la fecha es correcta o no

        if (fechaValida) {
            System.out.println("La fecha es valida: "+ dia + "-" + mes + "-" + año);
        }else {
            System.out.println("La fecha no es valida");
        }
    }
}
