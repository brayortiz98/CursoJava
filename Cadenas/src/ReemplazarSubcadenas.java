public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        // Reemplazar Subcadenas
        String cadena = "Hola Mundo";
        System.out.println("cadena Original = " + cadena);

        // Reemplazar "Mundo" por "a todos"
        String nuevaCadena = cadena.replace("Mundo", "a todos");
        System.out.println("Nueva Cadena = " + nuevaCadena);

        // Reemplazar "Hola" por "Adios"
        nuevaCadena = cadena.replace("Hola", "Adios");
        System.out.println("nuevaCadena = " + nuevaCadena);
    }
}
