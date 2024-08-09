
import java.util.LinkedHashMap;
import java.util.Map;

public class UsandoMap {
    public static void main(String[] args) throws Exception {
        // Map es una colección que asocia claves con valores. Cada clave en un Map es única, y cada clave puede estar asociada con un solo valor.

        // `HashMap` es una implementación de `Map` que no respeta ningún orden de los pares clave-valor.
        // Map<String, Double> inventario = new HashMap<>();

        // `TreeMap` ordena los pares clave-valor según el orden natural de las claves (alfabético para cadenas)
        // o utilizando un comparador personalizado si se proporciona.
        // Map<String, Double> inventario = new TreeMap<>();

        // `LinkedHashMap` mantiene el orden en el que se agregan los pares clave-valor.
        Map<String, Double> inventario = new LinkedHashMap<>();


                    // {clave, valor}
        inventario.put ("Banana", 50.0);
        inventario.put ("Tomete", 100.1);
        inventario.put ("Papa", 30.2);
        inventario.put ("Palta", 89.3);
        inventario.put ("Frutilla", 50.4);

        System.out.println("Inventario:");

        // keySet() devuelve un arreglo solo con las claves
        for (String fruta : inventario.keySet()){
            System.out.println(fruta + ": $ " + inventario.get(fruta));
        }

        System.out.println("---------------------------------------");

        String buscar = "Frutilla";
        if (inventario.containsKey(buscar)){
            System.out.println(buscar + " esta en el inventario ");
        }else{
            System.out.println("No tenemos " + buscar);
        }

        System.out.println("---------------------------------------");

        String sinStock = "Frutilla";
        inventario.remove(sinStock);
        System.out.println("Nos quedamos sin :" + sinStock);

        System.out.println("En el inventario quedan " + inventario.size() + " artículos diferentes: ");
        for (String fruta : inventario.keySet()){
            System.out.println(fruta + ": $ " + inventario.get(fruta));
        }














    }
}
