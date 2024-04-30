import Modelo.Hora;

/*
Modele el objeto Hora, teniendo en cuenta sus atributos, hora, minuto y segundo.
Tenga en cuenta el rango de valores aceptados para cada uno de estos.
a. Hora: 0 ... 23
b. Minuto: 0 ... 59
c. Segundo: 0 ... 59
● Considere el siguiente comportamiento:
a. Un método que imprima la hora bajo el siguiente formato hh:mm:ss usando
zero a la izquierda ejemplo 13:04:22 .
b. Un método que avance en 1 segundo y devuelva la instancia del objeto.
c. Un método que retroceda en 1 segundo y devuelva la instancia del objeto.
d. Instanciar el objeto y probar los métodos creados.

 */

public class Main {
    public static void main(String[] args) {
        Hora hora = new Hora();
        hora.ingresarHora("23:59:59");
        System.out.println(hora);
        Hora nuevaHora = hora.avanzarSegundo(1234);
        System.out.println(nuevaHora);
    }
}