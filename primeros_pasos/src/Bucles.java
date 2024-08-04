public class Bucles {
    public static void main (String[] args) throws Exception {
        // inicio           :   es la variable de inicio
        // condición        :   es a la condición que tiene que llegar o la condición de finalización
        // actualización    :   es como se actualiza el inicio para llegar al final
        // for (inicio; condición; actualización)

        int i;
        for (i = 1; i <= 3; i++){
            System.out.println ("for : " + i);
        }
        // al finalizar el bucle for si se realiza la ultima actualización pero como no se cumple sale eso da como resultado que la variable sale modificada en este caso
        System.out.println ("i del for termino en : " + i);


        int contador = 1;

        // este while primero revisa la condición y después ejecuta el código
        while (contador <= 3) {
            System.out.println ("contador : " + contador);
            contador++;
        }

        // en el caso del while ocurre lo mismo que en el for
        System.out.println ("contador del while termino en : " + contador);


        int contador2 = 3;
        // en este while primero se ejecuta el código y después se revisa la condición
        do { 
            System.out.println ("contador2 : " + contador2);
            contador2++;
        } while (contador2 <= 3);

        // en el caso del while ocurre lo mismo que en el for
        System.out.println ("contador2 del while termino en : " + contador2);




    }
}
