package excepciones;

public class DividirPorCero extends Exception {

    @Override
    public String getMessage (){
        return "No sea nabo no se puede dividir por cero";
    }
}
