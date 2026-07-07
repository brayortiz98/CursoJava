package ManejoConsola;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println(" *** Formateo de Cadenas ****");

        Scanner consola = new Scanner(System.in);

        System.out.print("Ingresa tu Nombre: ");
        String nombre = consola.nextLine();
        System.out.print("Ingresa tu Edad: ");
        int edad = Integer.parseInt(consola.nextLine());
        System.out.print("Ingresa tu Salario: ");
        Double salario = Double.parseDouble(consola.nextLine());

        // String format
        String mensaje = String.format("Nombre: %s, Edad: %d, Salario: %.2f",nombre, edad, salario);
        System.out.println("mensaje = " + mensaje);

        // MEtodo printf
        System.out.printf("Nombre: %s, Edad: %d, Salario: %.2f",nombre, edad, salario);

        // Formateo Utilizando con text block
        mensaje = """
                %nDetalle Persona: \s
                --------------------
                Nombre: %s
                """;
    }
}
