package Condicional;

import java.util.Scanner;

public class EjercicioIf05 {
    public static void main(String[] args) {
        String usuarioReal= "usuario";
        String contraseñaReal= "1234";

        // pedimos usuario y contraseña
        Scanner sc = new Scanner(System.in);
        System.out.println("Usuario: ");
        String usuarioAdivinado = sc.nextLine();
        System.out.println("Contraseña: ");
        String contrasenaAdivinado = sc.nextLine();

        //comparados
        if(usuarioAdivinado.equals(usuarioReal)){
            //Una vez que el usuario coincide, comprobamos la contraseña
            if (contrasenaAdivinado.equals(contraseñaReal)){
                //Usuario y contraseña correctos
                System.out.println("Has entrado al sistema");
            } else {
                //Si entro aqui es que: el usuario es correcto, pero la contraseña no
                System.out.println("La contraseña es incorrecta.");
            }
        } else {
        //El usuario incorrecto
            if (contrasenaAdivinado.equals(contraseñaReal)){
                //usuario incorrecto, contraseña correcta
                System.out.println("El usuario es incorrecto");
        } else {
                //El usuario y contraseña son incorrectos
                System.out.println("Usuario y contraseña incorrectos");
            }
        }
    }
}
