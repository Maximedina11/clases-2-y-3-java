/*
 Escribir un programa que lea un número entero por teclado 
y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int numero;
        double doble, triple, raiz;

        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        numero = leer.nextInt();

        doble = 2 * numero;
        triple = 3 * numero;
        raiz = Math.sqrt(numero);

        System.out.println("El doble de " + numero + " es: " + doble);
        System.out.println("El triple de " + numero + " es: " + triple);
        System.out.println("La raíz cuadrada de " + numero + " es: " + raiz);
    }
}
