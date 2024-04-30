package modelo;

public class Tienda {

    private String nombre;
    private String[] productos;
    private int pos;


    public Tienda() {
        this.nombre = "Sin nombre";
        this.productos = new String[3];
        this.pos = 0;
    }

    public Tienda(String p_nombre, String[] p_productos, int p_pos) {
        this.nombre = p_nombre;
        this.productos = p_productos;
        this.pos = p_pos;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getProductos() {
        return productos;
    }

    public void setProductos(String[] productos) {
        this.productos = productos;
    }


    public void agregarProducto(String producto) {

        this.productos[pos] = producto;
        this.pos++;

    }

    public String mostrarProductos() {
        String mensaje = "";
        for (int i = 0; i < productos.length; i++) {

            mensaje += this.productos[i] + "\n";
        }

        return mensaje;
    }
}
