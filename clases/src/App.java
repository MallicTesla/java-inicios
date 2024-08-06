public class App {
    public static void main(String[] args) throws Exception {
        // de esta forma se hace sin constructor
        // Persona persona1 = new Persona();
        // persona1.nombre = "Mallic";
        // persona1.apellido = "Tesla";
        // persona1.edad = 25;

        // Carrera carrera1 = new Carrera();
        // carrera1.nombre = "Ingeniero como Ironman";
        // carrera1.duracion = 6;
        // carrera1.estaEnCurso = true;

        // persona1.carrera = carrera1;

        // Persona persona2 = new Persona();
        // persona2.nombre = "Pablo";
        // persona2.apellido = "Mallic";
        // persona2.edad = 28;

        // // de esta forma se tiene que crear un constructor de la clase Carrera dentro de Persona
        // persona2.carrera.nombre = "Electricista";
        // persona2.carrera.duracion = 5; 
        // persona2.carrera.estaEnCurso = false; 


        // System.out.println(persona1.apellido + ", " + persona1.nombre + " tiene " + persona1.edad + " años y esta recibido de " + persona1.carrera.nombre);
        // System.out.println(persona2.darNombreCompleto() + " tiene " + persona2.edad + "  años y esta cursando " + persona2.carrera.nombre);

        // System.out.println(persona1.enviarSaludos("Nicolas"));

        // ----------------------------------------------------------------------------------------------------------------------------------------
        // // de esta forma se tiene que crear un constructor de la clase Carrera dentro de Persona
        // Persona persona3 = new Persona("Nicolas", "Cage", 60, "El mejor Actor del mundo", 40, true);
        // // se puede tener varios constructores diferentes para la misma clase
        // Persona persona4 = new Persona("Nicolas", "Cage", 60, "El mejor Actor del mundo");


        // System.out.println(persona3.darNombreCompleto() + " tiene " + persona3.edad + " años y es " + persona3.carrera.nombre);
        // System.out.println(persona4.darNombreCompleto() + " tiene " + persona4.edad + " años y es " + persona4.carrera.nombre);

        // ----------------------------------------------------------------------------------------------------------------------------------------
        // cuando el constructor tienen propiedades privadas
        Persona persona5 = new Persona("Nicolas", "Cage", 60);

        persona5.setNombre("Pablo");
        persona5.setApellido("Tesla");


        System.out.println(persona5.darNombreCompleto()
        + " tiene " + persona5.getEdad() + " años");



    }
}
