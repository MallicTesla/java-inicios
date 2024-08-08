public class Perro extends Animal {
    public Perro (String nombre, int edad){
        // super asigna la información a la clase padre
        super (nombre, edad);
    }

    // con Override se sobre escribe un método
    @Override
    public String haceSonido (){
        return "QUE QUE QUE";
    }

}
