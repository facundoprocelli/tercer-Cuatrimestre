package Modulo;

public class CarritoDeCompra  {
    private int cantidadDeProductos;
    private String  tiposDeProductos;

    //Constructor


    public CarritoDeCompra(int cantidadDeProductos, String tiposDeProductos) {
        this.cantidadDeProductos = cantidadDeProductos;
        this.tiposDeProductos = tiposDeProductos;
    }

    public int getCantidadDeProductos() {
        return cantidadDeProductos;
    }

    public void setCantidadDeProductos(int cantidadDeProductos) {
        this.cantidadDeProductos = cantidadDeProductos;
    }

    public String getTiposDeProductos() {
        return tiposDeProductos;
    }

    public void setTiposDeProductos(String tiposDeProductos) {
        this.tiposDeProductos = tiposDeProductos;
    }

    @Override
    public String toString() {
        return "CarritoDeCompra{" +
                "cantidadDeProductos=" + cantidadDeProductos +
                ", tiposDeProductos='" + tiposDeProductos + '\'' +
                '}';
    }
}
