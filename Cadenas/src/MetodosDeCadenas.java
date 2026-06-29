public class MetodosDeCadenas {
    public static void main(String[] args) {
        // Metodos de Cadenas
        String cadena1 = "Hola Mundo";
        //Obtener el largo de una cadena
        int longitud = cadena1.length();
        System.out.println("longitud = " + longitud);

        // Reemplazar Caracteres
        String nuevaCadena = cadena1.replace('o','a');
        System.out.println("nuevaCadena = " + nuevaCadena);

        // Convertir a Mayusculas
        String mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);

        // Convertir a Minusculas
        String minusculas = cadena1.toLowerCase();
        System.out.println("minusculas = " + minusculas);
        System.out.println("minusculas = " + cadena1.toLowerCase());

        // Eliminar Espacios al inicio y al final
        String cadena2 = "     Brayan Ortiz     ";
        System.out.println("cadena2 con espacios = " + cadena2);
        System.out.println("cadena2 sin espacoos = " + cadena2.trim());

    }
}
