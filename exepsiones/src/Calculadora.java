
import excepciones.CalculadoraException;
// import excepciones.DividirPorCero;

public class Calculadora {
    // así manejas un error de forma personalizada
    // public double dividir (double numero1, double numero2) throws DividirPorCero{
    public double dividir (double numero1, double numero2) throws CalculadoraException{

        // así se puede hacer un manejo de error especifico y que muestre un mensaje especifico
        if (numero2 == 0) throw new CalculadoraException("No sea nabo no se puede dividir por cero");

        return numero1 / numero2;
    }




}
