import java.util.Scanner;

public class ejercicioIf10 {
    public static void main(String[] args) {
        // Variables
        double precioInicial, precioFinal;
        int kilos, tamaño;
        char tipo;

        // Crear un objeto Scanner para la entrada de datos
        Scanner sc = new Scanner(System.in);

        // Preguntar por el precio inicial del kilo de uva
        System.out.print("Ingrese el precio inicial del kilo de uva: ");
        precioInicial = sc.nextDouble();

        // Preguntar por el número de kilos a cargar
        System.out.print("Ingrese la cantidad de kilos a cargar: ");
        kilos = sc.nextInt();

        // Preguntar por el tipo de uva (A o B)
        System.out.print("Ingrese el tipo de uva (A o B): ");
        tipo = sc.next().charAt(0);

        // Preguntar por el tamaño de la uva (1 o 2)
        System.out.print("Ingrese el tamaño de la uva (1 o 2): ");
        tamaño = sc.nextInt();

        // Aplicar reglas según el tipo y tamaño de la uva
        precioFinal = precioInicial;
        if (tipo == 'A' || tipo == 'a') {
            if (tamaño == 1) {
                precioFinal += 0.20; // Sumar 20 céntimos
            } else if (tamaño == 2) {
                precioFinal += 0.30; // Sumar 30 céntimos
            }
        } else if (tipo == 'B' || tipo == 'b') {
            if (tamaño == 1) {
                precioFinal -= 0.30; // Restar 30 céntimos
            } else if (tamaño == 2) {
                precioFinal -= 0.50; // Restar 50 céntimos
            }
        } else {
            System.out.println("Tipo de uva no válido.");
            return; // Terminar el programa si el tipo es inválido
        }

        // Calcular el precio total por el embarque
        double total = precioFinal * kilos;

        // Mostrar el resultado
        System.out.println("El precio final del kilo de uva es: " + precioFinal + "€");
        System.out.println("El total a recibir por " + kilos + " kilos de uva es: " + total + "€");
    }
}
