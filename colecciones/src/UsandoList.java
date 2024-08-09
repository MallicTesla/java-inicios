import java.util.List;
import java.util.Vector;

public class UsandoList {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a a fiesta de los superhéroes");

        // `ArrayList` es más eficiente para los métodos `get` y `set`, ya que tiene acceso directo a los elementos.
        // List<String> superHeroes = new ArrayList<>();

        // `LinkedList` es más eficiente al modificar (agregar o eliminar) elementos al inicio o en medio de la lista,
        // pero es menos eficiente para `get` y `set` debido a su estructura de nodos enlazados.
        // List<String> superHeroes = new LinkedList<>();

        // `Vector` es una clase sincronizada, lo que la hace segura para su uso en entornos multihilo.
        // Sin embargo, en aplicaciones modernas, es preferible utilizar colecciones sincronizadas más eficientes.
        List<String> superHeroes = new Vector<>();

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

        System.out.println(superHeroes.get(4) + " es la bomba de la fiesta");

        // se elimina por índice
        superHeroes.remove(5);

        if (!superHeroes.contains("Hulk 06")){
            System.out.println("Hulk 06 no esta en la fiesta");
        }

        // se puede remplazar un elemento a trabes de su índice
        superHeroes.set(0, "Tony Strak 01");
        System.out.println("Iron Man 01 se saca el traje y revela que es " + superHeroes.get(0));

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
