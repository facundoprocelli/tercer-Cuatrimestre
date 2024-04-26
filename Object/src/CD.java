public class CD extends Elemento{

    private int cantCanciones;
    public CD(int id, String titulo, int cantCanciones) {
        super(id, titulo);
        this.cantCanciones = cantCanciones;
    }

    public int getCantCanciones() {
        return cantCanciones;
    }



    @Override
    public String toString() {
        return super.toString() + "\nCantidad de canciones: " + getCantCanciones() + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
