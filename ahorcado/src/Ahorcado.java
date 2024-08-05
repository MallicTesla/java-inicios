import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        Scanner escaner = new Scanner(System.in);

        String palabraSecreta = "funciono";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean adivinado = false;

        // en los arreglos de tipo char se tienen que asignar el valor con comillas simples '' como se ve en el for
        char[] letrasAdivinadas = new char [palabraSecreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas [i] = '_';
        }
        

        while (!adivinado && intentos < intentosMaximos) { 
                                                    // valueOf se usa para cuando tines un string formado por char (letras) las junta y forma un string
            System.out.println("Palabra adivinada : " + String.valueOf (letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");
            System.out.println("Introduce una letra");

            // charAt(0) es para que tome la primera letra
            char letra = Character.toLowerCase(escaner.next().charAt(0));

            boolean letraCorecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;

                    letraCorecta = true;
                }
            }

            if (!letraCorecta){
                intentos++;
                System.out.println ("Incorrecto!! Te quedan " + (intentosMaximos - intentos) + " intentos");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                adivinado = true;

                System.out.println("Adivinaste la palabra secreta : " + f
                );
            }
        }

        System.out.println("GAME OVER");
        escaner.close();

    }
}
