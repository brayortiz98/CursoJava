public class BusquedaSubcadenas {
    public static void main(String[] args) {
        // Buscar Subcadenas
        //Index OF == Devuelve el indice de la primera aparicion de la subcadena

        String cadena1 ="Hola Mundo";
        //Subcadena a buscar "Hola"
        int indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);

        //lastIndexOf - devuelve el indice de la ultima aparicion de la subcadena
        // subcadena mundo
        int indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);

        // Para la subcadena no encontrada devuelve -1
        int indice3 = cadena1.indexOf("Java");
        System.out.println("indice3 = " + indice3);
    }
}
