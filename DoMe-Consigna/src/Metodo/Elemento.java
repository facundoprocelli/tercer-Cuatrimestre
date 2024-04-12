package Metodo;

public class Elemento {
    private String titulo;
    private int duracion;
    private  boolean loTengo;
    private String comentario;

    //Constructor

    public Elemento(){

    }

    public Elemento(String titulo, int duracion, String comentario) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.loTengo = true;
        this.comentario = comentario;
    }

    //Getters y Setters
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setLoTengo(boolean estado) {
        this.loTengo = estado;
    }

    public boolean isLoTengo() {
        return loTengo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    // Metodos

    public String imprimir(){
        return "Titulo: " + getTitulo() + "\nDuracion: " + getDuracion() + "\nDisponible: " + isLoTengo() + "\nComentario: " + this.getComentario();
    }
}
