/*
Escribir un programa que pida tu nombre, lo guarde 
en una variable y lo muestre por pantalla.
 */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        String nombre;

        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        nombre = leer.nextLine();

        System.out.println("Hola, " + nombre + "!");
    }
}

