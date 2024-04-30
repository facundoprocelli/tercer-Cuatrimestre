/*
 Construir una interfaz Relaciones que incluya los siguientes métodos

// Devuelve verdadero si a es mayor que b
boolean esMayor(Object b) ;

 // Devuelve verdadero si a es menor que b
boolean esMenor(Object b) ;

 // Devuelve verdadero si a es igual que b
boolean esIgual(Object b) ;

Crear una clase Numero que tendrá un atributo entero e implementa dicha interfaz. Diseñar un Main que declare dos o más objetos del tipo Numero y usar los métodos correspondientes. Mostrar salida por pantalla.

 */


public class Main {
    public static void main(String[] args) {
        Numeros num = new Numeros(3);
        Numeros num2 = new Numeros(5);


        System.out.println(num.esMayor(num2));
        System.out.println(num.esMenor(num2));
        System.out.println(num.esIgual(num2));


    }


}