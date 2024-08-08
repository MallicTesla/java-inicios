public class Rectangulo extends Figura {
    double lado_1;
    double lado_2;

    public Rectangulo (double lado_1, double lado_2){
        this.lado_1 = lado_1;
        this.lado_2 = lado_2;
    }

    @Override
    double calularArea() {
        return lado_1 * lado_2;
    }



}
