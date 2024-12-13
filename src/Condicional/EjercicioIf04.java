package Condicional;

import java.util.Scanner;

public class EjercicioIf04 {
    public static void main(String[] args) {
        //ponemos un usuario y contraseña random
        String usuario = "Usuario";
        String contrasena = "1234";

        // pedimos usuario y contraseña
        Scanner sc = new Scanner(System.in);
        System.out.println("Usuario: ");
        String usuarioAdivinado = sc.nextLine();
        System.out.println("Contraseña: ");
        String contrasenaAdivinado = sc.nextLine();

        //Tenemos que compararlo
        //Cuando comparamos Strings tenemos que hacerlo obligatoriamente con .equals
        // cadena1.equals(cadena2) --> si las cadenas son iguales va a devolver TRUE
        if(usuario.equals(usuarioAdivinado) && contrasena.equals(contrasenaAdivinado)){
            System.out.println("Has entrado al sistema.");
        } else {
            System.out.println("Usuario y/o contraseña Incorrecta");
        }
    }
}
