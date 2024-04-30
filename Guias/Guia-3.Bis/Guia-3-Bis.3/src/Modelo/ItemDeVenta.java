package Modelo;

public class ItemDeVenta {

    //Atributos
    private int id;
    private String descripcion;
    private int cantidad;
    private double precioXUnidad;

    // Constructor


    public ItemDeVenta(int id, String descripcion, int cantidad, double precioXUnidad) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioXUnidad = precioXUnidad;
    }

    // Metodos

    public double precioTotal(int unidades){

        return this.precioXUnidad * unidades;
    }


    // Sobreescritura


    @Override
    public String toString() {
        return "ItemDeVenta{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", precioXUnidad=" + precioXUnidad +
                '}';
    }
}
