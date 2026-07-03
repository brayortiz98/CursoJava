package ManejoConsola;

import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        // Leer distintos tipos de datos
        // Leer un tipo int
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingresa Tu Edad: ");
        int edad = consola.nextInt();
        System.out.println("Edad = " + edad + " Años");

        // Leer un valor de tipo double
        System.out.print("Ingresa tu Altura: ");
        double altura = consola.nextDouble();
        System.out.println("altura = " + altura);
        // Consuminos el caracter de salto de linea
        consola.nextLine();
        //Leer un String
        System.out.print("Ingresa Tu Nombre: ");
        String nombre = consola.nextLine();
        System.out.println("Nombre = " + nombre);

        // Conversion de Datos

    }
}
