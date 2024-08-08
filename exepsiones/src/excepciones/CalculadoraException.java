package excepciones;

public class CalculadoraException extends Exception {
    private String descripcion;

    public CalculadoraException(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String getMessage() {
        return descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}


