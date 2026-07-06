package ManejoConsola;

import java.util.Scanner;

public class RetoRecetasCocina {
    public static void main(String[] args) {
        System.out.println("*** Recetas de Cocina ***");

        Scanner consola = new Scanner(System.in);

        // Nombre Receta
        System.out.print("Ingresa el Nombre: ");
        String nombreReceta = consola.nextLine();

        // Ingredientes Receta
        System.out.print("Ingresa los Ingredientes: ");
        String ingredientesReceta = consola.nextLine();

        // Tiempo Preparacion
        System.out.print("Ingresa el Tiempo de Preparacion (min): ");
        int tiempoPreparacion = Integer.parseInt(consola.nextLine());

        // Dificultad
        System.out.print("Ingresa la Dificultad: ");
        String nivelDificultad = consola.nextLine();

        // Imprimir Valores
        System.out.println("\n--- Receta de Cocina ---");
        System.out.println("\t Nombre Receta: " + nombreReceta);
        System.out.println("\t Ingredientes: " + ingredientesReceta);
        System.out.println("\t Tiempo de Preparacion: " + tiempoPreparacion + " Minutos");
        System.out.println("\t Dificulta: " + nivelDificultad);

    }
}
