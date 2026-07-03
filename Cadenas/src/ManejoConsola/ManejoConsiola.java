package ManejoConsola;

import java.util.Scanner;

public class ManejoConsiola {
    public static void main(String[] args) {
        // Introducir valores por consola
        Scanner consola = new Scanner(System.in); // in - input - entrada de datos
        System.out.print("Escribe tu Nombre: ");
        String nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

    }
}
