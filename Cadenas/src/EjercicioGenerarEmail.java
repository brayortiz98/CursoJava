import java.sql.SQLOutput;

public class EjercicioGenerarEmail {
    public static void main(String[] args) {
        System.out.println("*** Generador de Emails ***");
        // NOMBRE USUARIO
        String nombreP = "Brayan Emilio Ortiz Ramirez";
        String nombreSinEspacio = nombreP.replace(" ",".");
        String nombreSinEspacioMinisculas = nombreSinEspacio.toLowerCase();
        System.out.println("Nombre De Usuario: " + nombreP);
        System.out.println("Nombre De Usuario Normalizado = " + nombreSinEspacioMinisculas + "\n");


        //NOMBRE EMPRESA
        String nombreEmpresa = "IMSS";
        String dominio = ".gob.mx";
        String letra = "@";
        String nombreEmpresaMinusculas = nombreEmpresa.toLowerCase();
        String dominioNormalizado = nombreEmpresaMinusculas + dominio;
        System.out.println("Nombre De Empresa: " + nombreEmpresa);
        System.out.println("Extension De Dominio: " + dominio);
        System.out.println("Dominio De Email Normalizado: " + letra +  dominioNormalizado + "\n");

        System.out.println("Email Final Generado: " + nombreSinEspacioMinisculas + letra + dominioNormalizado);


    }
}
