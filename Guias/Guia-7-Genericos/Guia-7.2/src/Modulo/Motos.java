package Modulo;

public class Motos {

    private String cilindradas;
    private String patente;


    public Motos(String cilindradas, String patente) {
        this.cilindradas = cilindradas;
        this.patente = patente;
    }

    public String getCilindradas() {
        return cilindradas;
    }

    public String getPatente() {
        return patente;
    }
}
