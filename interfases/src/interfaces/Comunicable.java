package interfaces;

// las interfaces no pueden tener constructores dentro
public interface Comunicable {
    // las interfases pueden tener variables constantes (final, public, static) no se puede usar private
    final String GRITO = "AAAAAAAAAAAAAAA";
    // public String GRITO = "AAAAAAAAAAAAAAA";
    // static String GRITO = "AAAAAAAAAAAAAAA";

    // la clase que use esta  interfaz va a estar obligada a usar este método
    void comunicarse();



}
