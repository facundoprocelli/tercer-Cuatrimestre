package modelo;

public class Compra {

    private String producto;
    private int precio;
    private int unidades;



    public Compra(){
        this.producto = "No hay producto";
        this.precio = 0;
        this.unidades = 0;
    }

    public Compra(String p_producto, int p_precio, int p_unidades) {
        this.producto = p_producto;
        this.precio = p_precio;
        this.unidades = p_unidades;
    }

    // Setters


    public void setPrecioProducto(int precio) {
        this.precio = precio;
    }

    public void setNombreProducto(String producto) {
        this.producto = producto;
    }

    public void setUnidadesProducto(int unidades) {
        this.unidades = unidades;
    }

    // Getters


    public int getPrecioProducto() {
        return precio;
    }

    public int getUnidadesProducto() {
        return unidades;
    }

    public String getNombreProducto() {
        return producto;
    }

    public int getPrecioFinal(){
        return getUnidadesProducto() * getPrecioProducto();
    }


    public String getInfo(){
        return "Esta llevando " + getUnidadesProducto() + " de " + getNombreProducto() + " con un precio de " + getPrecioProducto() + " X unidad " + " y un precio total de "+ getPrecioFinal();
    }
}
