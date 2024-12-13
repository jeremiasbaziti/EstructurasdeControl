package Condicional;

import java.util.Scanner;

public class ejercicioIf12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Elije una casa (1 - 4)\n:1.gryffindor\n2.hufflepuff\n3.slythering\n4.revenclaw ");
        String casa = sc.nextLine();
        if(casa.equals("1")){
                System.out.println("valentia");
            } else if (casa.equals("2")) {
                System.out.println("Lealtad");
            } else if (casa.equals("3")) {
                System.out.println("Astucia");
            } else if (casa.equals("4")) {
                System.out.println("Intelecto");
            }else {
                System.out.println("No es una casa válida");
            }
    }
}
