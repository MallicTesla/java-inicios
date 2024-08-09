### Colecciones en Java

#### `List`
- **Permite elementos duplicados y mantiene el orden de inserción**.
- **Implementaciones comunes**:
  - **`ArrayList`:** 
    - Más eficiente para los métodos `get` y `set`, debido al acceso directo a los elementos.
  - **`LinkedList`:** 
    - Más eficiente para agregar o eliminar elementos en el inicio o en medio de la lista.
    - Menos eficiente para `get` y `set` debido a su estructura de nodos enlazados.
  - **`Vector`:** 
    - Es una clase sincronizada, segura para uso en entornos multihilo.
    - Menos utilizada en aplicaciones modernas debido a la disponibilidad de otras colecciones sincronizadas más eficientes.

#### `Set`
- **No permite elementos duplicados**.
- **Implementaciones comunes**:
  - **`HashSet`:** 
    - No garantiza el mantenimiento del orden de los elementos.
  - **`TreeSet`:** 
    - Mantiene los elementos ordenados según su orden natural (alfabético para cadenas) o utilizando un comparador personalizado.
  - **`LinkedHashSet`:** 
    - Mantiene el orden en el que se agregan los elementos.

#### `Map`
- **Asocia claves únicas con valores, formando pares clave-valor**.
- **Implementaciones comunes**:
  - **`HashMap`:** 
    - No garantiza el mantenimiento del orden de los pares clave-valor.
  - **`TreeMap`:** 
    - Ordena los pares clave-valor según el orden natural de las claves o utilizando un comparador personalizado.
  - **`LinkedHashMap`:** 
    - Mantiene el orden en el que se agregan los pares clave-valor.