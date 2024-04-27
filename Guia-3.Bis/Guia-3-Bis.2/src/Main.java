/*
Modele el objeto Empleado que posee las siguientes características, dni, nombre, apellido y salario.
El mismo debe contar con la posibilidad de calcular el salario anual. A su vez se requiere otro método
que permita aumentar el salario dependiendo del porcentaje que se le pase por parámetro. Considere crear
 un método que facilite imprimir por pantalla las características del objeto de la siguiente forma:
Empleado[dni=?, nombre=?, apellido=?, salario=?]
a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de 25000.
b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de 27500.
c. Imprima ambos objetos por pantalla.
d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el salario anual del mismo.

 */


import Modulo.Empleado;

public class Main {
    public static void main(String[] args) {

        Empleado empleado = new Empleado(23456245, "Carlos", "Gutierrez", 25000);
        Empleado empleado1 = new Empleado(342334123, "Ana", "Sánchez", 27500);

        System.out.println(empleado);
        System.out.println(empleado1);

        empleado.aumentarSalarioXPorcentaje(15);
        System.out.println(empleado.calcularSalarioAnual());
    }
}