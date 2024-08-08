public abstract class CriaturasMarinas {
    String nombre;
    
    public CriaturasMarinas (String nombre){
        this.nombre = nombre;
    }

    // esto obliga a sobre escribir este método en las clases que hereden de CriaturasMarinas
    abstract void nadar ();

}
