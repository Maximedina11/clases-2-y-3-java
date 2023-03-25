/*
Escribir un programa que pida una frase y la muestre 
toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        String frase;

        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        frase = leer.nextLine();
        //El metodo nextLine  puede leer la linea desde la entrada hasta el final
        
        System.out.println("La frase en mayúsculas es: " + frase.toUpperCase());
        System.out.println("La frase en minúsculas es: " + frase.toLowerCase());
    }
}
