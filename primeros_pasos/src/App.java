public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Funcionoooooooooo");

        String miString = "a las variavles se le tienen que declarar con el tipo ";

        miString = "una ves declarada la variable no es nesesario volverle a espesificar el tipo";
        
        System.out.println(miString);

        // se puede declarar un entero de dos formas utilisando solamente int o usando la clase Integer
        int miEntero = 1 ;
        // cuando se usa una clase tiene mas opsiones a la hora de trabajar con ese numero no solo las funciones vasicas
        Integer miOtroEntero = 3 ;

        miOtroEntero = miOtroEntero + 3;
        System.out.println(miOtroEntero);
        System.out.println(miOtroEntero + 3);

        // la clase Double tiene mas digitos desimales que Float
        Double conDesimal = 5.0;
        System.out.println(conDesimal);

        // para usar Float se tiene que colocar un sufijo al final (F o f) 
        Float numeroFlotante = 3.1f;
        System.out.println(numeroFlotante);

        // no se ahi problemas de compativilidad entre los tipos de datos aunque se puede perder presision con los numeros Float y Double
        System.out.println(conDesimal + " " + miEntero + " " + miString + numeroFlotante);




    }


}
