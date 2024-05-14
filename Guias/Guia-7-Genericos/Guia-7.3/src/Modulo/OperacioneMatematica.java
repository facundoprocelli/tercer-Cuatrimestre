package Modulo;

/*
Crear una clase genérica llamada "OperacionMatematica" que pueda realizar operaciones
matemáticas simples (suma, resta, multiplicación, división) con cualquier tipo de número
(enteros, decimales, etc.). Debe tener métodos para cada operación y para establecer los
números de entrada. Haz pruebas de tu clase con diferentes tipos de números.
 */
//Luego de probar, no pude llegar  a ninguna solucion, se me ocurrio usar la clase Number pero de todas formas no nos permite operar
//Con los operadores aritmeticos, asi que sigo adelante y le pregunto a gonza despues

public class OperacioneMatematica<E extends Number> extends Number {


    public E sumar(E num1, E num2){

        return num1 + num2;
    }


    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}
