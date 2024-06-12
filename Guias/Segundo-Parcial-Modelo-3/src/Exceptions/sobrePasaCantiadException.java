package Exceptions;

public class sobrePasaCantiadException  extends Exception{

    public sobrePasaCantiadException(int capacidad) {
        super("La capacidad no llega al minimo establecido: " + capacidad);
    }

    public sobrePasaCantiadException(String mensaje) {
        super(mensaje);
    }
}
