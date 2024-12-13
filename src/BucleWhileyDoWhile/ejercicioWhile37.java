package BucleWhileyDoWhile;

public class ejercicioWhile37 {
    public static void main(String[] args) {
        /*37. Hacer un programa que imprima por pantalla los 50 primeros múltiplos de 5, añadiendo un salto de línea cada 10 números.
         */

        //Variables
        int multiplos, contador = 1;

        while (contador <= 50){
            multiplos = 5 * contador;
            System.out.println("Multiplo nro "+ contador + ": " + multiplos);

            if (contador % 10 == 0){
                System.out.println();
            }

            contador++;

        }
    }
}
