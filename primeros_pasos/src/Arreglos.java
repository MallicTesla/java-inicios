public class Arreglos {
    public static void main(String[] args) {
        // Para crear un arreglo, se debe especificar el tipo de dato seguido de [], 
        // luego el nombre del arreglo y finalmente se inicializa con la cantidad de elementos deseados.
        int[] numeros = new int[5];

        // Luego, se pueden agregar valores a cada índice por separado.
        numeros [0] = 1;
        numeros [1] = 2;
        numeros [3] = 4;
        numeros [4] = 5;

        System.out.println (numeros [0]);
        System.out.println (numeros [1]);
        System.out.println (numeros [2] + " si no se le agrega ningún valor por defecto se coloca 0");
        System.out.println (numeros [3]);
        System.out.println (numeros [4]);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println ("for " + numeros [i]);
        }

        // también se puede hacer así
        // aunque no se puede dejar ningún valor vació
        int[] numeros2 = {10, 20, 30, 40, 50};

        // también se puede modificar de forma individual
        numeros2[2] = 80;
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println ("for " + numeros2 [i]);
        }

        // también se puede usar este otro for pero no da el índice
        for (int numero2 : numeros2) {
            System.out.println("for 2 " + numero2);
        }








    }
}
