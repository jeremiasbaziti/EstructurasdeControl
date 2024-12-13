package instruccionswitch;

import java.util.Scanner;

public class EjercicioSwitch17 {
    public static void main(String[] args) {
        /*17. Escribe un programa que responda a un usuario que quiere comprar un helado en una conocida marca de comida rápida cuánto le costará en función del topping que elija.
    El helado sin topping cuesta 1.90€.
    El topping de oreo cuesta 1€.
    El topping de KitKat cuesta 1.50€.
    El topping de brownie cuesta 0.75€.
    El topping de lacasitos cuesta 0.95€.
    En caso de no disponer del topping solicitado por el usuario el programa escribirá por pantalla «no tenemos este topping, lo sentimos. » y a continuación informará del precio del helado sin ningún topping.
    Finalmente, el programa escribe por pantalla el precio del helado resultante*/

        //Variables
        int nroTopping;

        //Pedido de Topping por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número del topping que desee. \n1. Sin topping \n2. De oreo\n3. De Kit-Kat\n4. De Brownie\n5. De Lacasitos");
        nroTopping = sc.nextInt();

        //Distintos casos
        switch (nroTopping){
            case 1 -> System.out.println("1.90€");
            case 2 -> System.out.println("1€");
            case 3 -> System.out.println("1.50€");
            case 4 -> System.out.println("0.75€");
            case 5 -> System.out.println("0.95€");
            default -> System.out.println("<<No tenemos este topping, lo sentimos.\n Precio sin topping: 1.90€ ");
        }
    }
}
