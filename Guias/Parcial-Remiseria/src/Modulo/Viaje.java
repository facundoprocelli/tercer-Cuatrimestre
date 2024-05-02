package Modulo;

public class Viaje {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private double distancia;
    private double costoDelViaje;

    // Construcotres


    public Viaje(Cliente cliente, Vehiculo vehiculo, double distancia, double costoDelViaje) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.distancia = distancia;
        this.costoDelViaje = costoDelViaje;
    }

    public Viaje(){
        this.cliente = null;
        this.vehiculo = null;
        this.distancia = 0;
        this.costoDelViaje =0;
    }

    //Getters y Setters


    public Cliente getCliente() {
        return cliente;
    }

    public double getCostoDelViaje() {
        return costoDelViaje;
    }

    public double getDistancia() {
        return distancia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    protected void setCostoDelViaje(double costoDelViaje) {
        this.costoDelViaje = costoDelViaje;
    }

    protected void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    protected void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void pedirViajeCliente(){
        if(cliente != null) {
            setDistancia(cliente.pedirViaje());
        }
    }

    public void calcularCostoFinalDelViaje(){
        if(vehiculo != null) {
            setCostoDelViaje(vehiculo.calcularTarifa(distancia));
        }
    }

    @Override
    public String toString() {
        return "Viaje{" +
                "cliente=" + cliente +
                ", vehiculo=" + vehiculo +
                ", distancia=" + distancia +
                ", costoDelViaje=" + costoDelViaje +
                '}';
    }
}
