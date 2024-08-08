public class Animal {
    String nombre;
    int edad;
    // con static no se reinicia el contador
    static int contadorAnimales = 0;


    public Animal (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        // cada ves que se usa esta clase se suma 1
        contadorAnimales ++;
    }

    public String haceSonido (){
        return "Sonido genérico";
    }

    public static int getContadorAnimales (){
        return contadorAnimales;
    }





}
