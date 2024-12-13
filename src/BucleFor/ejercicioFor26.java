package BucleFor;

public class ejercicioFor26 {
    public static void main(String[] args) {
        /*26. Hacer un programa que calcule la suma y el producto de los 30 primeros números naturales. (El 0 no cuenta)
         */

        //Variables
        int suma = 0, producto = 1;

        //Bucle
        for (int i = 1; i <= 30 ; i++) {
            suma += i;
            producto *= i;
        }
        System.out.println("La suma es " + suma);
        System.out.println("El producto es " + producto);
    }
}
