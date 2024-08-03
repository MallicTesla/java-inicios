public class Cadenas {
    public static void main(String[] args) throws Exception {
        String texto = "              Trabajando con este texto        ";
        System.out.println (texto);
        
        // elimina los espacios al principio y al final
        texto = texto.trim();
        System.out.println (texto);

        // cuenta la longitud de la cadena
        int longitud = texto.length();
        System.out.println (longitud);

        // toma el carácter en esa posición
        char caracter = texto.charAt (5);
        System.out.println (caracter);

        // toma ese sección de la cadena
        String subTexto = texto.substring (11, 14);
        System.out.println (subTexto);

        // pasa todo a minúscula
        String minusculas = texto.toLowerCase();
        System.out.println (minusculas);

        // pasa todo a mayúscula
        String mayuscula = texto.toUpperCase();
        System.out.println (mayuscula);

        // indica donde inicia esa cadena
        int indice = texto.indexOf ("este");
        System.out.println (indice);

        // reemplaza los caracteres com otros caracteres ("caracteres a remplazar", "caracteres con los que se remplazan")
        String reemplazado = texto.replace("texto", "otro texto");
        System.out.println (reemplazado);

        // revisa si contiene ese texto
        Boolean contiene = texto.contains ("con");
        System.out.println ("tiene la palabra asignada : " + contiene);
        

    }
}
