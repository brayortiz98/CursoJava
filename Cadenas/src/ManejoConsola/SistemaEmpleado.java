package ManejoConsola;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SistemaEmpleado {
    public static void main(String[] args) {
        System.out.println("*** Sistema De Empleados ***");
        Scanner consola = new Scanner(System.in);

        // Nombre Empleado
        System.out.print("Ingresa el Nombre del Empleado: ");
        String nombreEmpleado = consola.nextLine();

        // Edad del Empleado
        System.out.print("Ingresa la Edad del Empleado: ");
        int edadEmpleado = Integer.parseInt(consola.nextLine());

        // Salario del Empleado
        System.out.print("Salario del Empleado: ");
        double salarioEmpleado = Double.parseDouble(consola.nextLine());

        // Es Jefe de Departamento
        System.out.print("Es Jefe de Departamento (True / False) ?: ");
        boolean esJefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        // Imprimir Valores
        System.out.println("\nDatos del Empleado: ");
        System.out.println("\t Nombre: " + nombreEmpleado);
        System.out.println("\t Edad: " + edadEmpleado + " años");
        //System.out.println("\t Salario: " + salarioEmpleado);
        System.out.printf("\t Salario: $%.2f%n", salarioEmpleado);
        System.out.println("\t Es Jefe de Departamento ? " + esJefeDepartamento);



    }
}
