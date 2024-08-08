public class App {
    public static void main(String[] args) throws Exception {
        Circulo circulo = new Circulo (10);
        Rectangulo rectangulo = new Rectangulo(10, 10);

        // como este método es un void ya retorna el print
        circulo.inprimirInformacion();
        System.out.println("El area del circulo es : " + circulo.calularArea());

        rectangulo.inprimirInformacion();
        System.out.println("El area del rectángulo es : " + rectangulo.calularArea());






    }
}
