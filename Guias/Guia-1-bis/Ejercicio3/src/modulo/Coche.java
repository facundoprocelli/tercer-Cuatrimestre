package modulo;

public class Coche {

    private String marca;
    private String modelo;
    private int anioFabricacion;
    private double velocidadActual;

    public  Coche(){
        this.marca = "sin marca";
        this.modelo = "Sin modelo";
        this.anioFabricacion = 0;
        this.velocidadActual = 0;
    }
    public Coche(String p_marca, String p_modelo, int p_anioFabricacion) {
        this.marca = p_marca;
        this.modelo = p_modelo;
        this.anioFabricacion = p_anioFabricacion;
        this.velocidadActual = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }


    public void acelerar(double incremento){
        this.velocidadActual += incremento;
    }

    public  void frenar(double decremento){
        this.velocidadActual -= decremento;
    }

    public String obtenerInformacion(){

        return "El auto es un " + getMarca() + " " + getModelo() + " del año " + getAnioFabricacion() + " y actualemnte va a " + getVelocidadActual() + "kmh.";
    }

    public String obtenerInformacionReducida(){
        return " - " + getMarca() + " " + getModelo() + " del año " + getAnioFabricacion();
    }
}
