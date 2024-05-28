package Exceptions;

public class AceitunasException extends Exception {
    //Sigue siendo una clase con todos los comportamientos

    /*
    private int cantidadDeAceitunas;

    public AceitunasException(String mensaje, int cantidadDeAceitunas) {
        super(mensaje);
        this.cantidadDeAceitunas = cantidadDeAceitunas;
    }

    public int getCantidadDeAceitunas() {
        return cantidadDeAceitunas;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + getCantidadDeAceitunas();
    }
    */

public AceitunasException (String noAceituna){
    super(noAceituna);
}



}
