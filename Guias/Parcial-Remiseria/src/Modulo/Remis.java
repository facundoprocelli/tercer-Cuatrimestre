package Modulo;

public class Remis extends Vehiculo{

    private double tarifaXCuadra;

    public Remis(String marca, String modelo, String tipoDeCombustible, String patente, double tarifaXCuadra) {
        super(marca, modelo, tipoDeCombustible, patente);
        this.tarifaXCuadra = tarifaXCuadra;
    }

    public double getTarifaXCuadra() {
        return tarifaXCuadra;
    }

    //Metodos


    @Override
    public double calcularTarifa(double distancia) {
         return  getTarifaXCuadra() * (distancia * 10);
    }

    //Sobreescrituras


    @Override
    public String toString() {
        return super.toString() + "Remis{" +
                "tarifaXCuadra=" + tarifaXCuadra +
                '}';
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
