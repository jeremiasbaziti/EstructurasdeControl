package Condicional;

import java.util.Scanner;

public class ejercicioIf11 {
    public static void main(String[] args) {
        /* El director de una escuela está organizando un viaje de estudios, y quiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente:
            a. si son 100 alumnos o más, el costo por cada alumno es de 65 euros;
            b. de 50 a 99 alumnos, el costo es de 70 euros,
            c. de 30 a 49, de 95 euros,
            d. y si son menos de 30, el costo del alquiler del autobús es de 4000 euros, sin importar el número de alumnos.
            Escribe un programa que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje, si nos dicen el número de alumnos que van de viaje.
         */

        // Variables
        int cantAlumnos, costoPorAlumno = 0, totalPagarCompañia;

        // Pedido de datos
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de alumnos que van a ir al viaje de estudios: ");
        cantAlumnos = entrada.nextInt();

        // Cálculo del costo por alumno según el número de alumnos
        if (cantAlumnos >= 100) {
            costoPorAlumno = 65;
        } else if (cantAlumnos >= 50) {
            costoPorAlumno = 70;
        } else if (cantAlumnos >= 30) {
            costoPorAlumno = 95;
        } else {
            // Si son menos de 30 alumnos, el costo total es fijo (4000€) y se divide entre los alumnos.
            totalPagarCompañia = 4000;
            costoPorAlumno = totalPagarCompañia / cantAlumnos;
            System.out.println("El total a pagar a la compañía es de: " + totalPagarCompañia + " euros.");
            System.out.println("El costo por alumno es de: " + costoPorAlumno + " euros.");
            return; // Finalizar aquí ya que no es necesario continuar con el resto de cálculos.
        }

        // Cálculo del total a pagar a la compañía
        totalPagarCompañia = cantAlumnos * costoPorAlumno;

        // Mostrar resultados
        System.out.println("El costo por alumno es de: " + costoPorAlumno + " euros.");
        System.out.println("El total a pagar a la compañía es de: " + totalPagarCompañia + " euros.");
    }
}
