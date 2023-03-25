/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente 
en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double celsius, fahrenheit;

        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce la temperatura en grados Celsius: ");
        celsius = leer.nextDouble();

        fahrenheit = 32 + (9 * celsius / 5);

        System.out.println(celsius + " grados Celsius son equivalentes a " + fahrenheit + " grados Fahrenheit.");
    }
}
