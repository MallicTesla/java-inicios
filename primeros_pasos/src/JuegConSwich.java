
import java.util.Scanner;

public class JuegConSwich {

    public static void main (String[] args) throws Exception {
        // el escáner es para escuchar los input se tiene que cerrar al finalizar
        Scanner entradaInput = new Scanner (System.in);

        System.out.println ("Bienvenido a la maquina vendedora de bebidas");
        System.out.println ("Elegid lo que mas te guste:");

        System.out.println ("1) Agua");
        System.out.println ("2) Jugo de naranja");
        System.out.println ("3) Café");
        System.out.println ("4) Té");
        System.out.println ("5) Refresco");

        int opcion = entradaInput.nextInt();

        // String bebida = "";

        switch (opcion) {
            case 1:
                System.out.println ("Preparando un Agua");
                break;

            case 2:
                System.out.println ("Preparando un Jugo de naranja");
                break;

            case 3:
                System.out.println ("Preparando un Café");
                break;

            case 4:
                System.out.println ("Preparando un Té");
                break;

            case 5:
                System.out.println ("Preparando un Refresco");
                break;

            default:
                System.out.println ("Opción no valida");
                break;
            }

            if (opcion <= 5) {
                System.out.println("Disfruta de tu bebida");
            }

            entradaInput.close();





    }
}
