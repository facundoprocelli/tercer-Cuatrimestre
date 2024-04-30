package Modelo;

public class CD extends Elemento {

    //Atributos
    private int cantidadDeCanciones;

    //Constructor
    public CD(int cantidadDeCanciones, String titulo) {
        super(titulo);
        this.cantidadDeCanciones = cantidadDeCanciones;
    }

    // Guetter y setters
    public int getCantidadDeCanciones() {
        return cantidadDeCanciones;
    }

    public void setCantidadDeCanciones(int cantidadDeCanciones) {
        this.cantidadDeCanciones = cantidadDeCanciones;
    }

    // Metodos



    @Override
    public String getTitulo(){
        return "El disco se llama: " + super.getTitulo(); // Pongo la palaba super porque sino es como si fuese un llamado local
    }

    @Override
    public void setTitulo(String titulo){
        super.setTitulo("CD:  " + titulo);
    }

}
