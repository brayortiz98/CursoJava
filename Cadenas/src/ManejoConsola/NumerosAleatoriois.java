package ManejoConsola;

import java.util.Random;

public class NumerosAleatoriois {
    public static void main(String[] args) {
        System.out.println(" *** Numeros Aleatorios *** ");
        Random random = new Random();

        // Generar un Numero Aleatorio entre 0 y 9.
        int numeroAleatorio = random.nextInt(10);
        System.out.println("numeroAleatorio entre 0 y 9 = " + numeroAleatorio);

        // Generar un Numero Aleatorio entre 1 y 10.
        numeroAleatorio = random.nextInt(10) + 1;
        System.out.println("numeroAleatorio entre 1 y 10 = " + numeroAleatorio);

        // Generar Numero Flotante entre 0.00 y 1.0
        Float flotanteAleatorio = random.nextFloat();
        System.out.println("flotanteAleatorio = " + flotanteAleatorio);

        // Simular el Lanzamiento de un Dado  (1 y 6)
        int dado = random.nextInt(6) + 1;
        System.out.println("Resultado de Lanzar el Dado = " + dado);
    }
}
