import interfaces.Alimentable;
import interfaces.Comunicable;

public class Delfin extends CriaturasMarinas implements Comunicable, Alimentable{
    public Delfin (String nombre){
        super(nombre);
    }

    @Override
    void nadar() {
        System.out.println(nombre + "esta nadando libre");
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre + " chirria");
    }

    @Override
    public void Alimentar() {
        System.out.println("Estamos alimentando con peses a " + nombre);
    }

}
