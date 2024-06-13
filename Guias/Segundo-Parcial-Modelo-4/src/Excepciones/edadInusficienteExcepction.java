package Excepciones;

public class edadInusficienteExcepction  extends Exception{

    public edadInusficienteExcepction() {
        super();
    }

    public edadInusficienteExcepction(int edad, int edadMin){
        super("La edad " + edad + "no llega a los " + edadMin);
    }
}
