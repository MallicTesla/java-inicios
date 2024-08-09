import java.util.LinkedHashSet;
import java.util.Set;

public class UsandoSet {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a a fiesta de los superhéroes");

        // con la colección set no se pueden repetir el contenido
        // `HashSet` no permite elementos duplicados y no garantiza el mantenimiento del orden de los elementos.
        // Set<String> superHeroes = new HashSet<>();

        // `TreeSet` no permite elementos duplicados y mantiene los elementos ordenados de forma natural (alfabéticamente para cadenas de texto).
        // Set<String> superHeroes = new TreeSet<>();

        // `LinkedHashSet` no permite elementos duplicados y mantiene el orden en el que se agregan los elementos.
        Set<String> superHeroes = new LinkedHashSet<>();

        superHeroes.add("Iron Man 01");
        superHeroes.add("Superman 02");
        superHeroes.add("Batman 03");
        superHeroes.add("Spiderman 04");
        superHeroes.add("Musulmán 05");
        superHeroes.add("Hulk 06");
        superHeroes.add("Flash 07");

        if (superHeroes.contains("Batman 03")){
            System.out.println("Batman esta en la fiesta");
        }

        superHeroes.remove("Hulk 06");

        if (!superHeroes.contains("Hulk 06")){
            System.out.println("Hulk 06 no esta en la fiesta");
        }

        superHeroes.add("Flash 07");

        // se revisa si la lista tiene alguna entidad
        if (superHeroes.isEmpty()){
            System.out.println("Se acabo la fiesta");
        }else{
            System.out.println("Todavía quedan " + superHeroes.size() + " en la fiesta");
        }

        System.out.println("Todavía se encuentran en la fiesta :");
        for (String superHeroe : superHeroes) {
            System.out.println(superHeroe);
        }















    }
}
