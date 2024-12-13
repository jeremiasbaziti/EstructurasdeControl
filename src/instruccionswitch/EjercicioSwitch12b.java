package instruccionswitch;

import java.util.Scanner;

public class EjercicioSwitch12b {
    public static void main(String[] args) {
        /*12.  Harry Potter necesita ayuda para identificar lo que significa cada casa. Lee una cadena que represente una casa (puedes asociarla a un número para hacer más fácil la entrada por teclado) y que obtenga lo siguiente:
        • si es "gryffindor" , salida "valentía" ;
        • si es "hufflepuff" , salida "lealtad" ;
        • si es "slytherin" , salida "astucia" ;
        • si es "ravenclaw" , salida "intelecto" ;
        • de lo contrario, se muestra "no es una casa válida" .*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Elige una casa (1 - 4):\n1.gryffindor\n2.hufflepuff\n3.slythering\n4.revenclaw ");
        String casa = sc.nextLine();

        switch (casa){
            case "1"->System.out.println("valentia");
            case "2"->System.out.println("Lealtad");
            case "3"->System.out.println("Astucia");
            case "4"-> System.out.println("Intelecto");
            default -> System.out.println("No es una casa válida");}

    }
}
