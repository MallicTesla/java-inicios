En Java, una clase puede heredar de una sola clase abstracta, pero tiene la capacidad de implementar múltiples interfaces.

En una interfaz, los atributos son implícitamente public, static, y final, lo que significa que siempre son constantes. No se pueden declarar atributos private en una interfaz.

Las interfaces no pueden tener métodos getter y setter tradicionales porque no pueden almacenar estados o atributos modificables. Sin embargo, desde Java 8, es posible definir métodos por defecto (default methods) en una interfaz, que pueden proporcionar comportamientos similares a los getters y setters, pero estos no pueden modificar estados internos ya que las interfaces no tienen atributos no estáticos.

Las interfaces no pueden tener constructores porque no son instanciables. Solo pueden ser implementadas por clases o extendidas por otras interfaces.

Todos los métodos en una interfaz son implícitamente public y abstract, a menos que se declaren como default o static.

Desde Java 9, las interfaces pueden tener métodos privados, pero estos no son accesibles fuera de la interfaz y se usan para evitar la duplicación de código dentro de los métodos por defecto.

Una interfaz puede extender una o más interfaces, heredando sus métodos y atributos.