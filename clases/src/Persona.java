

public class Persona {
    // String nombre;
    // String apellido;
    // int edad;
    // Carrera carrera;

    // // constructor
    // public Persona (String nombre, String apellido, int edad, String nombreCarera, int duracion, boolean estaEnCurso){
    //     carrera = new Carrera (nombreCarera, duracion, estaEnCurso);
    //     // this es como el self hace referencia a las variables dentro de la clase
    //     this.nombre = nombre;
    //     this.apellido = apellido;
    //     this.edad = edad;
    //     // this.carrera.nombre = nombreCarera;
    // }

    // // cuando existen dos constructores con el mismo nombre pero tienen distintos atributos se llama sobrecarga de constructor
    // public Persona (String nombre, String apellido, int edad, String nombreCarera){
    //     carrera = new Carrera (nombreCarera);
    //     // this es como el self hace referencia a las variables dentro de la clase
    //     this.nombre = nombre;
    //     this.apellido = apellido;
    //     this.edad = edad;
    //     // this.carrera.nombre = nombreCarera;
    // }

    // public String darNombreCompleto (){
    //     return apellido + ", " + nombre;
    // }

    // public String enviarSaludos (String saludo) {
    //     return "Hola " + saludo;
    // }


    // ----------------------------------------------------------------------------------------------
    private String nombre;
    private String apellido;
    private int edad;

    public Persona (String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String darNombreCompleto (){
        return getNombre() + ", " + getApellido ();
    }
    
    public String enviarSaludos (String saludo) {
        return "Hola " + saludo;
    }

    // para generar los gets y los sets de forma automática se hace click derecho después click en (Acción de código fuente) después en (Generate Getters and Setters) y seleccionas todas las
    // opciones que quieras
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    // esta seria la forma manual de hacerlo
    // // se usa un get para mostrar el atributo cuando los atributos son privados
    // public int getEdad (){
    //     return edad;
    // }

    // // se usa set para escribir en un atributo cuando es privado
    // // se usa void porque no retorna nada
    // public void setNombre (String nombre){
    //     this.nombre = nombre;
    // }

    // public void setApellido (String apellido){
    //     this.apellido = apellido;
    // }

    // public String getNombre(){
    //     return this.nombre.toUpperCase();
    // }

    // public String getApellido(){
    //     return this.apellido.toUpperCase();
    // }




}
