package Operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("**** Operadores Unarios ****");
        int a = 3, b = -2, resultado;
        boolean c = true;
        // Operador Unario +
        resultado = +a;
        System.out.println("resultado +a Unario = " + resultado);
        // Operador Unario -
        resultado = -a;
        System.out.println("resultado -a Unario Negativo= " + resultado);

        // Operadores Unarios de Incremento / Decremento
        // Pre-Incremento
        a = 3;
        resultado = ++a; // Primero se incrementa el valor
        System.out.println("resultado ++a = " + resultado);
        System.out.println("a ya se incremento = " + a);
        // Post-Incremento
        a = 3;
        resultado = a++; //Primero se usa el valor y despues se incrementa
        System.out.println("resultado a++ = " + resultado);
        System.out.println("a en este momento se incrementa = " + a);

        //Pre-Decremento
        b = -2;
        resultado = --b;// primero se incrementa y despues se usa el valor
        System.out.println("Resultado --b = "+ resultado);

    }
}
