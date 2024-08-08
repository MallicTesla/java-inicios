
import excepciones.CalculadoraException;
// import excepciones.DividirPorCero;

public class App {
    public static void main(String[] args) throws Exception {
        double numero1 = 5;
        double numero2 = 0;
        double resultado;

        Calculadora calculadora = new Calculadora();

        // System.out.println(numero1 / numero2);
        try {
            resultado = calculadora.dividir(numero1, numero2);
            System.out.println("después de la operación " + resultado);

        // Este es in mensaje personalizado 
        }catch (CalculadoraException e) {
            e.printStackTrace();
            System.out.println("Dentro el catch" );
        }finally{
            System.out.println("Esto ocurre si o si tanto como si hubiese un error o no");
        }










    }
}
