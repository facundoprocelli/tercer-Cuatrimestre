package Exceptions;

public class sobrePasaCantidadException extends Exception{

    public sobrePasaCantidadException(){
        super();
    }

    public sobrePasaCantidadException(String nombreTabla, String clave, int cantidad){
        super("Tabla " + nombreTabla + ", clave " + clave + " cantiadad " + cantidad );
    }
}
