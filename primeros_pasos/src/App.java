import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Funcionoooooooooo");

        String miString = "a las variables se le tienen que declarar con el tipo ";
        // final String miString = "cuando una variable comienza con final es una constante ";

        miString = "una ves declarada la variable no es necesario volverle a especificar el tipo";
        
        System.out.println(miString);

        // se puede declarar un entero de dos formas utilizando solamente int o usando la clase Integer
        int miEntero = 1 ;
        // cuando se usa una clase tiene mas opciones a la hora de trabajar con ese numero no solo las funciones básicas
        Integer miOtroEntero = 3 ;

        miOtroEntero = miOtroEntero + 3;
        System.out.println(miOtroEntero);
        System.out.println(miOtroEntero + 3);

        // la clase Double tiene mas dígitos decimales que Float
        Double conDesimal = 5.0;
        System.out.println(conDesimal);

        // para usar Float se tiene que colocar un sufijo al final (F o f) 
        Float numeroFlotante = 3.1f;
        System.out.println(numeroFlotante);

        // no se ahi problemas de compatibilidad entre los tipos de datos aunque se puede perder precisión con los números Float y Double
        System.out.println(conDesimal + " " + miEntero + " " + miString + numeroFlotante);

        Boolean miBooliano = true;

        // cuando se trabaja con una variable que puede ser null da error ahi que asegurarse de que eso no suceda
        miOtroEntero = null ;
        if (miOtroEntero != null) {
            System.out.println (miOtroEntero + 5);
        } else {
            System.out.println ("miOtroEntero es null");
        }

        // para crear una lista primero se tiene que iniciar y después se le agrega la información
        // para hacer una lista se necesita importar la clases
        // lo que esta dentro de <> especifica el tipo de dato que puede almacenar esa lista (<Object> es para que almacenar todos los tipos)
        List <Object> miLista = new ArrayList <> ();
        miLista.add (miString);
        miLista.add (miEntero);
        System.out.println (miLista);

        // así se crea un diccionario
        Map <String, Object> miMap = new HashMap <> ();
        miMap.put ("str", miString);
        miMap.put ("int", miEntero);
        System.out.println(miMap);
        System.out.println(miMap.get ("int"));

        for (int i = 0 ; i < miLista.size(); i++){
            miLista.get (i);
            System.out.println(miLista);
            System.out.println(i);
        }


        int primerNumero = 2;
        int segundoNumero = 3;
        // así se llama una función donde (App) es la clase principal
        Ahorcado MiApp = new Ahorcado();
        // y luego se hacen instancias de esa función
        MiApp.miFuncion (primerNumero, segundoNumero);

        System.out.println("funcion2 " + MiApp.miFuncion2(primerNumero, segundoNumero));
    }

    // las funciones de tipo void no retornan nada
    public void miFuncion (int primerNumero, int segundoNumero){
        System.out.println(primerNumero + segundoNumero);
    }

    public int miFuncion2 (int primerNumero, int segundoNumero){
        return primerNumero + segundoNumero ;
    }


}
