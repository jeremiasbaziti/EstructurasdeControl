package instruccionswitch;

import java.util.Scanner;

public class EjemplosSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige opcion (1-4): ");
        System.out.println("1. Comenzar partida: ");
        System.out.println("2. Cargar partida: ");
        System.out.println("3. Ayuda ");
        System.out.println("4. Salir ");
        int accion=sc.nextInt();

        if (accion==1){
            System.out.println("Comenzando partida");
        } else if (accion==2) {
            System.out.println("Cargando partida guardada");
        } else if (accion==3) {
            System.out.println("mostrando la ayuda");
        } else if (accion==4) {
            System.out.println("Saliendo...");
        } else {
            System.out.println("Accion no prevista, por favor intentalo de nuevo");
        }

        //Switch
        switch (accion){ //(Nombre de la variable)
            case 1://escribimos lo que tiene que hacer en el caso de que accion = 1
                System.out.println("Comenzando partida");
                break;
            case 2:
                System.out.println("Cargando partida guardada");
                break;
            case 3:
                System.out.println("mostrando la ayuda");
                break;
            case 4:
                System.out.println("Saliendo...");
                break;
            default: //En cualquier otro caso
                System.out.println("Accion no prevista, por favor intentalo de nuevo");
        }
    }
}
