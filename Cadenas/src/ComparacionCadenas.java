public class ComparacionCadenas {
    public static void main(String[] args) {
        // Comparacion de cadenas (pool de cadenas)
        String cadena1 = "Java";
        String cadena2 = "Java";
        String cadena3 = new String("Java");
        //Comparacion de Cadenas (==) comparan la referencia
        System.out.print("cadena1 es igual en referencia a cadena2: ");
        System.out.println(cadena1 == cadena2);
        // Comparamos cadena1 con cadena3 (referencias)
        System.out.print("cadena1 es igual en referencia a cadena3: ");
        System.out.println(cadena1 == cadena3);

        // Compara contenido usaremos el metodo equals
        System.out.print("cadena1 es igual en contenido a cadena3: ");
        System.out.println(cadena1.equals(cadena3));

    }
}
