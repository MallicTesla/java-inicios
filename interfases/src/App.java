// Mas info en el README
public class App {
    public static void main(String[] args) throws Exception {
        Delfin delfin = new Delfin("Firulais");
        Pulpo pulpo = new Pulpo("Poll", 8);

        delfin.nadar();
        delfin.Alimentar();
        delfin.comunicarse();

        System.out.println("-------------------");

        pulpo.nadar();
        pulpo.Alimentar();
        pulpo.comunicarse();
        







    }
}
