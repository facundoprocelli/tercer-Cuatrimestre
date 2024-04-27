import Modulo.Rectangulo;

//Modele el objeto Rectángulo con sus propiedades, ancho y alto. Ambas con valor 1,0 por defecto.
// Este objeto debe exponer los getters y setters necesarios. También debe contar con un método para calcular el área
// y perímetro del mismo. Ejecute las siguientes pruebas:
//a. Inicializar un objeto Rectángulo estableciendo ancho y alto.
//b. Imprimir por pantalla el alto y ancho.
//c. Imprimir por pantalla el área y perímetro.
//d. Modificar el alto y el ancho de la instancia.
//e. Imprimir por pantalla nuevamente el cálculo del área y perímetro.
//f. Inicializar un objeto Rectángulo con los valores por defecto y verificar.

public class Main {
    public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo(20,12);
        System.out.println(rectangulo);
        System.out.println(rectangulo.mostrarAreaYPerimetro());
        rectangulo.setAltura(20);
        rectangulo.setBase(23);
        System.out.println(rectangulo);
        System.out.println(rectangulo.mostrarAreaYPerimetro());
        Rectangulo rectangulo1 = new Rectangulo();
        System.out.println(rectangulo1);
    }
}