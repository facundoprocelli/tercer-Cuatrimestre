package Modelo;

public class esMenorException extends Exception {

    public esMenorException() {
    }

    public esMenorException(int edad) {
        super("No puedes entrar en la lista porque tienes " + edad + " y eres menor");
    }
}
