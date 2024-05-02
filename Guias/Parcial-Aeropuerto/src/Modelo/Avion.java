package Modelo;

public abstract class Avion {

    //Atributos
    private String nombre;
    private String marca;
    private double capacidadDeCombustible;
    private String tipoDeMotor;
    private int cantidadDeAsientos;
    private String patente;

    //construcotor

    public Avion(String nombre, String marca, double capacidadDeCombustible, String tipoDeMotor, int cantidadDeAsientos, String patente) {
        this.nombre = nombre;
        this.marca = marca;
        this.capacidadDeCombustible = capacidadDeCombustible;
        this.tipoDeMotor = tipoDeMotor;
        this.cantidadDeAsientos = cantidadDeAsientos;
        this.patente = patente;
    }


    //Getters y Setters


    public String getPatente() {
        return patente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public double getCapacidadDeCombustible() {
        return capacidadDeCombustible;
    }

    public String getTipoDeMotor() {
        return tipoDeMotor;
    }

    public int getCantidadDeAsientos() {
        return cantidadDeAsientos;
    }

    //Metodos

    public abstract String despegar();
    public abstract String aterrizar();
    public abstract String volar();

    //Sobreescrituras


    @Override
    public String toString() {
        return "\n" + "Avion{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", capacidadDeCombustible=" + capacidadDeCombustible +
                ", tipoDeMotor='" + tipoDeMotor + '\'' +
                ", cantidadDeAsientos=" + cantidadDeAsientos +
                '}';
    }
}
