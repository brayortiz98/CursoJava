public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        // Mas formas de concatenar cadenas en JAVA
        String cadena1 = "Hola";
        String cadena2 = "Mundo";
        String cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 usando + = " + cadena3);

        // Metodo Concat
        cadena3 = cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena3 usando concat = " + cadena3);

        // StringBuilder
        StringBuilder constructorCadenas = new StringBuilder();
        //var constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);
        constructorCadenas.append(cadena1).append(" ").append(cadena2);
        String resultado = constructorCadenas.toString();
        System.out.println("resultado = " + resultado);


        // StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("stringBuffer = " + stringBuffer);

        // Mas formas de concatenar cadenas en java
        String Cadena3 = "Hola";
        String cadena4 = "Mundo";
        String cadena5 = cadena3 + " " + cadena4;
        System.out.println("cadena5 = " + cadena5);

        //Metodo Concat
        cadena5 = cadena3.concat(" ").concat("Mundo");
        System.out.println("cadena5 usando concat = " + cadena5);
    }
}
