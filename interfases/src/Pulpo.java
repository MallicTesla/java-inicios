import interfaces.Alimentable;
import interfaces.Comunicable;

// no se puede implementar mas de una case abstracta pero si se pueden implementar barias interfaces
public class Pulpo extends CriaturasMarinas implements Comunicable, Alimentable{
    int tentaculos;

    public Pulpo (String nombre, int tentaculos){
        super(nombre);
        this.tentaculos = tentaculos;
    }

    @Override
    void nadar() {
        System.out.println(nombre + "esta nadando libre con sus " + tentaculos + " tentáculos");
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre + " se comunica con sus " + tentaculos + " tentáculos");
        
    }

    @Override
    public void Alimentar() {
        System.out.println("Estamos alimentando con peses a " + nombre);
    }


}