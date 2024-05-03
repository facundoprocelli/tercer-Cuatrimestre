package Modulo;

public abstract class Entrada {

    //Atributos
    private int id;
    private double precio;
    private boolean disponible;

    //construcotr

    public Entrada(int id, double precio) {
        this.id = id;
        this.precio = precio;
        this.disponible = true;
    }


    //Getters y setters

    public int getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    protected void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    protected void setPrecio(double precio) {
        this.precio = precio;
    }

    // MEtodos

    public abstract String obtenerTipo(); // Retorna un string del tipo de entrada
    public abstract double obtenerPrecioTotal(double precio); // Esta se actualiza con el precio de la entrada de abajo

    //Sobreescrituras


    @Override
    public String toString() {
        return "\n" + "Entrada{" +
                "id=" + id +
                ", precio=" + precio +
                ", disponible=" + disponible +
                '}';
    }
}
