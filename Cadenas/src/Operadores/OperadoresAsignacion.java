package Operadores;

public class OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.println("**** Operadores de Asignacion ****");
        // Asignacion
        int miNumero = 10;
        int miNumero2;
        miNumero2 = 15;
        // Asignacion compuesto
        // +=
        miNumero += 5;  // miNumero = miNumero + 5;
        System.out.println("miNumero = " + miNumero);
        // -=, *=, /= y %=
        miNumero *= 2;// miNumero = miNumero * 2 --> 30;
        System.out.println("miNumero = " + miNumero);


        
    }
}
