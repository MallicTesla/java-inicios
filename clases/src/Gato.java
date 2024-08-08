// así se especifica que gato hereda de animal
public class Gato extends Animal{
    public Gato (String nombre, int edad){
        // super asigna la información a la clase padre
        super (nombre, edad);
    }

    // con Override se sobre escribe un método
    @Override
    public String haceSonido (){
        return "Otro gato";
    }





}
