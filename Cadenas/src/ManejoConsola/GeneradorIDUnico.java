package ManejoConsola;

import java.util.Random;
import java.util.Scanner;

public class GeneradorIDUnico {
    public static void main(String[] args) {
        System.out.println("*** SISTEMA GENERADOR UNICO DE ID ***");
        Scanner consola = new Scanner(System.in);
        Random aleatorio = new Random();

        // Solicitamos nombre de usuario
        System.out.print("¿Cual Es Tu Nombre? ");
        String nombre = consola.nextLine();

        // Solicitamos apeido de usuario
        System.out.print("¿Cual Es Tu Apeido? ");
        String apeido = consola.nextLine();

        // Solicitamos año de nacimiento del usuario
        System.out.print("¿Cual Es Tu Año De Nacimiento (YYYY)? ");
        String anioNacimiento = consola.nextLine();

        // Normalizar los valores
        String nombre2 = nombre.trim().toUpperCase().substring(0,2);
        String apellido2 = apeido.trim().toUpperCase().substring(0,2);
        String anioNacimiento2 = anioNacimiento.trim().substring(2);

        // Generar valor Aleatorio (1 y 9999)
        int numeroAleatorio = aleatorio.nextInt(9999) + 1;

        // Formato de 4 Digitos
        String numeroAleatorioFormato = String.format("%04d",numeroAleatorio);

        // Generad ID Unico
        String idUnico = nombre2 + apellido2 + anioNacimiento2 + numeroAleatorioFormato;

        // Formateo Utilizando con text block
        String mensaje = String.format(
                "%nHola: %s%n" +
                        "\tTu número de identificación (ID) generado por el sistema es: %n" +
                        "\t%s%n" +
                        "\t¡Felicidades!",
                nombre, idUnico
        );
        System.out.println(mensaje);

    }
}
