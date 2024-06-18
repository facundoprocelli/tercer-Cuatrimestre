package Exceptions;

public class PersonajeNoEncontradoException extends  Exception {

    public PersonajeNoEncontradoException() {
        super();
    }

    public PersonajeNoEncontradoException(String nombre){
        super("El personaje " + nombre + " no fue encontrado");
    }

}
